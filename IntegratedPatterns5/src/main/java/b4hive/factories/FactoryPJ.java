package b4hive.factories;

import b4hive.contratos.ContratoPJ;
import b4hive.documentos.DocumentoPJ;
import b4hive.pagamentos.Pagamento;

public class FactoryPJ implements AbstractFactory {

    @Override
    public ContratoPJ registerContrato(String info, Pagamento pagamento) {
        return new ContratoPJ(info, pagamento);
    }

    @Override
    public DocumentoPJ registerDocumento(String info) {
        return new DocumentoPJ(info);
    }

    @Override
    public Pagamento registerPagamento(float valor, String tipoPagamento) {
        return SingletonFactoryMethod.getInstance().createPagamento(valor, tipoPagamento);
    }

}
