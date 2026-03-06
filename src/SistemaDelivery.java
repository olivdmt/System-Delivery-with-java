import java.util.ArrayList;

public class SistemaDelivery {
    //Cria o atributo para armazenar os pedidos
    private final ArrayList<Pedido> listaDePedidos = new ArrayList<>();

    public void criarPedido(Cliente c, Restaurante r, Double valor) {

        // Tenta criar o pedido
        try {
            // Cria o atribuito para buscar as intancias
            Pedido novoPedido = new Pedido(c, r, valor);
            // Se o peddido for criado ele adicona no array
            listaDePedidos.add(novoPedido);
         
        } catch (IllegalArgumentException e) {
            System.out.println("Pedido não criado: " + e.getMessage());
        }

        // novoPedido.cliente = c;
        // novoPedido.restaurante = r;
        // novoPedido.valorTotal = valor;

        // Salva na lista do sistema
        
    }

    // Método GETTERS para listar os pedidos
    public String getListarPedido() {
        String resultado = "";
        // Percorre a o array para exibir todos os pedidos
        for (Pedido p: listaDePedidos) {
            resultado += """
                    %s
                    """.formatted(p.getExibirInformacao());
        }
        // Retorna o resultado
        return resultado;
    }
}
