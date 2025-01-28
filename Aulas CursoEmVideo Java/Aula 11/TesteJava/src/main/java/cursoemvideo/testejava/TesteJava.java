package cursoemvideo.testejava;
public class TesteJava {
    public static void main(String[] args) {
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        // ERRO c = c + i;
        // CORRETO s += i;
        // ERRO i += s;
        // ERRO c += s;
        // CORRETO i += l;
    }
}
