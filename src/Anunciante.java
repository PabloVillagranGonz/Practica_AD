public class Anunciante extends Cliente {
    public int numAnuncios;

    public Anunciante() {
        super();
    }

    public Anunciante(String identificador, String contraseña, double descuento, int numAnuncios) {
        super(identificador, contraseña, descuento);
        this.numAnuncios = numAnuncios;
    }

    public int getNumAnuncios() {
        return numAnuncios;
    }

    public void setNumAnuncios(int numAnuncios) {
        this.numAnuncios = numAnuncios;
    }
}
