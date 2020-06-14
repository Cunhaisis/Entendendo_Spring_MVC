package com.devisis.springwebmvc.model;

public class Filme {

    private String filme;

    private String ano;

    public Filme (final String filme, final String ano) {
        this.filme = filme;
        this.ano = ano;
    }

    public Filme () {

    }

    public String getFilme() {

        return filme;
    }

    public void setFilme(String filme) {

        this.filme = filme;
    }

    public String getAno() {

        return ano;
    }

    public void setAno(String ano) {

        this.ano = ano;
    }
}

