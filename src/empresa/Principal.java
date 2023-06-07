package empresa;

import empresa.entity.Usuario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) throws Exception {
        Usuario user1 = new Usuario("Cintia", "Muñoz", "Valdés", LocalDate.of(2000, 05, 19), 22000000);

        System.out.println(user1);
    }
}
