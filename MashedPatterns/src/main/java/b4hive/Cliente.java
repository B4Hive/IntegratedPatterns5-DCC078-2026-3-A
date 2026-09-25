package b4hive;

public class Cliente {
    private final IContrato contrato;
    private final IProcuracao procuracao;

    public Cliente(IFabricaAbstrata fabrica) {
        if (fabrica == null) {
            throw new IllegalArgumentException("A fábrica não pode ser nula");
        }
        this.contrato = fabrica.criarContrato();
        this.procuracao = fabrica.criarProcuracao();
    }

    public IContrato getContrato() {
        return contrato;
    }

    public IProcuracao getProcuracao() {
        return procuracao;
    }
}
