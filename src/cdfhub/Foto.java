package cdfhub;

import java.time.LocalDate;

public class Foto extends Postagem {

    private double tamanhoMB;
    private int tamanhoPixels;

    Foto (double tamanhoMB, LocalDate dataPostagem) {
        super(dataPostagem);
        this.tamanhoMB = tamanhoMB;
    }

    public double getTamanhoPixels() {
        return tamanhoPixels;
    }

    public double getTamanhoMB() {
        return tamanhoMB;
    }
    
    public int recortar(){
        return 0;
    }

    @Override
    public double calcularAlcance() {
        return getCurtidas() * 3 + getCompartilhamentos() * 6
                + getComentarios().size() * 3;
    }

}
