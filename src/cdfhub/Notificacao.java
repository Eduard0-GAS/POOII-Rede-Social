package cdfhub;

import java.time.LocalDateTime;

public class Notificacao {
    private String texto;
    private LocalDateTime dataHora;

    public Notificacao(String texto) {
        this.texto = texto;
        this.dataHora = LocalDateTime.now();
    }

    public String getTexto() {
        return texto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "Notificacao{" + "texto=" + texto + ", dataHora=" + dataHora + '}';
    }
    
}
