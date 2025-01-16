package resoluçãotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 
        Dimension dimensaoTela = toolkit.getScreenSize(); 
        int largura = dimensaoTela.width;
        int altura = dimensaoTela.height;
        System.out.println("Resolucao da tela: " + largura + " x " + altura);
    }
}