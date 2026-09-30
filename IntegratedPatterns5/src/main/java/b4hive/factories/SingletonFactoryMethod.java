package b4hive.factories;

import b4hive.pagamentos.*;

public class SingletonFactoryMethod {

    private static SingletonFactoryMethod instance;

    private SingletonFactoryMethod() {}

    public static SingletonFactoryMethod getInstance() {
        if (instance == null) {
            instance = new SingletonFactoryMethod();
        }
        return instance;
    }

    public Pagamento createPagamento(float valor, String tipoPagamento){
        Class<?> c = null;
        Object o = null;

        Pagamento pagamento = new PagamentoComum(valor);

        if (tipoPagamento == null || tipoPagamento.isEmpty()) return pagamento;

        String pagamentos[] = tipoPagamento.split(",");
        for (String p : pagamentos){
            try {
                c = Class.forName("b4hive.pagamentos.Pagamento" + p);
                o = c.getConstructor(Pagamento.class).newInstance(pagamento);
                ((PagamentoDecorator) o).setPagamento(pagamento);
                pagamento = (Pagamento) o;
            } catch (Exception e) {
                throw new IllegalArgumentException();
            }
        }
        return pagamento;
    }

    public AbstractFactory createFactory(String tipo) {
        Class<?> c = null;
        Object o = null;
        try {
            c = Class.forName("b4hive.factories.Factory" + tipo);
            o = c.getConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return (AbstractFactory) o;
    }
}
