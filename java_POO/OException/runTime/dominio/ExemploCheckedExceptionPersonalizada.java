package java_POO.OException.runTime.dominio;

public class ExemploCheckedExceptionPersonalizada {

    // Método que lança a exceção personalizada
    public static void verificarCondicao(boolean condicao) throws MinhaCheckdException {
        if (!condicao) {
            throw new MinhaCheckdException("Condição não satisfeita.");
        }
        System.out.println("Condição satisfeita.");
    }

    public static void main(String[] args) {
        try {
            verificarCondicao(false);  // Isso causará MinhaCheckedException
        } catch (MinhaCheckdException e) {
            System.out.println("Exceção personalizada capturada: " + e.getMessage());
        }
    }
}

