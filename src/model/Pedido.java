package model;
// Esta classe representa a ligação entre um cliente e um restaurante específico

import service.Entregavel;

public class Pedido {
    // Criamos os atributos (referencias)
    private Cliente cliente;
    private Restaurante restaurante;
    private Double valorTotal;
    private Entregavel estrategiaEntrega; // Referência para a interface
    //Atributo estático para criar um contador global
    private static int idCount = 0;
    // Toda vez que um pedido for gerado, a contagem de ID irá gera um novo número 
    private final int id;


    // Metodo construtor para inicializar os atributos
    public Pedido(Cliente cliente, Restaurante restaurante, Double valorTotal) {
        // Verificação para saber se valor total, cliente ou restaurante são indefinidos
        // Se forem o código para
        if (valorTotal == null || valorTotal < 0.0) throw new IllegalArgumentException("valorTotal não pode ser negativo (ou null).");
        
        if (cliente == null ) throw new IllegalArgumentException("Nome precisa ser preenchido.");
        
        if (restaurante == null) throw new IllegalArgumentException("Restaurante não pode estar vazio.");

        // Se não ele atribui os valores
        this.id = ++idCount;
        this.restaurante = restaurante;
        this.cliente = cliente;
        this.valorTotal = valorTotal;

    }

    // Metodo para associar o parametro recebido a variável
    public void setEstrategiaEntrega(Entregavel estrategia) {
        this.estrategiaEntrega = estrategia;
    }

    public void finalizarPedido() {
        if (estrategiaEntrega != null) {
            estrategiaEntrega.realizarEntrega();
        }
    }

    // Metodo GETTERS para exibiri as informações do pedido
    public String getExibirInformacao() {
        return """

                =================================
                    --- COMANDA DO PEDIDO ---
                =================================
                Pedido Nº  : %03d
                Cliente    : %s
                telefone   : %s
                Restaurante: %s
                ---------------------------------
                TOTAL: R$ %.2f
                =================================
                """.formatted(id,cliente.getNome(), cliente.getTelefone() ,restaurante.getNome(), valorTotal);
    }
}

