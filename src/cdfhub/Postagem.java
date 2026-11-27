package cdfhub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Postagem implements Moderavel {

    private Perfil autor;
    private LocalDate dataPostagem;
    private List<Comentario> comentarios;

    public Postagem(LocalDate dataPostagem) {
        this.dataPostagem = dataPostagem;
        this.comentarios = new ArrayList<>();
    }

    public Perfil getAutor() {
        return autor;
    }

    public LocalDate getDataPostagem() {
        return dataPostagem;
    }

    public abstract double calcularAlcance();
    
    public void fazerComentario (Comentario c) {
        comentarios.add(c);
    }

    @Override
    public abstract void compartilhar();

    @Override
    public abstract void curtir();

    @Override
    public abstract void denunciar();
    
}
