package br.com.dio.desafio.dominio;

import lombok.Data;

@Data

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
