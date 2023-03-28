package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Data
public class Desenvolvedor {

    private String nome;
    private LocalDate dataNascimento;
    private Integer idade = Objects.nonNull(dataNascimento) ? LocalDate.now().until(dataNascimento).getYears() : null;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDesenvolvedorInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum contéudo");
        }
    }

    public double calcularTotalXp() {
        return this.getConteudosConcluidos().stream().mapToDouble(Conteudo::calcularXp).sum();
    }
}
