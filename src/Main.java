import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Estoque> produtos = new ArrayList<>();
        Estoque estoque = new Estoque();
        int escolha = 0;
        int id = 0;

        System.out.println("Faça seu login ");
        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Numero de cadastro: ");
        int nmr = sc.nextInt();

        Login login = new Login(nome, nmr);

        System.out.println();
        System.out.println("Bem vindo " + login.getNome() + "!");
        System.out.println();

        System.out.println(login.evento());

        while (escolha != 5) {
            System.out.println(login.evento());
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Estoque completo: ");
                estoque.visualizarEstoque(produtos);
                System.out.println();

            } else if (escolha == 2) {
                System.out.println("Inserir produto: ");
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.next();

                produtos.add(new Estoque(id += 1, nomeProduto));

                System.out.println();
                System.out.println("Produto inserido!");
                System.out.println();

            } else if (escolha == 3) {
                estoque.visualizarEstoque(produtos);
                System.out.println();
                System.out.print("Id do produto que deseja excluir: ");
                int idExcluir = sc.nextInt();

                produtos.remove(idExcluir);

                System.out.println();
                System.out.println("Produto excluido!");
                System.out.println();

            } else if (escolha == 4) {
                estoque.visualizarEstoque(produtos);
                System.out.println();
                System.out.print("Id do produto que deseja editar: ");
                int idEditar = sc.nextInt();

                System.out.print("Nome: ");
                String nomeEditado = sc.next();

                produtos.get(idEditar - 1).setNome(nomeEditado);

                System.out.println();
                System.out.println("Produto editado!");
                System.out.println();
            }
        }
    }
}