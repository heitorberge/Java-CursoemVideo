package idiomasistema;
import java.util.Locale;
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("A lingua do seu sistema operacional e:");
        System.out.println(locale.getDisplayLanguage());
    }
}