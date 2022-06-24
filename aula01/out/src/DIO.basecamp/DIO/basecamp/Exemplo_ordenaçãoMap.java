package DIO.basecamp;


import java.util.HashMap;
import java.util.Map;
//import java.util.Objects;
import java.util.Map.Entry;
public class Exemplo_ordenaçãoMap {
    private static Entry<String, Livro> livro;

    public static void main(String[] args) {
        System.out.println("Dados as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e orene esse dicionario: exibindo (Nome Autor - Nome Livro)");

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
           //

        }};
        for(Map.Entry<String, Livro>livro : meusLivros.entrySet());
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println(livro);

    }

class Livro {
    private String nome;
    private Integer paginas;
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getEnclosingInstance().hashCode();
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }
    private Exemplo_ordenaçãoMap getEnclosingInstance() {
        return Exemplo_ordenaçãoMap.this;
    }
    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
    
    
    
}
}
