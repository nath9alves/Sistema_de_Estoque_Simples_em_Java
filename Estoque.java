import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: "+produto.getNome());
    }

    public void removerProduto(int codigo) {
        Produto produtoremover = null;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtoremover = produto;
                break;
            }
        }
        if (produtoremover != null) {
            produtos.remove(produtoremover);
            System.out.println("Produto removido: "+produtoremover.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }

    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade() + ", Preco: " + produto.getPreco());
            if (produto.precisaReporEstoque()) {
                System.out.println("Precisa repor estoque." + produto.getNome());
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.calcularTotal();
        }
        return total;
    }


}
