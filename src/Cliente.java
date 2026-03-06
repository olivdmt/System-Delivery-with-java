public class Cliente {
    // Atributos para representar o consumidor
    private String nome;
    private String telefone;

    // Método construtor para garantir que os objetos nasçam válidos.
    public Cliente(String nome, String telefone) {

        // Verifica se o nome do Cliente está vazio.
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Cliente não pode ser nulo!");

        // Se estiver preenchido então atribui aos objetos.
        this.nome = nome;
        this.telefone = telefone;
    }

    // GETTERS, para retornar nome e telefone caso seja preciso vizualizar
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    // // GETTER para exibir as informações privadas
    // public String getExibirInformacoesCliente() {
    //     return """
    //             Nome: %s
    //             Telefone: %s
    //             """.formatted(nome, telefone);
    // }

}
