package cursoemvideo.cambalhotador;
import java.util.Scanner;
public class CAMBALHOTADOR {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("________________________________________");
        System.out.println("CAMBALHOTADOR | NAO FIQUE TONTO!");
        System.out.println("Obs:Se Voce perder O Jogo perde seus Pontos");
        int min = 1;
        int max = 10;
        int pontos = 0;
        int Na = (int)(Math.random() * (max - min + 1) + min);
        int cc = 0;
        boolean ganhou = false;
        int gano = 1;
        while (cc<Na) {
            System.out.println("Quer Fazer Uma Cambalhota?");
            System.out.println("[1]Cambalhota Normal");
            System.out.println("[2]Cambalhota Dupla");
            System.out.println("[3]Cambalhota Tripla");
            System.out.println("[4]Nao Desejo fazer Uma Cambalhota.");
            int res = teclado.nextInt();
            if (res == 1) {
                cc = ++cc;
                System.out.println("*Cambalhota " + cc + "| + 1 Ponto*");
                pontos = pontos + 1;
            } else if (res == 2) {
                cc = cc + 2;
                System.out.println("*Cambalhota Dupla | + 10 Pontos*");
                pontos = pontos + 10;
            } else if (res == 3) {
                cc = cc + 3;
                System.out.println("*Cambalhota Tripla | + 20 Pontos*");
                pontos = pontos + 20;
            } else {
                if (Na - 1 == cc) {
                   System.out.println("Parabens! Voce Fez Todas as Cambalhotas que conseguiu sem ficar Tonto e Teve: " + pontos + " Pontos");
                    System.out.println("________________________________________");
                    ganhou = true;
                    break;
                } else {
                    System.out.println("Nao fez Cambalhotas Suficientes, Voce Perdeu Porque Tinha que Fazer : " + --Na + " Para Ganhar.");
                    System.out.println("________________________________________");
                    break;
                }
            }
        }
        if (cc>=Na && ganhou == false && gano != 2) {
            System.out.println("Voce Ficou Tonto, Voce Perdeu Porque Fez :" + Na + " Cambalhotas");
            System.out.println("________________________________________");
        }
    }
}
