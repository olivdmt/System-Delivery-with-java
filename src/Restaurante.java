//Classe Restaurante
public class Restaurante {
    // Atributos de isntancia privado
    private String nome;
    private String endereco;
    private String categoria;

    // Método construtor que irá definir os valores dos objetos.
    public Restaurante(String nome, String endereco, String categoria) {
        // Verifica se nome esta vazio
        // Se estiver ele para o código e mostra o erro 
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome do restaurante não pode ser vazio");

        // se não estiver vazio, atribui os valores.
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
    }

    // GETTERS, metodos que vão retornar um parâmetro
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCategoria() {
        return categoria;
    }
    
}
