package cdfhub;

import java.time.LocalDate;

public class Comentario {
    
    private String texto;
    private Postagem postPertence;
    private Perfil autor; 
    private LocalDate dataPostagem;

    public Comentario(String texto, Postagem postPertence, Perfil autor, LocalDate dataPostagem) {
        this.texto = texto;
        this.postPertence = postPertence;
        this.autor = autor;
        this.dataPostagem = dataPostagem;
    }

    public String getTexto() {
        return texto;
    }

    public Postagem getPostPertence() {
        return postPertence;
    }

    public Perfil getAutor() {
        return autor;
    }

    public LocalDate getDataPostagem() {
        return dataPostagem;
    }
    
    public String editarTexto (String texto) {
        return texto;
    }
}