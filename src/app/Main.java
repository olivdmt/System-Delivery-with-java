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
        // Váriavel do tipo interface
        Entregavel entregaSelecionada;
        // Instância do metodo Random
        Random random = new Random();

        // Instância dos clientes
        Cliente c1 = new Cliente("Jeremias", "jere@hotmail.com", "35 9 99488767");
        // Instância dos restaurantes
        Restaurante UaiGrill = new Restaurante("UaiGrill", "Rua concórdia 280", "Pizzaria");
        // Instância dos pedidos
        Pedido p1 = new Pedido(c1, UaiGrill, 234.90);

        // Criamos uma aleatoridade gerando 0 ou 1, para designar uma função para os entregadores
        if (random.nextInt(2) == 0) {
            entregaSelecionada = new EntregaMoto();
        } else {
            entregaSelecionada = new EntregaBicicleta();
        }

        p1.setEstrategiaEntrega(entregaSelecionada);

        System.out.println(p1.getExibirInformacao());

        p1.finalizarPedido();
    }

}
