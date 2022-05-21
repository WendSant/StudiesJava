package ooComposition.PillarsOOP;

public class TestEncap {

    Encapsulation user = new Encapsulation();

    TestEncap(String nome, Long id, String endereco) {
        this.user.nome = nome;
        this.user.id = id;
        this.user.endereco = endereco;
    }

}
