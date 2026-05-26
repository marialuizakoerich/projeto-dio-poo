import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição Curso Python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("----------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}
