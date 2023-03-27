package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicio = LocalDate.now();
    private LocalDate dataFinal = dataInicio.plusDays(45);
    private Set<Desenvolvedor> desenvolvedorInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

}
