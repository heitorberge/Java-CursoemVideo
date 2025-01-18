package com.mycompany.operadoresdeatribuicao;
public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="var">
       int x = 4;
//</editor-fold>
        System.out.println("A variavel x tem o valor de " + x);
        x += 2;
        System.out.println("A operacao x += 2 faz que o x tenha Valor de " + x);
        x = 4;
        x *= 2;
        System.out.println("A operacao x *= 2 faz que o x tenha valor de " + x);
    }
} 