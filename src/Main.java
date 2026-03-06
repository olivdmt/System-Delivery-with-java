public class Main {
    public static void main(String[] args) {
        
        // Instância o restaurante já criando o objeto e passando os parâmetros (nome, endereco, categoria)
        // Usando o metódo construtor (Restaurante)
        Restaurante burgerLab = new Restaurante("BURGUERLAB", "Rua dos bobos, nº 7", "Hamburgueria, pizzaria, Pastéis");
        Restaurante vodica = new Restaurante("Vó Dica", "Rua dos sem tetos, nº 508", "Pizzaria e Sorveteria");

        //Instância os Clientes passando os parâmetros (nome, telefone)
        // Usando o método construtor (Cliente)
        Cliente marlonBrandon = new Cliente("Marlon Brandon", "35 9 9995-4446");
        Cliente jeanCloud = new Cliente("Jean Cloud", "45 9 9996-7856");
        
        // Instância o SistemaDelivery para conseguir criar o pedido
        SistemaDelivery sistema = new SistemaDelivery();
        sistema.criarPedido(jeanCloud, burgerLab, 475.75);
        sistema.criarPedido(marlonBrandon, vodica, 1254.00);

        // System.out.print(" --- RELATÓRIO DE PEDIDOS --- \n");
        System.out.println(sistema.getListarPedido());
    }
}
