import br.com.abstraindobootcamp.dominio.Curso;

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

        System.out.println(curso1);
        System.out.println(curso2);


    }
}
