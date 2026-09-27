package b4hive.documentos;

public class DocumentoPJ implements Documento {
    private String info;

    public DocumentoPJ(String info) {
        this.info = info;
    }

    @Override
    public String getInfo() {
        return info;
    }

}
