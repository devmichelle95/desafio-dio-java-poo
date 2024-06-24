import dio.desafio.dominio.poo.Bootcamp;
import dio.desafio.dominio.poo.Curso;
import dio.desafio.dominio.poo.Mentoria;
import  dio.desafio.dominio.poo.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Curso Python");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setData(LocalDate.now());

      //  System.out.println(curso1);
       // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMichelle = new Dev();
        devMichelle.setNome("Michelle");
        devMichelle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Michelle: " + devMichelle.getConteudosInscritos());
        devMichelle.progredir();
        devMichelle.progredir();
        System.out.println("Conteúdos inscritos Michelle: " + devMichelle.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Michelle: " + devMichelle.getConteudoConcluido());
        System.out.println("XP: " + devMichelle.calcularTotalXp());

        System.out.println("_________________");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudoConcluido());
        System.out.println("XP: " + devMaria.calcularTotalXp());


    }
}