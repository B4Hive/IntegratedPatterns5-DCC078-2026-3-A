package b4hive.pagamentos;

public class PagamentoCredito extends PagamentoDecorator {

    public PagamentoCredito(Pagamento pagamento) {
        super(pagamento);
    }

    @Override 
    public float getValor() {
        return pagamento.getValor() * 1.1f;
    }
    
}
