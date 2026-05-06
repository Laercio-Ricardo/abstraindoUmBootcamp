import br.com.abstraindobootcamp.dominio.Bootcamp;
import br.com.abstraindobootcamp.dominio.Curso;
import br.com.abstraindobootcamp.dominio.Dev;
import br.com.abstraindobootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java do Laércio");
        curso1.setDescricao("Curso de Java feito por mim");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Java  Avançado");
        curso2.setDescricao("Curso de Java Avançado");
        curso2.setCargaHoraria(15);

        // Criando agora as classses mentoria

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Segunda Mentoria do curso");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Laércio Java");
        bootcamp.setDescricao("Bootcamp de Java e Spring do Laércio");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devLaercio = new Dev();
        devLaercio.setNome("Laércio");
        devLaercio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos" + devLaercio.getConteudoInscritos());
        devLaercio.progredir();
        System.out.println("Conteúdos incritos" + devLaercio.getConteudoInscritos());
        System.out.println("Conteúdos concluidos" + devLaercio.getConteudoConcluidos());



        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos" + devJoao.getConteudoInscritos());

        devJoao.progredir();
        System.out.println("Conteúdos incritos" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos concluidos" + devJoao.getConteudoConcluidos());








    }
}
