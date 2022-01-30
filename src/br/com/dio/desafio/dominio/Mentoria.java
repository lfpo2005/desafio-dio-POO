package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Mentoria extends Conteudo {

    private LocalDate data;

    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", data = " + data +
                '}';
    }
}
