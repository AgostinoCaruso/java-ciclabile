package org.lessons.java;

import java.util.Scanner;

public class JavaCiclabile {

    private int[] arrayIntero = { 1, 2, 3, 4 };
    private int numeroCicloIterato = 0;
    Scanner scan = new Scanner(System.in);


    public JavaCiclabile() {
        // qui dentro deve starci una funzione che aggiunga un elemento all'array
        addElemento();
    }

    public JavaCiclabile(int[] array) {
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
        int elementoCorrente = numeroCicloIterato;
        return 0;
    }

    public boolean HasAncoraElementi(int numeroCicloIterato, int[] arrayIntero) {
        if (numeroCicloIterato > arrayIntero.length)
            return false;
        return true;
    }

    public void toStringArray(){
        for(int ele : arrayIntero){
            System.out.println("-"+ele);
        }
    }

    public void addElemento() {
        int numeroDaAggiungere;
        System.out.println("Scrivi il numero che vuoi aggiungere all'array: ");
        numeroDaAggiungere = scan.nextInt();
        System.out.println("---");
        int[] arrayTemp = new int[arrayIntero.length + 1];
        System.arraycopy(arrayIntero, 0, arrayTemp, 0, arrayIntero.length);
        arrayTemp[arrayIntero.length] = numeroDaAggiungere;

        //qua sovrascrivo l array vecchio con quello aggiornato
        arrayIntero = arrayTemp;
    }
}
