package cursoemvideo.operadoreslogicos;
public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        System.out.println("________________________________________________________________________________");
        System.out.println("VALOR DAS VARIAVEIS");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
        System.out.println("R = boolean");
        System.out.println("________________________________________________________________________________");
        r = (x<y&&y<z)?true:false;
        System.out.println("A variavel x e menor que y e y e Menor que z ? Essa Afirmacao e :" + r);
        r = (x<y||y<z)?true:false;
        System.out.println("A variavel x e menor que y ou y e Menor que z ? Essa Afirmacao e :" + r);
        r = (x<y^y<z)?true:false;
        System.out.println("A variavel x e menor que y xou y e Menor que z ? Essa Afirmacao e :" + r);
        r = (x<y||y<z)?true:false;
        System.out.println("A variavel x nao e menor que y e y nao e Menor que z ? Essa Afirmacao e :" + !r);
        System.out.println("________________________________________________________________________________");
    }
}
