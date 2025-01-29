package cursoemvideo;
import java.util.Scanner;
public class Repeticao001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("____________________________________________________");
        System.out.println("Quantas Cambalhotas vai fazer?");
        int Res = teclado.nextInt();
        int cc = 0;
        do {
            cc++;
            System.out.println("Cambalhota numero " + cc);
        } while (cc<Res);
        System.out.println("____________________________________________________");
    }
}
