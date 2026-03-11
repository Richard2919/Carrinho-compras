package entity;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

        private List<Produto> produtos = new ArrayList<>();

        public void addProdutos(Produto p){
            if (p == null){
                System.out.println("Nome invalido");
                return;
            }

            if (p.getPreco() < 0 || p.getNome().isEmpty()){
                System.out.println("Erro: dados do produto inválido");
            }else {
                produtos.add(p);
                System.out.println("Produto " + p.getNome() + " adicionado com sucesso!");
            }
        }

        public void listar(){
            produtos.forEach(System.out::println);
        }

        public double calcularTotal(){
            return produtos.stream().mapToDouble(p -> p.getPreco()).sum();
        }
}
