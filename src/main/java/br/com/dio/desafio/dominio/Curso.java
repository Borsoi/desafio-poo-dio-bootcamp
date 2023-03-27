package br.com.dio.desafio.dominio;

import lombok.*;

@Getter
@Setter
public class Curso extends Conteudo {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
