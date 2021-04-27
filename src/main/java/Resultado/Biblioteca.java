package Resultado;

import java.io.Serializable;

public class Biblioteca extends Resultado implements Serializable {
    private String lenguaje;
    private int lCodigo;
    private int nModulos;

    Biblioteca(String identificador, int horasEsperadas, boolean interno,
               String lenguaje, int lCodigo, int nModulos) {
        super(identificador, horasEsperadas, interno);
        this.lenguaje = lenguaje;
        this.lCodigo = lCodigo;
        this.nModulos = nModulos;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public int getlCodigo() {
        return lCodigo;
    }

    public int getnModulos() {
        return nModulos;
    }
}
