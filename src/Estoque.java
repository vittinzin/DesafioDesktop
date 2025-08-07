import java.util.List;

public class Estoque {

    int id;
    String nome;

    public Estoque() {
    }

    public Estoque(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void visualizarEstoque(List<Estoque> produtos){
        for (Estoque p : produtos){
            System.out.println("id "+ p.id + " - " + p.nome);
        }
    }
}
