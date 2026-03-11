package entity;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

        private List<Produto> produtos = new ArrayList<>();

        public void addProdutos(Produto nome){
           produtos.add(nome);
        }

        public void listar(){
            produtos.forEach(System.out::println);
        }

        public double calcularTotal(){
            return produtos.stream().mapToDouble(p -> p.getPreco()).sum();
        }
}
