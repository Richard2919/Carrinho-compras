package entity;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

        private List<Produto> produtos = new ArrayList<>();

        public void addProdutos(Produto p){
            if (p == null){
                throw new IllegalArgumentException("Erro: O produto não pode ser nulo.");
            }

            if (p.getPreco() < 0 || p.getNome().isEmpty()){
                throw new IllegalArgumentException("Erro: Dados do produto inválidos (Preço negativo ou nome vazio).");
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
