package cursoemvideo.vetor01;
import java.util.Scanner;
public class Vetor01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("____________________________");
        System.out.println("Crie 1 Vetor de 5 Valores");
        int n[] = new int[5];
        System.out.println("Digite o Primeiro Valor do Vetor");
        n[0] = teclado.nextInt();
        System.out.println("Digite o Segundo Valor do Vetor");
        n[1] = teclado.nextInt();
        System.out.println("Digite o Terceiro Valor do Vetor");
        n[2] = teclado.nextInt();
        System.out.println("Digite o Quarto Valor do Vetor");
        n[3] = teclado.nextInt();
        System.out.println("Digite o Quinto Valor do Vetor");
        n[4] = teclado.nextInt();
        for(int c = 0;c<=4;c++){
            System.out.println("O valor " + c + " de n e" + n[c]);
        }
        System.out.println("____________________________");
    }
} 
