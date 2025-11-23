public class CartaoCredito implements MetodoPagamento {
    
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento(double valor) {
        double valorComTaxa = valor * 1.05;
        System.out.println("Pagamento de R$ " + valorComTaxa 
            + " realizado com Cartão de Crédito. Cobrança de 5% de taxa.");
    }
}
