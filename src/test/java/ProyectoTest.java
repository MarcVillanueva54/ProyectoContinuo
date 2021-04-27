import Persona.Persona;
import Resultado.Resultado;
import Tarea.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;

class ProyectoTest {
    private Resultado resultado1 = new Resultado("DOC01", 3, true), resultado2;
    private LocalDate fechaI = LocalDate.now();
    private LocalDate fechaF = null;

    @org.junit.jupiter.api.Test
    void añadirPersonal() {
        Persona persona1 = new Persona("Juan", "@gmail", new ArrayList<>());
        Persona persona2 = new Persona("Maria", "", new ArrayList<>());
    }

    @org.junit.jupiter.api.Test
    void añadirTarea() {
        Tarea tarea1 = new Tarea("Tarea1", "sd", new ArrayList<>(), 3, fechaI, fechaF, resultado1, new ArrayList());
    }
}