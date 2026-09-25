package b4hive;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testContratoPF() {
        Cliente cliente = new Cliente(SFM.getInstance().getFabrica("PF"));
        assert cliente.getContrato().get().equals("Contrato Pessoa Física");
    }

    @Test
    public void testContratoPJ() {
        Cliente cliente = new Cliente(SFM.getInstance().getFabrica("PJ"));
        assert cliente.getContrato().get().equals("Contrato Pessoa Jurídica");
    }

    @Test 
    public void testProcuracaoPF() {
        Cliente cliente = new Cliente(SFM.getInstance().getFabrica("PF"));
        assert cliente.getProcuracao().get().equals("Procuração Pessoa Física");
    }

    @Test
    public void testProcuracaoPJ() {
        Cliente cliente = new Cliente(SFM.getInstance().getFabrica("PJ"));
        assert cliente.getProcuracao().get().equals("Procuração Pessoa Jurídica");
    }

}
