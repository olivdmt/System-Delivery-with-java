package service;

public class EntregaBicicleta implements  Entregavel{
    @Override
    public void realizarEntrega() {
        System.out.println("O entregador já saiu para entrega ecológica!!");
    }
}
