public class Produto {
    private String nome;
    private int codigo;
    private int quantidade;
    private double preco;

    public Produto (String nome, int codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String gete() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double calcularTotal() {
        return this.quantidade * this.preco;
    }
    public String getDescricao() {
        return "O" + nome + "tem" + quantidade + "unidades e custa" + preco;
    }
    public boolean precisaReporEstoque() {
        return this.quantidade <= 40;
    }
}
