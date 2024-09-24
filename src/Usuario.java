public class Usuario extends Cliente {
    public boolean premium;

    public Usuario() {
        super();
    }

    public Usuario(String identificador, String contraseña, double descuento, boolean premium) {
        super(identificador, contraseña, descuento);
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
