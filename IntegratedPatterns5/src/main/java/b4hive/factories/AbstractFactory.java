package b4hive.factories;

import b4hive.contratos.Contrato;
import b4hive.documentos.Documento;
import b4hive.pagamentos.Pagamento;

public interface AbstractFactory {

    Documento registerDocumento(String info);

    Pagamento registerPagamento(float valor, String tipoPagamento);

    Contrato registerContrato(String info, Pagamento pagamento);

}
