package com.mycompany.entradadedado;
import java.util.Scanner;
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float nota = teclado.nextFloat();
        System.out.format("A Nota e %.1f \n", nota);
    }
}
