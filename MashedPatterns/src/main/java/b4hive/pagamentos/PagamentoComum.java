package b4hive.pagamentos;

public class PagamentoComum implements Pagamento {

    protected float valor;

    public PagamentoComum(float valor) {
        this.valor = valor;
    }

    @Override
    public float getValor() {
        return valor;
    }
    
}
