package curso;
import java.util.Scanner;
public class RepeticaoFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("________________________________");
        System.out.println("Quantas Cambalhotas Vai Fazer?");
        int res = teclado.nextInt();
        for (int cc=1;cc<=res;cc++) {
            System.out.println("Cambalhota numero:" + cc);
        }
        System.out.println("________________________________");
    }
}
