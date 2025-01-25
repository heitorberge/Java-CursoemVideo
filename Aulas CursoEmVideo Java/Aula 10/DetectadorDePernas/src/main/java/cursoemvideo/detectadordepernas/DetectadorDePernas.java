package cursoemvideo.detectadordepernas;
import java.util.Scanner;
public class DetectadorDePernas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("__________________________________________________");
        System.out.println("DETECTADOR DE PERNAS | QUANTAS PERNAS VOCE TEM?");
        System.out.println("Diga Quantas pernas O Bicho Tem e Diremos oque ele e!");
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Com certeza Esse Bicho e Um/Uma " + tipo);
        System.out.println("__________________________________________________");
    }
}
