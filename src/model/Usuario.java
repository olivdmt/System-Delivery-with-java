package model;

// Usuário genérico para representar qualquer pessoa no sistema
public abstract class Usuario {
    private String nome;
    private String email;
    private String telefone;

    // Construtor usado para a instância um objeto passando valores
    public Usuario(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    // Metodo para obter os dados deste Usuário
    public String getDados() {
        return """
                ========== %s ==========

                Nome     : %s
                Email    : %s
                Telefone : %s

                ================================
                """.formatted( this.getClass(), nome, email, telefone);
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
}