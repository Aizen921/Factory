public enum FormaEnum {
    TRIANGOLO("Triangolo"),
    QUADRATO("Quadrato"),
    RETTANGOLO("Rettangolo");



    private String forma;

    FormaEnum(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}