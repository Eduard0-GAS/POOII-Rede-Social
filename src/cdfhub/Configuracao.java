package cdfhub;

import javax.swing.JOptionPane;

public class Configuracao {

    private String modo = "claro";
    private boolean autentificacaoDuasEtapas = false;

    public boolean ativarDuasEtapas() {
        return this.autentificacaoDuasEtapas = true;
    }

    public void alterarModo() {
        String md;
        System.out.println("Você está no modo " + getModo());

        md = JOptionPane.showInputDialog("Digite 1 para modo Claro | 2 para o modo Escuro");
        if (md == null) return;
        switch (md) {
            case ("1"):
                System.out.println("Modo claro");
                modo = "Claro";
                break;
            case ("2"):
                System.out.println("Modo Escuro");
                modo = "Escuro";
                break;
        }
    }

    public String getModo() {
        return modo;
    }

    public boolean isAutentificacaoDuasEtapas() {
        return autentificacaoDuasEtapas;
    }
    
}
