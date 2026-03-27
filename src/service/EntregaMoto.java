package service;

public class EntregaMoto implements  Entregavel {
    @Override
    public void realizarEntrega() {
        System.out.println("O motoqueiro já saiu para entrega");
    }
}
