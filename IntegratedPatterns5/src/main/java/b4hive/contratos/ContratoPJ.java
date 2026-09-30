package b4hive.contratos;

import b4hive.pagamentos.Pagamento;

public class ContratoPJ implements Contrato {

    private String info;
    private Pagamento pagamento;

    public ContratoPJ(String info, Pagamento pagamento) {
        this.info = info;
        this.pagamento = pagamento;
    }

    public String getInfo() {
        return info;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

}
