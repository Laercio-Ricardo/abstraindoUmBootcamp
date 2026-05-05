package br.com.abstraindobootcamp.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {


    private String nome;
    private String descricao;
    private final   LocalDate dataInicial = LocalDate.now();
    private final   LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new HashSet<>();



}
