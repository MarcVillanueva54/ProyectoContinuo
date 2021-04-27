import Persona.Persona;
import Proyecto.Proyecto;
import Tarea.Tarea;

import java.time.LocalDate;
import java.util.*;

public class FechaPrueba {
    public static void main(String [] args) {
        Date fecha = new Date();
        System.out.println(fecha);

        String string = "";
        LocalDate localDate;
        if(!string.equals(""))
            localDate = LocalDate.parse(string);
        else
            localDate = null;

        System.out.println("Local date: " + localDate);


        GregorianCalendar c1 = new GregorianCalendar();
        System.out.println("Fecha: " + c1.get(Calendar.DAY_OF_MONTH) + '/' +  (c1.get(Calendar.MONTH) + 1) +'/'+ c1.get(Calendar.YEAR));

        fecha = c1.getGregorianChange();
        System.out.println("Fecha otra: " + fecha.toString());

        LocalDate ahora = LocalDate.now();
        System.out.println("Ahora: " + ahora);


        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("Adeu");
        for (String i : lista){
            System.out.println(i);
        }

        ArrayList<Persona> stringArrayList = new ArrayList<Persona>();
        ArrayList<Tarea> tareaArrayList = new ArrayList<Tarea>();;

        stringArrayList.add(new Persona("Juan", "@gmail", tareaArrayList));
        stringArrayList.add(new Persona("Maria", "@gmail", new ArrayList<Tarea>()));
        stringArrayList.add(new Persona("Anna", "@gmail", new ArrayList<Tarea>()));
        stringArrayList.add(new Persona("Pepe", "@gmail", new ArrayList<Tarea>()));

        Proyecto proyecto = new Proyecto("Hola", stringArrayList, new ArrayList<Tarea>());
        ArrayList<Persona> personaArrayList =proyecto.getListPersonas();

        for (Persona persona : personaArrayList)
            System.out.println(persona.getNombre()+ " con correo " + persona.getCorreo() + " con tareas " + persona.getListTareas());

        System.out.println("");
        ArrayList<String> lista2 = new ArrayList<>();
        System.out.println(lista2);
        System.out.println(lista2.isEmpty());
    }
}
