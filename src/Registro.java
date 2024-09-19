import java.util.ArrayList;

public class Registro {
    private ArrayList<Cliente> listaClientes;

    public Registro() {
        listaClientes = new ArrayList<>();
    }

    public void añadirCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public Cliente buscarCliente(String identificador) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdentificador().equals(identificador)) {
                return cliente;
            }
        }
        return null;
    }

    public double calcularIngresos() {
        double total = 0;
        for (Cliente cliente : listaClientes) {
            if (cliente instanceof Usuario) {
                Usuario usuario = (Usuario) cliente;
                if (usuario.isPremium()) {
                    total += 35.5 - usuario.descuentos;
                } else {
                    total += 20.5 - usuario.descuentos;
                }
            }
        }
        return total;
    }
}
