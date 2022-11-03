package edu.adsandro.AnatomiaClasses;
public class BoletimEstidantil {
    public static void main(String[] args) {
        int mediaFinal = 7;

        if (mediaFinal < 6)
            System.out.println("Reprovado");

        else if(mediaFinal == 6)
            System.out.println("Prova miverna");
            
        else
            System.out.println("Aprovado");
    }
}
