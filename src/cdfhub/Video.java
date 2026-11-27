package cdfhub;

import java.time.LocalDate;

public class Video extends Postagem {

    private double duracao;
    private double velocidade = 1.0;

    public Video(double duracao, LocalDate dataPostagem) {
        super(dataPostagem);
        this.duracao = duracao;
    }

    public double getVelocidade() {
        return velocidade;
    }
    
    public double getDuracao() {
        return duracao;
    }

    @Override
    public double calcularAlcance() {
        return 0;
    }

    public void aumentarVelocidade() {
        if (velocidade < 2.0) {
            velocidade += 0.25;
        }
    }

    public void diminuirVelocidade() {
        if (velocidade > 0.25) {
            velocidade -= 0.25;
        }
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
