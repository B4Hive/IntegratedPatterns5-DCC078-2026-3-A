package b4hive;

public class FabricaPJ implements IFabricaAbstrata {
    @Override
    public IContrato criarContrato() {
        return new ContratoPJ();
    }

    @Override
    public IProcuracao criarProcuracao() {
        return new ProcuracaoPJ();
    }
}
