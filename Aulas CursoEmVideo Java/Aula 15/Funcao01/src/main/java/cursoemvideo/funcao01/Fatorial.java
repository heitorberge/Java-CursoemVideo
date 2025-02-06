package cursoemvideo.funcao01;
public class Fatorial {
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s +="= ";
        fat = f;
        formula = s;
    }
    public int getFat() {
        return fat;
    }
    public String getFormula() { 
        return formula;
    }
}
