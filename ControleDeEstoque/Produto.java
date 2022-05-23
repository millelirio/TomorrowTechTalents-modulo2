package ControleDeEstoque;

public class Produto {
    private String nome;
    private int secao;
    private String tipo;
    private int quantidade;
    private String marca;
    private static int contador =0;
    private int id;

    public Produto() {
        ++contador;
        this.id = contador;

    }


    public Produto(String nome, int secao, String tipo, int quantidade, String marca, int id) {
        this();
        this.nome = nome;
        this.secao = secao;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.marca = marca;
    }
    //getters


    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }
 //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static void setContador(int contador) {
        Produto.contador = contador;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "- Nome: " + nome + "- Seção: " + secao +
                "- Tipo: " + tipo + "- Quantidade no estoque: " + quantidade + "- Marca do produto: " + marca;
    }


}
