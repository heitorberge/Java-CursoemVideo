package cursoemvideo.exerciciorepita;
import javax.swing.JOptionPane;
public class ExercicioRepita {
    public static void main(String[] args) {
        int n, s = 0 , p = 0, i = 0, ac100 = 0, c = 0, m = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um Número: <br/>(Valor 0 Interrompe)</br></html>"));
            c++;
            if (n % 2 == 0) {
                p += 1;
            } else {
                i += 1;
            }
            if (n > 100) {
                ac100 += 1;
            }
            s += n;
        } while(n !=0);
        m = s / c;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<br/><hr>" 
                + "<br/>Soma de Todos os Números vale:" + s + "<br/>Total de Pares:" + p +
                        "<br/>Total de Ímpares:" + i +"<br/> Acima de 100:" + ac100 + 
                        "<br/>Média dos Valores:" + m + "<br/> " + c + " Números foram Digitados</html>");
    
    }
}