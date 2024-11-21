public class ExemploSwitch {
    public static void main(String[] args) {
        int diaDaSemana = 1; // suponha que 1 = domingo, 2 = segunda-feira, etc.

        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("é um final de semana");
                break;
            case 3:
            case 2:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
