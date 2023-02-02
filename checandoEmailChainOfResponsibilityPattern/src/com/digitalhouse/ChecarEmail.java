package com.digitalhouse;

public class ChecarEmail {

    Gerenciador gerencia;

    public ChecarEmail() {
        this.gerencia = new GerenciadorGerencia();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador tecnico = new GerenciadorTecnico();
        Gerenciador spam = new GerenciadorSpam();

        this.gerencia.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnico);
        tecnico.setGerenciadorSeguinte(spam);
    }

    public  void verificar(Mail mail){
        gerencia.verificar(mail);
    }
}
