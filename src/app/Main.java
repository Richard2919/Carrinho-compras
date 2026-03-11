package app;

import entity.Carrinho;
import entity.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carrinho carrinho = new Carrinho();
        int opcao = 0;

        System.out.println("Bem vindo ao sistemas de compra");


        while (opcao != 3){

            System.out.println("1. Adicionar item");
            System.out.println("2. Listar itens");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){

                case 1:
                    try {
                        System.out.println("Nome do produto:");
                        String nome = sc.nextLine();

                        System.out.println("Preço do produto:");
                        double preco = Double.parseDouble(sc.nextLine());

                        carrinho.addProdutos(new Produto(nome, preco));

                    } catch (NumberFormatException e) {
                        System.out.println("AVISO: Você deve digitar um número válido!");

                    } catch (IllegalArgumentException e) {
                        System.out.println("AVISO: " + e.getMessage());
                    }

                    break;

                case 2:
                    System.out.println("Itens do carrinho");
                    carrinho.listar();

                    System.out.println("Total: R$ " + carrinho.calcularTotal());
                    break;

                case 3:
                    System.out.println("Saindo... Volte sempre");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }

        sc.close();
    }
}
