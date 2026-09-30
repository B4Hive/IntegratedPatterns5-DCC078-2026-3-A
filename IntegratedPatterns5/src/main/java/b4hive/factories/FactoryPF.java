package b4hive.factories;

import b4hive.contratos.ContratoPF;
import b4hive.documentos.DocumentoPF;
import b4hive.pagamentos.Pagamento;

public class FactoryPF implements AbstractFactory {

    @Override
    public ContratoPF registerContrato(String info, Pagamento pagamento) {
        return new ContratoPF(info, pagamento);
    }

    @Override
    public DocumentoPF registerDocumento(String info) {
        return new DocumentoPF(info);
    }

    @Override
    public Pagamento registerPagamento(float valor, String tipoPagamento) {
        return SingletonFactoryMethod.getInstance().createPagamento(valor, tipoPagamento);
    }
    
}
