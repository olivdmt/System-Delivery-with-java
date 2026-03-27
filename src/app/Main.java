package app;

// Importa as classes que estão na pasta model
import model.Cliente;
import model.Pedido;
import model.Restaurante;
import service.Entregavel;
import service.EntregaBicicleta;
import service.EntregaMoto;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jeremias", "SilverStape", "35 9 99488767");
        Restaurante UaiGrill = new Restaurante("UaiGrill", "Rua concórdia 280", "Pizzaria");
        Pedido p1 = new Pedido(c1, UaiGrill, 234.90);

        Entregavel entregaSelecionada;

        entregaSelecionada = new EntregaMoto();

        p1.setEstrategiaEntrega(entregaSelecionada);

        System.out.println(p1.getExibirInformacao());
        p1.finalizarPedido();
    }

}
