package b4hive;

public final class SFM {

    private static final SFM instance = new SFM();
    private SFM(){}

    public static SFM getInstance() {
        return instance;
    }

    @SuppressWarnings({"deprecation", "rawtypes"})
    public IFabricaAbstrata getFabrica(String tipo) {
        Class classe = null;
        Object obj = null;
        try {
            classe = Class.forName("b4hive.Fabrica" + tipo);
            obj = classe.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (IFabricaAbstrata) obj;
    }

}
