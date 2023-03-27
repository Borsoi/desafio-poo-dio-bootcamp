package br.com.dio.desafio.dominio;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class Desenvolvedor {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
    }

    public void progredir() {
    }

    public void calcularTotalXp() {
    }
}
