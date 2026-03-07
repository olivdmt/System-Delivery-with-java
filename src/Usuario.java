// Usuário genérico para representar qualquer pessoa no sistema
public class Usuario {
    protected String nome;
    protected String email;
    protected String telefone;

    // Metodo construtor para instancia um objeto passando valores
    public Usuario(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    // Metodo para obter os dados deste Usuário
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