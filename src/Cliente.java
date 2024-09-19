public class Cliente {
    public String identificador;
    public String contraseña;
    public double descuentos;

    public Cliente (){

    }
    public Cliente(String identificador, String contraseña, double descuentos) {
        this.identificador = identificador;
        this.contraseña = contraseña;
        this.descuentos = descuentos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "identificador='" + identificador + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", descuentos=" + descuentos +
                '}';
    }
}
