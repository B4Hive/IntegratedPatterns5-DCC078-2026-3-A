package b4hive;

public class FabricaPF implements IFabricaAbstrata {
    @Override
    public IContrato criarContrato() {
        return new ContratoPF();
    }

    @Override
    public IProcuracao criarProcuracao() {
        return new ProcuracaoPF();
    }
}
