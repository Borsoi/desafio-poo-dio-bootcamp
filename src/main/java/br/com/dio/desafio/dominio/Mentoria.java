package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Mentoria extends Conteudo {

    private String titulo;
    private String descricao;
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
}
