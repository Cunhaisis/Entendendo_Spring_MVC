package com.devisis.springwebmvc.repository;

import com.devisis.springwebmvc.model.Filme;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmeRepository {

    private List<Filme> filme;

    public FilmeRepository (){
        filme = new ArrayList<>();
        filme.add(new Filme("Vingadores", "2012"));
        filme.add(new Filme("Thor Ragnarok", "2017"));
        filme.add(new Filme("Pantera Negra", "2018"));
    }

    public List<Filme> getAllFilme() {

        return filme;
    }
    public void add (final Filme filme){
        this.filme.add(filme);

    }

}
