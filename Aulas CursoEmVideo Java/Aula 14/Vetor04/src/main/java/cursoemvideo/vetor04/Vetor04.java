package cursoemvideo.vetor04;
import java.util.Arrays;
public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3,7,6,1,9,4};
        for (int valor: vet) {
            System.out.print(valor + " ");
        }
        int p =  Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o Valor 1 na posicao :" + p);
    }
}
