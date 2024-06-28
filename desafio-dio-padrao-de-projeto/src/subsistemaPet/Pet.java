package subsistemaPet;


public class Pet {


    String especie;
    String nome;
    String endereco;
    int idade;
    Long id;


    public Pet(String especie, String nome, String endereco, int idade, Long id) {

        System.out.println("Pet adicionado.");
        System.out.println(nome);
        System.out.println(especie);
        System.out.println(idade);
        System.out.println(endereco);
    }


    @Override
    public String toString() {
        return "Pet [especie=" + especie + ", nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", id="
                + id + "]";
    }


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    
    

}

