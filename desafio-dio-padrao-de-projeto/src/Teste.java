import one.digital.innovation.desafio.facade.Facade;

public class Teste {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();

        facade.adicionarPet("Gato", "Gatito", "Rua1, 123", 11, 12345l);
        facade.adicionarPet("Cachorro", "Perito", "Rua2, 321", 157, 54321l);
        // Pesquisando pets por especie
        facade.pesquisarPorEspecies("Cachorro");
        // Removendo pelo id
        facade.removerPet(12345l);
        
    
    }
}
