package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Data
public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoComcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp() {}

    public void progresso() {}

    public void calcularTotalXP() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoComcluidos, dev.conteudoComcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoComcluidos);
    }
}
