package cursoemvideo.progamamedianota;

import java.util.Scanner;

public class ProgamaMediaNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("__________________________________");
        System.out.println("ESCOLA BURRO MANCO");
        System.out.println("Qual o nome do aluno?");
        String nome = teclado.next();
        System.out.println("Quantas provas o Aluno " + nome + " fez?");
        int provas = teclado.nextInt();
        int cont = 0;
        int[] numeros = new int[provas + 1];

        while (cont < provas) {
            System.out.println("Qual foi a Nota Da prova " + ++cont);
            numeros[cont] = (int) teclado.nextFloat();
        }

        int soma = 0;
        for (int nota : numeros) {
            soma += nota;
        }
        double media = (double) soma / provas;
        System.out.println("A media do aluno " + nome + " e: " + media);
        System.out.println("__________________________________");
    }
}