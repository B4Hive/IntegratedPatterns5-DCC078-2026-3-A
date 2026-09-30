package b4hive.contratos;

import b4hive.pagamentos.Pagamento;

public class ContratoPF implements Contrato {

    private String info;
    private Pagamento pagamento;

    public ContratoPF(String info, Pagamento pagamento) {
        this.info = info;
        this.pagamento = pagamento;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public Pagamento getPagamento() {
        return pagamento;
    }

}
