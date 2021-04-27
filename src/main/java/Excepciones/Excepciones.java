package Excepciones;

import Proyecto.Proyecto;
import Tarea.Tarea;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Excepciones {
    public static boolean comprobarTitulo(String titulo, Proyecto proyecto){
        if (titulo.equals(""))
            return false;

        for (Tarea tarea : proyecto.getTareas()){
            if (titulo.equals(tarea.getTitulo())){
                System.out.println("Tarea con el mísmo título ya dada de alta.");
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarPrio(String prio){
        if (prio.equals(""))
            return false;

        boolean correcto = false;
        try {
            int prioridad = Integer.parseInt(prio);

            if (prioridad > 0 && prioridad < 6)
                correcto = true;
            else
                System.out.println("La prioridad debe estar entre 1-5");

        }catch (NumberFormatException e){
            System.out.println("Prioridad inválida.");
        }
        return correcto;
    }

    public static boolean comprobarFechaFinal(String date){
        if (date.equals(""))
            return true;

        boolean correcto = false;
        LocalDate fechaI = LocalDate.now();
        LocalDate fechaF;
        try {
            fechaF = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            if (fechaF.compareTo(fechaI) >= 0)
                correcto = true;
            else
                System.out.println("La fecha de finalización no puede ser menor que la fecha actual");
        }catch (DateTimeParseException e){
            System.out.println("Fecha invalida");
        }
        return correcto;
    }

    public static boolean comprobarIdentificador(String identificador, ArrayList<String> tipos){

        if (identificador.equals("")) {
            System.out.println("El identificador no puede estar vacío");
            return false;
        }

        try {
            String tipo = identificador.substring(0,3);
            if (!tipos.contains(tipo)){
                System.out.println("El identificador debe empezar por DOC, PRO, BIB o WEB");
                return false;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("El identificador debe empezar por DOC, PRO, BIB o WEB");
            return false;
        }

        return true;
    }

    public static boolean comprobarHorasEsperadas(String horasEsperadas){
        try {
            Double.parseDouble(horasEsperadas);
            return true;
        }catch (NullPointerException e){
            System.out.println("Hora inválida.");
            return false;
        }catch (NumberFormatException e){
            System.out.println("Hora inválida");
            return false;
        }
    }

    public static boolean comprobarComercializacion(String res){
        if (res.equals("")) {
            System.out.println("La respuesta debe ser 'S' o 'N'");
            return false;
        }

        if(res.toUpperCase().equals("S") || res.toUpperCase().equals("N"))
            return true;
        else {
            System.out.println("La respuesta debe ser 'S' o 'N'");
            return false;
        }
    }
}
