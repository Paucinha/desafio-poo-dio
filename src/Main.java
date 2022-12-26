import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGoku = new Dev();
        devGoku.setNome("Goku");
        devGoku.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Goku:" + devGoku.getConteudosInscritos());
        devGoku.progredir();
        devGoku.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Goku:" + devGoku.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Goku:" + devGoku.getConteudosConcluidos());
        System.out.println("XP:" + devGoku.calcularTotalXp());

        System.out.println("-------");

        Dev devVegeta = new Dev();
        devVegeta.setNome("Vegeta");
        devVegeta.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vegeta" +  devVegeta.getConteudosInscritos());
        devVegeta.progredir();
        devVegeta.progredir();
        devVegeta.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vegeta" +  devVegeta.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vegeta" +  devVegeta.getConteudosConcluidos());
        System.out.println("XP:" + devVegeta.calcularTotalXp());

    }
}