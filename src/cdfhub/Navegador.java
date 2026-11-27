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
    
    
    
}
