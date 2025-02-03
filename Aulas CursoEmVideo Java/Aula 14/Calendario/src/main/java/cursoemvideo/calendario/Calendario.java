package cursoemvideo.calendario;
import java.util.Calendar;
public class Calendario {
    public static boolean isAnoBissexto(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                return ano % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);

        System.out.println("____________________________________________");
        System.out.println("CALENDARIO | Ano de " + ano);
        System.out.println("-----------------------------------------------------");

        String mes[] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isAnoBissexto(ano)) {
            tot[1] = 29; // Ajusta fevereiro para 29 dias se for ano bissexto
        }

        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mes " + mes[c] + " Tem " + tot[c] + " Dias ao Todo");
            System.out.println("-----------------------------------------------------");
        }
        System.out.println("____________________________________________");
    }
}