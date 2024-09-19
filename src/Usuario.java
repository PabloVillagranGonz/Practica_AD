public class Usuario {
    public boolean premium;

    public Usuario (){

    }
    public Usuario(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
