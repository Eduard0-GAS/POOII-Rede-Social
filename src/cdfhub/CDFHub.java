package cdfhub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import exceptions.ApelidoJaExisteException;
import exceptions.TextoVazioException;

public class CDFHub {

    public static void main(String[] args) {
        System.out.println("===== CDFHub - Rede Social =====");
        LocalDate hoje = LocalDate.now();
        RedeSocial rede = new RedeSocial("CDFHub");
        Perfil eduardo = new Perfil("Eduardo");
        Perfil maicon = new Perfil("Maicon");
        Perfil maria = new Perfil("Maria");

        // R7d - Map
        System.out.println("\n===== CADASTRO DE PERFIS =====");
        try {
            rede.cadastrarPefil(eduardo);
            rede.cadastrarPefil(maicon);
            rede.cadastrarPefil(maria);
            System.out.println("Perfis cadastrados!");
        } catch (ApelidoJaExisteException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Perfis: " + rede.getPerfis().keySet());
        System.out.println("Perfil encontrado: " + rede.buscarPerfil("Eduardo").getApelido());

        // R2 - Agregacao / R7a - List / R8 - equals e hashCode
        System.out.println("\n===== GRUPO =====");
        Grupo grupo = new Grupo("Sistemas de Informacao", new ArrayList<>());
        grupo.adicionarPerfil(eduardo);
        grupo.adicionarPerfil(maicon);
        grupo.adicionarPerfil(maria);
        grupo.adicionarPerfil(new Perfil("Eduardo")); // Duplicado: nao entra
        for (Perfil p : grupo.getParticipantes()) {
            System.out.println("Participante: " + p.getApelido());
        }

        // R2 - Composicao
        System.out.println("\n===== CONFIGURACAO =====");
        eduardo.getConfiguracao().ativarDuasEtapas();
        System.out.println("Usuario: " + eduardo.getApelido());
        System.out.println("Modo: " + eduardo.getConfiguracao().getModo());
        System.out.println("Autenticacao em duas etapas: "
                + eduardo.getConfiguracao().isAutentificacaoDuasEtapas());

        // R3 - Classe abstrata
        System.out.println("\n===== CRIACAO DE POSTAGENS =====");
        Texto texto = new Texto("Bem-vindos ao CDFHub!", hoje);
        Foto foto = new Foto(4.5, hoje);
        Video video = new Video(60.0, hoje);
        texto.setAutor(eduardo);
        foto.setAutor(maicon);
        video.setAutor(maria);
        List<Postagem> postagens = new ArrayList<>();
        postagens.add(texto);
        postagens.add(foto);
        postagens.add(video);

        // R4 - Interface
        System.out.println("\n===== INTERACOES =====");
        Moderavel interacao1 = texto;
        Moderavel interacao2 = foto;
        Moderavel interacao3 = video;
        interacao1.curtir();
        interacao1.compartilhar();
        interacao2.curtir();
        interacao2.curtir();
        interacao3.curtir();
        interacao3.compartilhar();
        interacao3.denunciar();

        // R5 - Polimorfismo
        System.out.println("\n===== ALCANCE DAS POSTAGENS =====");
        for (Postagem postagem : postagens) {
            System.out.println("Tipo: " + postagem.getClass().getSimpleName());
            System.out.println("Autor: " + postagem.getAutor().getApelido());
            System.out.println("Alcance: " + postagem.calcularAlcance());
            System.out.println("--------------------");
        }

        // R2 - Associacao / R7a - List
        System.out.println("\n===== COMENTARIOS =====");
        Comentario comentario = new Comentario("Muito bom esse projeto!", texto, maicon, hoje);
        texto.fazerComentario(comentario);
        for (Comentario c : texto.getComentarios()) {
            System.out.println(c.getAutor().getApelido() + ": " + c.getTexto());
        }

        // R7b - Fila (FIFO)
        System.out.println("\n===== NOTIFICACOES =====");
        eduardo.receberNotificacao(new Notificacao("Maicon comentou sua postagem."));
        eduardo.receberNotificacao(new Notificacao("Maria curtiu sua postagem."));
        System.out.println("Proxima notificacao: " + eduardo.getNotificacao().peek().getTexto());
        System.out.println("Quantidade: " + eduardo.consultarQuantidadeNot());
        System.out.println("Lendo notificacoes:");
        while (!eduardo.getNotificacao().isEmpty()) {
            System.out.println(eduardo.lerNotificacao().getTexto());
        }

        // R7c - Pilha (LIFO)
        System.out.println("\n===== NAVEGACAO =====");
        Navegador navegador = new Navegador("Eduardo", new ArrayDeque<>(), new ArrayDeque<>());
        navegador.navegar("Maicon");
        navegador.navegar("Maria");
        System.out.println("Perfil atual: " + navegador.getPerfilAtual());
        System.out.println("Perfil anterior: " + navegador.getHistorico().peek());
        navegador.voltar();
        System.out.println("Apos voltar: " + navegador.getPerfilAtual());
        navegador.avancar();
        System.out.println("Apos avancar: " + navegador.getPerfilAtual());

        // R6 - Excecoes checked e unchecked
        System.out.println("\n===== TESTE DE EXCECOES =====");
        try {
            rede.cadastrarPefil(new Perfil("Eduardo"));
        } catch (ApelidoJaExisteException e) {
            System.out.println("Excecao verificada: " + e.getMessage());
        }
        try {
            texto.digitar("");
        } catch (TextoVazioException e) {
            System.out.println("Excecao nao verificada: " + e.getMessage());
        }
        System.out.println("\n===== SISTEMA FINALIZADO =====");
    }
}
