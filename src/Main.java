import br.com.abstraindobootcamp.dominio.Curso;
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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}
