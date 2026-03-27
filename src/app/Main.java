package app;

// Importa as classes que estão na pasta model
import model.Cliente;
import model.Pedido;
import model.Restaurante;
import service.EntregaBicicleta;
import service.Entregavel;
import service.EntregaMoto;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // Criamos as opções disponíveis
        Entregavel[] opcoes = { new EntregaBicicleta(), new EntregaMoto()};
        // Fazemos um sorteio (0, 1)
        int sorteio = new Random().nextInt(opcoes.length);
        Entregavel entregaSelecionada = opcoes[sorteio];

        // Instância dos clientes
        Cliente c1 = new Cliente("Jeremias", "jere@hotmail.com", "35 9 99488767");

        // Instância dos restaurantes
        Restaurante UaiGrill = new Restaurante("UaiGrill", "Rua concórdia 280", "Pizzaria");
        // Instância dos pedidos
        Pedido p1 = new Pedido(c1, UaiGrill, 234.90);

        p1.setEstrategiaEntrega(entregaSelecionada);

        System.out.println(p1.getExibirInformacao());

        p1.finalizarPedido();
    }

}
