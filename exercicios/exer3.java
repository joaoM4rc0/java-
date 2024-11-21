public class exer3 {
    public static void main(String[] args) {
        double valorCarro = 50000;
        double valorCarroParcelado; 

        for (int parcelas=1;parcelas <= 32; parcelas ++ ) {
            valorCarroParcelado = valorCarro / parcelas;
            if (valorCarroParcelado < 1000) {
                break;
            }
            System.out.println(String.format("O valor do carro é: %.2f R$. Parcelado em %d vezes fica: %.2f R$ por parcela.", 
            valorCarro, parcelas, valorCarroParcelado));
        }
    }
}
