package one.digital.innovation.desafio.facade;

import java.util.List;

import subsistemaGerenciamentoPet.PetGerenciador;
import subsistemaPet.Pet;

public class Facade {

    private PetGerenciador petGerenciador;

    public Facade() {
        this.petGerenciador = new PetGerenciador();
    }

    public void adicionarPet(String especie, String nome, String endereco, int idade, Long id) {
        petGerenciador.adicionarPet(especie, nome, endereco, idade, id);
    }

    public void removerPet(Long id) {
        petGerenciador.removerPet(id);
    }

    public List<Pet> pesquisarPorEspecies(String especie) {
        return petGerenciador.pesquisarPorEspecies(especie);
    }

}
