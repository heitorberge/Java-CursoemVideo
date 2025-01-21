package cursoemvideo.comparacaostring;
public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Heitor Berg";
        String nome3 = "Gustavo";
        String res;
        res = (nome1==nome2)? "iguais":"diferentes" ;
        System.out.println("As variaveis com valor " + nome1 + " e " + nome2 + " Sao: " + res);
        res = (nome1==nome3)? "iguais":"diferentes" ;
        System.out.println("As variaveis com valor " + nome1 + " e " + nome3 + " Sao: " + res);
        res = (nome2==nome3)? "iguais":"diferentes" ;
        System.out.println("As variaveis com valor " + nome2 + " e " + nome3 + " Sao: " + res);
    }
}
