import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("HTML e CSS");
        curso.setDescricao("Descrição do Curso HTML e CSS");
        curso.setCargaHoraria(5);

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição do Curso Java POO");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Aqui é a descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp html e css");
        bootcamp2.setDescricao("Descrição do Bootcamp  html e css");
        bootcamp2.getConteudos().add(curso);
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria);

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando\n");
        devFernando.inscreverBootcamp(bootcamp);
        devFernando.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos:\n" + "Nome do Dev: " + devFernando.getNome() + devFernando.getConteudosInscritos());
        devFernando.progresso();
        devFernando.progresso();
        devFernando.progresso();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos:\n"  + devFernando.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos:\n" + devFernando.getConteudoConcluidos());
        System.out.println("XP: "+ devFernando.calcularTotalXP());

        System.out.println("-----------------------------------------------------------------------------------------------");

        Dev devCarla = new Dev();
        devCarla.setNome("Carla\n");
        devCarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:\n" + "Nome do Dev: " + devCarla.getNome() + devCarla.getConteudosInscritos());
        devCarla.progresso();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos:\n" + devCarla.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos:\n" + devCarla.getConteudoConcluidos());
        System.out.println("XP: "+ devCarla.calcularTotalXP());
        System.out.println("-----------------------------------------------------------------------------------------------");

     /*   System.out.println(curso1);
        System.out.println(curso2);
        System.out.println("-------------------------------");
        System.out.println(mentoria1);*/
    }
}
