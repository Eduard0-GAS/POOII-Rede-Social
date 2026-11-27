
package cdfhub;

import java.util.ArrayDeque;
import java.util.Queue;


public class Perfil {
    
    private String apelido; 
    private Configuracao configuracao;
    private Queue<Notificacao> notificacao;

    Perfil (String apelido) {
        this.apelido = apelido;
        this.configuracao = new Configuracao();
        this.notificacao = new ArrayDeque();
    }
    
    public void alterarConfiguracao () {
        // seria colocado alguma forma para escolher o quer alterar.
        Perfil.this.configuracao.alterarModo();
        
        Perfil.this.configuracao.ativarDuasEtapas();
    }
    
    public void receberNotificacao (Notificacao n) {
           notificacao.add(n);
    }
    
    public Notificacao lerNotificacao () {
        return notificacao.poll();
    }
    
    public void consultarQuantidadeNot (Notificacao n) {
           notificacao.size();
    }

    public String getApelido() {
        return apelido;
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    public Queue<Notificacao> getNotificacao() {
        return notificacao;
    }

    @Override
    public String toString() {
        return "Perfil{" + "apelido=" + apelido + ", configuracao=" + configuracao + ", notificacao=" + notificacao + '}';
    }
    
}
