public class Main {
    public static void main(String[] args) {
        
        // Usamos o polimorfismo salvando na variável Usuario 
        // Instanciando Cliente e Entregador
        Usuario c1 = new Cliente("Mais duro", "maisduro@gmail.com", "35 9 99255418");
        Usuario c2 = new Cliente("Sherfloock", "sherfloock@outlook.com", "34 9 99566745");
        
        // e1 representa o entregador
        Usuario e1 = new Entregador("Robertin DuGrau", "robertin@dugrau.com", "10 09977654");
        Usuario e2 = new Entregador("Paulin 244", "paulin@doiquatro.com", "24 454443321");

        // Atráves do elemento Pai estamos sobreescrevendo os dados
        System.out.println(c1.getDados());
        System.out.println(c2.getDados());
        System.out.println(e1.getDados());
        System.out.println(e2.getDados());
        
    }
}
