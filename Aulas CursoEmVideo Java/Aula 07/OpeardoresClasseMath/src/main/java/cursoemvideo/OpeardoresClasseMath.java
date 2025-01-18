package cursoemvideo;
public class OpeardoresClasseMath {
    public static void main(String[] args) {
        System.out.println("_______________________________");
        float mathh = (float) Math.PI;
        System.out.println("O Valor de PI e " + mathh);
        mathh = (float) Math.pow(5,2);
        System.out.println("A exponeciacao de 5,2 e " + mathh);
        mathh = (float) Math.sqrt(8);
        System.out.println("A Raiz quadrada de 8 e " + mathh);
        mathh = (float) Math.cbrt(29);
        System.out.println("A Raiz Cubica de  29 e " + mathh);
        System.out.println("_______________________________");
        // ARREDONDAMENTOS CLASSE MATH
        float math = (float) Math.abs(-10);
        System.out.println("O valor absoluto de -10 e " + math);
        math = (float) Math.floor(2.8);
        System.out.println("O Valor 2,8 Arredondado pra baixo e " + math);
        math = (float) Math.ceil(6.1);
        System.out.println("O valor de 6,1 arredondado pra cima e " + math);
        math = Math.round(5.5);
        System.out.println("O valor de 5,5 arredondado aritmeticamente e " + math);
        System.out.println("_______________________________");
        // GERADOR DE NÚMEROS
        int ale = (int) (1 + Math.random() * (100-1));
        System.out.println("O Numero aleatorio de 1 a 100 gerado pela classe math e " + ale);
        System.out.println("_______________________________");
    }
}
