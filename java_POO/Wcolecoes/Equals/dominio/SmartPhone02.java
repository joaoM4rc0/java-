package java_POO.Wcolecoes.Equals.dominio;

public class SmartPhone02 {
    private String serialNumber;
    private String marca;

    public SmartPhone02(String marca, String serialNumber) {
        this.marca = marca;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "SmartPhone02{" +
                "marca='" + marca + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        SmartPhone02 objSmartPhone = (SmartPhone02) obj;
        if(!this.marca.equals(objSmartPhone.marca)) return false;
        return this.serialNumber != null && this.serialNumber.equals(objSmartPhone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
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
