
package cdfhub;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;


public class Perfil {
    
    private String apelido; 
    private Configuracao configuracao;
    private Queue<Notificacao> notificacao;

    public Perfil(String apelido) {
        this.apelido = apelido;
        this.configuracao = new Configuracao();
        this.notificacao = new LinkedList<>();
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
    
    public int consultarQuantidadeNot() {
        return notificacao.size();
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Perfil outro = (Perfil) obj;
        return Objects.equals(apelido, outro.apelido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apelido);
    }
}
