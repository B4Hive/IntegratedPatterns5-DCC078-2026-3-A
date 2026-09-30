package b4hive.contratos;

import b4hive.pagamentos.Pagamento;

public interface Contrato {

    String getInfo();

    Pagamento getPagamento();

}
