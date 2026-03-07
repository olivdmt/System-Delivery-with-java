public class Cliente extends Usuario {
    // Usamos o construtor para criar o objeto no elemento pai definido
    public Cliente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String getDados() {
        return """
        ========== Cliente ==========

        Nome     : %s
        Email    : %s
        Telefone : %s

        ================================
        """.formatted(nome, email, telefone);
    }
    
    
}
