public class Login {

    String nome;
    int nmr;

    public Login(String nome, int nmr) {
        this.nome = nome;
        this.nmr = nmr;
    }

    public String getNome() {
        return nome;
    }

    public int getNmr() {
        return nmr;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNmr(int nmr) {
        this.nmr = nmr;
    }

    public String evento() {
        String evento =
                "1 - visualizar produtos no estoque \n" +
                        "2 - inserir produto \n" +
                        "3 - excluir produto \n" +
                        "4 - editar produto \n" +
                        "5 - mostrar login \n";
        return evento;

    }
}
