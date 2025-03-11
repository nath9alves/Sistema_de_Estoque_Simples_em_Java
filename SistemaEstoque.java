import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n----> Sistema de Estoque <----\n");
            System.out.println("1. Adicionar Produto\n");
            System.out.println("2. Remover Produto\n");
            System.out.println("3. Listar Produtos\n");
            System.out.println("4. Calcular Capital Total em Estoque\n");
            System.out.println("5. Fechar Sistema\n");
            System.out.print("Escolha uma opção: \n");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: \n");
                    String nome = scanner.nextLine(); // Usar nextLine() para ler strings com espaços
                    System.out.print("Código do produto: \n");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha pendente
                    System.out.print("Quantidade: \n");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha pendente
                    System.out.print("Preço unitário: \n");
                    double precoUnitario = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha pendente
                    Produto novoProduto = new Produto(nome, codigo, quantidade, precoUnitario);
                    estoque.adicionarProduto(novoProduto);
                    break;

                case 2:
                    System.out.print("Código do produto a ser removido: \n");
                    int codigoRemover = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha pendente
                    estoque.removerProduto(codigoRemover);
                    break;

                case 3:
                    estoque.listarProdutos();
                    break;

                case 4:
                    System.out.println("Capital total em estoque: R$ " + estoque.calcularTotal() + " \n");
                    break;

                case 5:
                    executando = false;
                    System.out.println("Fechando o sistema...\n");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }

    }
}