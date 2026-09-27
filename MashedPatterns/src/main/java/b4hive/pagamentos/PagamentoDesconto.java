package b4hive.pagamentos;

public class PagamentoDesconto extends PagamentoDecorator {

    public PagamentoDesconto(Pagamento pagamento) {
        super(pagamento);
    }

    @Override 
    public float getValor() {
        return pagamento.getValor() * 0.9f;
    }

}
