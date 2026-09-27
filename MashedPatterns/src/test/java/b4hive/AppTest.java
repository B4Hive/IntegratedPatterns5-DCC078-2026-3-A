package b4hive;

import b4hive.factories.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    int valor = 100;

    @Test 
    public void testClientePFDocumento() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "");
        assertEquals("CPF", c.getDocumento().getInfo());
    }

    @Test 
    public void testClientePFContrato() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "");
        assertEquals("ContratoPF", c.getContrato().getInfo());
    }

    @Test
    public void testClientePFPagamentoComum() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "");
        assertEquals(100.0f, c.getContrato().getPagamento().getValor(), 0.01f);
    }
    
    @Test
    public void testClientePFPagamentoDesconto() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "Desconto");
        assertEquals(90f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePFPagamentoCredito() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "Credito");
        assertEquals(110f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePFPagamentoParcelado() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "Parcelado");
        assertEquals(10f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePFPagamentoDescontoCredito() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "Desconto,Credito");
        assertEquals(99f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePFPagamentoDescontoParcelado() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "Desconto,Parcelado");
        assertEquals(9f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test
    public void testClientePFPagamentoCreditoParcelado() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "Credito,Parcelado");
        assertEquals(11f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePFPagamentoDescontoCreditoParcelado() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF", valor, "Desconto,Credito,Parcelado");
        assertEquals(9.9f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePJDocumento() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "");
        assertEquals("CNPJ", c.getDocumento().getInfo());
    }

    @Test 
    public void testClientePJContrato() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "");
        assertEquals("ContratoPJ", c.getContrato().getInfo());
    }

    @Test 
    public void testClientePJPagamentoComum() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "");
        assertEquals(100.0f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePJPagamentoDesconto() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "Desconto");
        assertEquals(90f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePJPagamentoCredito() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "Credito");
        assertEquals(110.0f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePJPagamentoParcelado() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "Parcelado");
        assertEquals(10.0f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePJPagamentoDescontoCredito() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "Desconto,Credito");
        assertEquals(99.0f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePJPagamentoDescontoParcelado() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "Desconto,Parcelado");
        assertEquals(9.0f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test 
    public void testClientePJPagamentoCreditoParcelado() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "Credito,Parcelado");
        assertEquals(11.0f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

    @Test
    public void testClientePJPagamentoDescontoCreditoParcelado() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ", valor, "Desconto,Credito,Parcelado");
        assertEquals(9.9f, c.getContrato().getPagamento().getValor(), 0.01f);
    }

}
