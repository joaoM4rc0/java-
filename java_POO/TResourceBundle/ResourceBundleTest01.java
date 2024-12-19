package java_POO.TResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // Carregando o recurso padrão (Idioma do sistema)
        ResourceBundle bundlePt = ResourceBundle.getBundle("java_POO.Messages");
        ResourceBundle bundleUS = ResourceBundle.getBundle("java_POO.Messages", new Locale("en", "US"));
        System.out.println(bundlePt.getString("ola"));
        System.out.println(bundlePt.getString("bom.dia"));
        System.out.println(bundleUS.getString("ola"));
        System.out.println(bundleUS.getString("bom.dia"));
    }
}

