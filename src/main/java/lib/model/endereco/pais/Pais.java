package lib.model.endereco.pais;

public enum Pais {

    ARGENTINA("Argentina", "####", "+54 ##########"),
    BRASIL("Brasil", "#####-###", "+55 (##) ####-#####"),
    PARAGUAI("Paraguai", "####", "+595 #########");

    private String descricao;
    private String zipCode;
    private String ddi;


    /**
     * Construtor padrão
     *
     * @param descricao Descrição do país
     * @param zipCode   Formato do cep do país
     * @param ddi       Código ddi e formato de número telefônico do país
     */
    Pais(String descricao, String zipCode, String ddi) {
        this.descricao = descricao;
        this.zipCode = zipCode;
        this.ddi = ddi;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getDdi() {
        return ddi;
    }

    public String getComprimentoZipCode() {
        return String.valueOf(zipCode.length());
    }

    @Override
    public String toString() {
        return descricao;
    }

    public boolean isArgentina() {
        return equals(ARGENTINA);
    }

    public boolean isParaguai() {
        return equals(PARAGUAI);
    }

    public boolean isBrasil() {
        return equals(BRASIL);
    }
}
