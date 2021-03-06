package UtilidadesLista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesParaLista implements Serializable {
    public static <T extends tieneLista<T>> ArrayList<T> elementosConListaVacia(List<T> lObejcts){
        ArrayList<T> lista = new ArrayList<>();

        for( T obj : lObejcts){
            if (obj.getLista().isEmpty())
                lista.add(obj);
        }
        return lista;
    }

    public static <T, E extends tieneClave<T>> boolean elementoConClave (E object, List<E> lObjects){
        for (E obj : lObjects){
            if (object.getClave().equals(obj.getClave()))
                return true;
        }
        return false;
    }
}
