package cursoemvideo.numeros;
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, s=0;
        String resp;
        System.out.println("______________________________________________");
        do {
            System.out.println("Digite Um Numero:");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer Continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os Valores Digitados e " + s);
        System.out.println("______________________________________________");
    }
}
