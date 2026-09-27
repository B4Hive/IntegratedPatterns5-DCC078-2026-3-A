package b4hive.pagamentos;

public class PagamentoParcelado extends PagamentoDecorator {

    public PagamentoParcelado(Pagamento pagamento) {
        super(pagamento);
    }

    @Override 
    public float getValor() {
        return pagamento.getValor() / 10f;
    }

}
