package ControleDeEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    public String nome;
    private List<Produto> listaProdutos = new ArrayList<Produto>();
    private static int contador = 0;
    private int id;

    public Estoque(){
        ++contador;
        this.id = contador;
    }
    public Estoque(String nome,List<Produto> listaProdutos ) {
        this();
        this.nome = nome;
        this.listaProdutos = new ArrayList<>();
    }



    //getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto() {
        Scanner sc = new Scanner(System.in);
        Produto novoProduto = new Produto();

        System.out.println("Insira o nome do produto: ");
        novoProduto.setNome(sc.nextLine());
        System.out.println("Insira a seção em que o produto se encontra: ");
        novoProduto.setSecao(sc.nextInt());
        sc.nextLine();
        System.out.println("Insira o tipo do produto: ");
        novoProduto.setTipo(sc.nextLine());
        System.out.println("Insira a quantidade de produtos: ");
        int quantidade = sc.nextInt();
        novoProduto.setQuantidade(quantidade);
        sc.nextLine();
        System.out.println("Insira a marca do produto: ");
        novoProduto.setMarca(sc.nextLine());
        if (!verificarProduto(novoProduto)) {
            this.listaProdutos.add(novoProduto);
            System.out.println("Produto adicionado!!");
        } else {
            for(Produto produtoNoEstoque : listaProdutos){
                if (produtoNoEstoque.getNome().equalsIgnoreCase(novoProduto.getNome()) && produtoNoEstoque.getMarca().equalsIgnoreCase(novoProduto.getMarca())){
                produtoNoEstoque.setQuantidade(produtoNoEstoque.getQuantidade() + quantidade);
            }
                System.out.println("Produto já existente, quantidade no estoque atualizada!!");
            }
        }
    }


    public void deletarProduto(int id){
        for(Produto produto: listaProdutos){
            if( produto.getId() == id){
                if (verificarProduto(produto)) {
                    this.listaProdutos.remove(produto);
                    System.out.println("Produto removido!!");
                }
                else {
                    System.out.println("Não foi possível realizar a operação, o produto não existe!");
                }
            }

        }


    }
    public void atualizarProduto(int id){
        Scanner sc = new Scanner(System.in);
        for( Produto produto : listaProdutos){
            if( produto.getId() == id){
                System.out.println("Insira o novo nome do produto: ");
                produto.setNome(sc.nextLine());
                System.out.println("Insira a nova seção em que o produto se encontra: ");
                produto.setSecao(sc.nextInt());
                sc.nextLine();
                System.out.println("Insira o novo tipo do produto: ");
                produto.setTipo(sc.nextLine());
                System.out.println("Insira a nova quantidade de produtos: ");
                int quantidade = sc.nextInt();
                produto.setQuantidade(quantidade);
                sc.nextLine();
                System.out.println("Insira a nova marca do produto: ");
                produto.setMarca(sc.nextLine());
            }
        }



    }
    public void listarProdutos(){
        if(this.listaProdutos.isEmpty()){
            System.out.println("Não existem produtos ainda no estoque!");
        }
        else{
            for( Produto produto: listaProdutos){
                System.out.println(produto.toString());
            }

        }
    }
    public void lerProduto(int id) {
            for (Produto produto : listaProdutos) {
                if (produto.getId() == id) {
                    if(verificarProduto(produto)){
                        System.out.println(produto.toString());
                } else {
            System.out.println("Este produto não existe!");
            }
                }
            }
    }


        public boolean verificarProduto (Produto produto){
            boolean produtoExiste = false;
            for(Produto produtoNoEstoque : listaProdutos){
                if (produtoNoEstoque.getNome().equalsIgnoreCase(produto.getNome()) && produtoNoEstoque.getMarca().equalsIgnoreCase(produto.getMarca())){
                    produtoExiste = true;
                }
                else {
                    produtoExiste = false;
                }
            }
            return produtoExiste;
        }

    }



