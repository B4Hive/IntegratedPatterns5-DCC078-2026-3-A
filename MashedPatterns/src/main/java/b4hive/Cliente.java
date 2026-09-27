package b4hive;

import b4hive.contratos.Contrato;
import b4hive.documentos.Documento;
import b4hive.factories.AbstractFactory;

public class Cliente {

    private final Documento documento;
    private final Contrato contrato;

    public Cliente(AbstractFactory fabrica, String infoDocumento, String infoContrato, float valorPagamento, String tipoPagamento) {
        this.documento = fabrica.registerDocumento(infoDocumento);
        this.contrato = fabrica.registerContrato(infoContrato, fabrica.registerPagamento(valorPagamento, tipoPagamento));
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Documento getDocumento() {
        return documento;
    }

}
