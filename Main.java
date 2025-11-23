public class TestePolimorfismo {
    public static void main(String[] args) {
        
        MetodoPagamento cartao = new CartaoCredito("1234 5678 9999 0000");
        MetodoPagamento boleto = new Boleto("836200000015...");
        MetodoPagamento pix = new Pix("meuemail@gmail.com");

        ProcessadorPagamento.processar(cartao, 150.75);
        ProcessadorPagamento.processar(boleto, 499.00);
        ProcessadorPagamento.processar(pix, 25.50);
    }
}
