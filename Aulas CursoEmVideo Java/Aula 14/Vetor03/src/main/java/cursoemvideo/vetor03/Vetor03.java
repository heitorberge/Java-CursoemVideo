package cursoemvideo.vetor03;
import java.util.Arrays;
public class Vetor03 {
    public static void main(String[] args) {
        double x[] = {3.5,2.76,9.0,-4.5};
        Arrays.sort(x);
        for (double valor: x) {
            System.out.print(valor + " ");
        }
    }
}
