package b4hive.pagamentos;

public abstract class PagamentoDecorator implements Pagamento {

    protected Pagamento pagamento;

    public PagamentoDecorator(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public abstract float getValor();

}
