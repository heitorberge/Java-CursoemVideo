package cursoemvideo;
public class OperadoresUnuarios {
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="var">
        int numero = 5;
        int num = 5;
        int valor = 5;
//</editor-fold>
        numero++;
        System.out.println("O valor da variavel numero e " + numero);
        num--;
        System.out.println("O valor da variavel num e " + num);
        int m = numero + num;
        System.out.println("A soma dessas 2 variaveis e " + m);
        System.out.println("_____________________________________");
        numero++;
        System.out.println("O Valor da variavel valor e " + numero + " + " + valor);
        valor = valor + numero;
        System.out.println("Ou seja o valor da variavel valor e " + valor);
    }
} 