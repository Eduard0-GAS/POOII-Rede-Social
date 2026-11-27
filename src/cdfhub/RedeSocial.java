package cdfhub;

import java.util.HashMap;
import java.util.Map;

public class RedeSocial {
    
    private String nome;
    private Map<String, Perfil> perfis;

    public RedeSocial(String nome) {
        this.nome = nome;
        this.perfis = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Perfil> getPerfis() {
        return perfis;
    }
    
    public void cadastrarPefil (Perfil p) throws ApelidoJaExisteException {
        if (p.getApelido().equals(this.nome)) {
            throw new ApelidoJaExisteException("esse apelido ja existe!");
        }
        perfis.put(p.getApelido(), p)
        ;
    }
    
    public Perfil buscarPerfil (String apelido) {
        return perfis.get(apelido);
    }
    
    public boolean existePerfil (Perfil p) {
        return perfis.containsValue(p);
    }
    
}
