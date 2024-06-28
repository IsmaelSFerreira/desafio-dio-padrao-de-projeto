package subsistemaGerenciamentoPet;

import java.util.ArrayList;
import java.util.List;
import subsistemaPet.Pet;

public class PetGerenciador {

    private List<Pet> listaPet;

    public PetGerenciador() {

        this.listaPet = new ArrayList<>();
    }

    public void adicionarPet(String especie, String nome, String endereco, int idade, Long id) {

        Pet adicionaPet = new Pet(especie, nome, endereco, idade, id);

        adicionaPet.setEspecie(especie);
        adicionaPet.setNome(nome); 
        adicionaPet.setEndereco(endereco); 
        adicionaPet.setIdade(idade);
        adicionaPet.setId(id);

        listaPet.add(adicionaPet);
        System.out.println("Pet adicionado com sucesso!");
        System.out.println(adicionaPet);
      }
      
      

    public List<Pet> pesquisarPorEspecies(String especie) {

        List<Pet> petEspecie = new ArrayList<>();
        
        for (Pet p : listaPet) {
            if (p.getEspecie() != null && p.getEspecie().equalsIgnoreCase(especie)) {
                petEspecie.add(p);
            }
        }
        return petEspecie;
    }

    public void removerPet(Long id) {
        
        if (id == null) {
          throw new IllegalArgumentException("ID do pet não pode ser nulo.");
        }

        List<Pet> removePet = new ArrayList<>();
        for (Pet p : listaPet) {
          if (p.getId().equals(id)) {
            removePet.add(p);
          }

        }

        listaPet.removeAll(removePet);
        System.out.println("Pet com id: " + id + " removido com sucesso!");
      }
      
}
