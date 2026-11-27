package cdfhub;

import java.time.LocalDate;
import exceptions.*;

public class Texto extends Postagem {

    private int quantidadeCaracteres = 280;
    private String texto;

    public Texto(String texto, LocalDate dataPostagem) {
        super(dataPostagem);
        this.texto = texto;
    }

    public void digitar(String texto) throws TextoVazioException {
        if (texto == null || texto.trim().isEmpty()) {
            throw new TextoVazioException("O texto não pode estar vazio.");
        }

        if (texto.length() > quantidadeCaracteres) {
            throw new IllegalArgumentException(
                    "O texto não pode ter mais de " + quantidadeCaracteres + " caracteres."
            );
        }

        this.texto = texto;
    }

    public int getQuantidadeCaracteres() {
        return quantidadeCaracteres;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public double calcularAlcance() {
        return 0;
    }

    @Override
    public void compartilhar() {

    }

    @Override
    public void curtir() {

    }

    @Override
    public void denunciar() {

    }
}
