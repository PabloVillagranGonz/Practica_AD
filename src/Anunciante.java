public class Anunciante {
    public int numeroAnuncios;

    public Anunciante(){

    }

    public Anunciante(String identificador, String contraseña, double descuento, int numeroAnuncios) {
        this.numeroAnuncios = numeroAnuncios;
    }

    public int getNumeroAnuncios() {
        return numeroAnuncios;
    }

    public void setNumeroAnuncios(int numeroAnuncios) {
        this.numeroAnuncios = numeroAnuncios;
    }
}
