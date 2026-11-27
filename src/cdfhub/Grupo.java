package cdfhub;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Perfil> participantes;

    public Grupo(String nome, List<Perfil> participantes) {
        this.nome = nome;
        this.participantes = new ArrayList<>(participantes);
    }
    
    public void adicionarPerfil (Perfil p ) {
        if (!participantes.contains(p)) {
            participantes.add(p);
        }
    }
    public List<Perfil> getParticipantes() {
        return participantes;
    }
}
