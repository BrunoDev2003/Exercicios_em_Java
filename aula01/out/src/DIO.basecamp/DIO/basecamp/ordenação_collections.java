package DIO.basecamp;

import java.util.ArrayList;
import java.util.List;
public class ordenação_collections {
    public static void main(String[] args) {

        List<Gato> Gatos = new ArrayList<>(){{
            String nome;
            add(new Gato (nome:"Luis", idade:18, cor:"branco"));
            add(new Gato (nome:"Luis", idade:18, cor:"branco"));
            add(new Gato (nome:"Luis", idade:18, cor:"branco"));
        }}; 
        System.out.println(Gatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;
    
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato [cor=" + cor + ", idade=" + idade + ", nome=" + nome + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    
}
