package gui.cotas;

public enum statuscota {


    ATIVADO("ATIVADO"),
    DESATIVADO("DESATIVADO");

    private String descricao;

    statuscota(String descricao) {
        this.descricao=descricao;
    }
}
