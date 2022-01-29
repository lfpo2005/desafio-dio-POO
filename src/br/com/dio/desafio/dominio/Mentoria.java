package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
