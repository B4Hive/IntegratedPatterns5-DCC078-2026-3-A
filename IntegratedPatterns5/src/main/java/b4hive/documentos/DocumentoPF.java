package b4hive.documentos;

public class DocumentoPF implements Documento {

    private String info;

    public DocumentoPF(String info) {
        this.info = info;
    }

    @Override
    public String getInfo() {
        return info;
    }

}
