package org.lessons.java;

public class JavaCiclabile {

    private int[] arrayIntero = { 1, 2, 3, 4 };
    private int numeroCicloIterato = arrayIntero.length;

    JavaCiclabile() {
        addElemento();
        // qui dentro deve starci una funzione che inizializzi un array
    }

    JavaCiclabile(int[] array) {
        array = arrayIntero;
    }

    // get&set
    public int[] GetArrayIntero() {
        return arrayIntero;
    }

    public int GetNumeroIterato() {
        return numeroCicloIterato;
    }

    // metodi
    public int GetElementoSuccessivo(int[] arrayIntero) {
        // deve tornare l elemento succesivo dell'array, tenendo conto dell'inidice ad
        // ogni invocazione
        return 0;
    }

    public boolean HasAncoraElementi(int numeroCicloIterato, int[] arrayIntero) {
        if (numeroCicloIterato > arrayIntero.length)
            return false;
        return true;
    }

    public void addElemento() {
        
    }
}
