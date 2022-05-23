package ControleDeEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleEstoque {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println('\t' + "Controle de Estoque");
        System.out.println("Insira o nome do estoque: ");
        String nomeEstoque = sc.nextLine();
        Estoque estoque = new Estoque(nomeEstoque, new ArrayList<>());

        int op= 0;
        do {
            System.out.println('\t' + "Menu");
            System.out.println("1 - Adicionar novo produto\n 2- Remover produto\n 3- Listar produtos no estoque\n 4- Ler produto por id\n 5- Atualizar produtos\n 6- Sair");
            System.out.println("Insira sua escolha: ");
            op = sc.nextInt();
            switch (op){
                case 1: estoque.adicionarProduto();
                break;
                case 2:
                    System.out.println("Digite o id do produto que deseja remover do estoque: ");
                    int idDeletar = sc.nextInt();
                    estoque.deletarProduto(idDeletar);
                    break;
                case 3: estoque.listarProdutos();
                         break;
                case 4:
                    System.out.println("Digite o id do produto que deseja ler os dados: ");
                    int idLerProduto = sc.nextInt();
                    estoque.lerProduto(idLerProduto);
                    break;
                case 5:
                    System.out.println("Digite a id do produto que deseja atualizar: ");
                    int idAtualizarProduto = sc.nextInt();
                    estoque.atualizarProduto(idAtualizarProduto);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        while (op != 6);
}
}
