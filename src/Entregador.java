public class Entregador extends Usuario {
    public Entregador(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String getDados() {
        return """
                ========== Entregador ==========

                Nome     : %s
                Email    : %s
                Telefone : %s

                ================================
                """.formatted(nome, email, telefone);
    }
}
