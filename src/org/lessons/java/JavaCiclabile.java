package org.lessons.java;

import java.util.Scanner;

public class JavaCiclabile {

    private int[] arrayIntero = {};
    private int indiceCorrenteArray = 0;
    Scanner scan = new Scanner(System.in);

    public JavaCiclabile() {
        // qui dentro deve starci una funzione che aggiunga un elemento all'array
        this.arrayIntero = new int[0];
    }

    public JavaCiclabile(int[] array) {
        this.arrayIntero = array;
        if (this.arrayIntero.length > 0)
            this.indiceCorrenteArray = 0;
    }

    // get&set
    public int[] GetArrayIntero() {
        return this.arrayIntero;
    }

    public int GetNumeroIterato() {
        return this.indiceCorrenteArray;
    }

    // metodi
    public int GetElementoSuccessivo() {
        if (this.indiceCorrenteArray < this.arrayIntero.length) {
            int elemento = this.arrayIntero[this.indiceCorrenteArray];
            this.indiceCorrenteArray++;
            return elemento;
        } else {
            this.indiceCorrenteArray = 0;
            return -1;
        }

    }

    public boolean HasAncoraElementi() {
        if (this.indiceCorrenteArray >= this.arrayIntero.length)
            return false;
        return true;
    }

    public void toStringArray() {
        for (int ele : this.arrayIntero) {
            System.out.println("-" + ele);
        }
    }

    public void addElemento() {
        int numeroDaAggiungere;
        System.out.println("Scrivi il numero che vuoi aggiungere all'array: ");
        numeroDaAggiungere = scan.nextInt();
        System.out.println("---");
        int[] arrayTemp = new int[this.arrayIntero.length + 1];

        // o cosi

        // System.arraycopy(this.arrayIntero, 0, arrayTemp, 0, arrayIntero.length);
        // arrayTemp[this.arrayIntero.length] = numeroDaAggiungere;

        // o con un iterazione for

        for (int i = 0; i < this.arrayIntero.length; i++) {
            arrayTemp[i] = this.arrayIntero[i];
        }
        arrayTemp[this.arrayIntero.length] = numeroDaAggiungere;

        // qua sovrascrivo l array vecchio con quello aggiornato
        this.arrayIntero = arrayTemp;
    }
}
