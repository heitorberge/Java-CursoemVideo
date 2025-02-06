package cursoemvideo.teste.funcao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteFuncao {

    public static void soma(int a, int b) {
        int s = a + b;
        System.out.println("O Resultado e " + s);
    }

    public static void While() {
        Scanner teclado = new Scanner(System.in);
        int r = 1;
        while (r == 1) {
            System.out.println("Deseja continuar?");
            System.out.println("[1]Sim");
            System.out.println("[2]Nao");
            try {
                r = teclado.nextInt();
                if (r == 2) {
                    break;
                } else if (r != 1) {
                    System.out.println("Opcao invalida. Digite 1 para Sim ou 2 para Nao.");
                    continue;
                }

                System.out.println("Escreva o Primeiro Numero:");
                int n1 = teclado.nextInt();
                System.out.println("Escreva o Segundo Numero:");
                int n2 = teclado.nextInt();
                soma(n1, n2);
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada invalida. Digite apenas numeros inteiros.");
                teclado.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = 0, n2 = 0;

        System.out.println("___________________________________________");
        System.out.println("CALCULADORA | JUNTE 2 NUMEROS PARA A SOMA");

        try {
            System.out.println("Escreva o Primeiro Numero:");
            n1 = teclado.nextInt();
            System.out.println("Escreva o Segundo Numero:");
            n2 = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida. Digite apenas numeros inteiros.");
            return;
        }

        soma(n1, n2);
        While();
        System.out.println("___________________________________________");
    }
}