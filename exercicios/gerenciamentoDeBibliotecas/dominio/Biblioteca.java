package gerenciamentoDeBibliotecas.dominio;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class Biblioteca implements multas{
    private String nome;
    private double valor;
    private LocalDate data = LocalDate.now();
    private LocalDate dataDValidade = data.plusDays(7);
    LocalDate dataFormatada;
    public Biblioteca(String nome, double valor) {
        this.nome = nome;
        valorIsValid(valor);
    }
    public boolean valorIsValid(double valor) {
        if (valor < 0) {
            System.out.println("o preço do produto não pode ser negativo");
            return false;
        }
        try {
            this.valor = valor;
            return true;
        } catch (Exception e) {
            throw new RuntimeException("erro de incompatibilidade de tipos: " + e.getMessage());
        }
    }
    public boolean dataDeEntrega(String data) {
        String dateFormat = "dd/MM/yyyy";
        DateTimeFormatter format = DateTimeFormatter.ofPattern(dateFormat);
        try {
            dataFormatada = LocalDate.parse(data, format);
            return true;
        }catch (DateTimeParseException e ){
            System.out.println("erro, tipo de data invalida!" + e.getMessage());
            return false; 
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                ", dataDValidade=" + dataDValidade +
                ", dataFormatada=" + dataFormatada +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalDate getDataDValidade() {
        return dataDValidade;
    }

    public LocalDate getDataFormatada() {
        return dataFormatada;
    }
}

