package cursoemvideo.operadorternario;
public class OperadorTernario {
    public static void main(String[] args) {
        int maior;
        int n1 = 4;
        int n2 = 8;
        maior = n1>n2 ? n1 : n2;
        String r = n1>n2 ? "n1" : "n2";
        System.out.println("A variavel " + r + " com maior valor possui o valor de: " + maior);
        r = n1<n2 ? "n1" : "n2";
        int menor = n1<n2 ? n1 :n2;
        System.out.println("A variavel " + r + " com menor valor possui o valor de: " + menor);
    }
}
