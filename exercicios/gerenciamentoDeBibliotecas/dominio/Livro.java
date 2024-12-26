package gerenciamentoDeBibliotecas.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Livro extends Biblioteca{
    private double valorApagar;
    public Livro(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public void multa() {
        if (dataFormatada.isAfter(getDataDValidade())) {
           long diasAcumulados = ChronoUnit.DAYS.between(getDataDValidade(), dataFormatada);
            valorApagar = this.getValor() + (this.getValor() * ((double)diasAcumulados / 100));
           System.out.println(valorApagar);
        }else {
            valorApagar = this.getValor();
        }
    }
}
