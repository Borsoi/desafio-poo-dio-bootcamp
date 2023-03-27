package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate data;
}
