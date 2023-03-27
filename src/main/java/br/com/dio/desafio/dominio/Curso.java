package br.com.dio.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

}
