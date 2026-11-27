package cdfhub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Postagem implements Moderavel {

    private Perfil autor;
    private LocalDate dataPostagem;
    private List<Comentario> comentarios;
    private int curtidas;
    private int compartilhamentos;
    private int denuncias;

    public Postagem(LocalDate dataPostagem) {
        this.dataPostagem = dataPostagem;
        this.comentarios = new ArrayList<>();
    }

    public Perfil getAutor() {
        return autor;
    }

    public void setAutor(Perfil autor) {
        this.autor = autor;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getCompartilhamentos() {
        return compartilhamentos;
    }

    public int getDenuncias() {
        return denuncias;
    }

    public LocalDate getDataPostagem() {
        return dataPostagem;
    }

    public abstract double calcularAlcance();
    
    public void fazerComentario (Comentario c) {
        comentarios.add(c);
    }

    @Override
    public void compartilhar() {
        compartilhamentos++;
    }

    @Override
    public void curtir() {
        curtidas++;
    }

    @Override
    public void denunciar() {
        denuncias++;
    }
    
}
