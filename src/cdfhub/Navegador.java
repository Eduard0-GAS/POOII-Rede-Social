package cdfhub;

import java.util.Deque;

public class Navegador {
    
    private String perfilAtual;
    private Deque <String> historico;
    private Deque <String> avancar; 

    public Navegador(String perfilAtual, Deque<String> historico, Deque<String> avancar) {
        this.perfilAtual = perfilAtual;
        this.historico = historico;
        this.avancar = avancar;
    }

    public String getPerfilAtual() {
        return perfilAtual;
    }

    public Deque<String> getHistorico() {
        return historico;
    }

    public Deque<String> getAvancar() {
        return avancar;
    }
    
    
    
    public void navegar(String perfil) {
        historico.push(perfilAtual);
        perfilAtual = perfil;
        avancar.clear();
    }

    public void voltar() {
        if (!historico.isEmpty()) {
            avancar.push(perfilAtual);
            perfilAtual = historico.pop();
        }
    }

    public void avancar() {
        if (!avancar.isEmpty()) {
            historico.push(perfilAtual);
            perfilAtual = avancar.pop();
        }
    }
}
