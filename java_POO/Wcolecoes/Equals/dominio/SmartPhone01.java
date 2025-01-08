package java_POO.Wcolecoes.Equals.dominio;

public class SmartPhone01 {
    private String serialNumber;
    private String marca;

    public SmartPhone01(String marca, String serialNumber) {
        this.marca = marca;
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
