package cursoemvideo.votaounaovota;
import java.util.Scanner;
// Por Heitor Berg
public class VotaOuNaoVota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("_________________________________________________");
        System.out.println("VOTA OU NAO VOTA? | VEJA SE VOCE DEVE VOTAR!");
        System.out.println("Em que ano Voce nasceu?");
        int Nasc = teclado.nextInt();
        System.out.println("Em que ano Estamos?");
        int AnoA = teclado.nextInt();
        int I = AnoA - Nasc;
        I = Math.abs(I);
        System.out.println("Sua Idade e " + I + " anos ne?");
        System.out.println("[1] Sim");
        System.out.println("[2] Nao");
        int res = teclado.nextInt();
        if (res == 1) {
            System.out.println("Entao Continue O Progama!");
        } else {
            while (res == 2) {
                System.out.println("Digite a sua Idade Entao!");
                I = teclado.nextInt();
                System.out.println("Sua Idade e " + I + " anos ne?");
                System.out.println("[1] Sim");
                System.out.println("[2] Nao");
                res = teclado.nextInt();
            }
        }
        if (I < 16) {
            System.out.println("Voce tem " + I + " anos Voce nao Pode Votar!");
        } else {
            if ((I>=16 && I<18) || (I>70)){
                System.out.println("Voce tem " + I + " anos seu Voto nao e Obrigatorio.");
            } else {
                System.out.println("Voce tem " + I + " anos Seu voto e Obrigatorio.");
            }
            System.out.println("Para Mais Informacoes va a um Cartorio Eleitoral");
            System.out.println("_________________________________________________");
        }            
    }
}
