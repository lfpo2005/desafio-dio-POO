package br.com.dio.desafio.dominio;

import lombok.Data;

@Data
public class Curso extends Conteudo{

       private int cargaHoraria;

    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCURSO{" +
                "\nTitulo = '" + getTitulo() + '\'' +
                "\nDescricao = '" + getDescricao() + '\'' +
                "\nCargaHoraria = " + cargaHoraria +
                "}\n";
    }

}
