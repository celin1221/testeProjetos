
package marcelo.ufes.projeto01;

import java.time.LocalDate;

public class Projeto01 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Henrique", "Ouro", 0, "Rua tal", "Bela Vista", "Alegre");
        Item item1 = new Item("Livro", 1, 120.0, "Educação");
        Item item2 = new Item("Tablet Samsung ", 1, 3200.0, "Educação");
        Pedido pedido1 = new Pedido(LocalDate.now(), cliente);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        
        CalculadoraDeDescontoService calculadoraDeDescontoService = new CalculadoraDeDescontoService();
        calculadoraDeDescontoService.CalcularDesconto(pedido1);
        calculadoraDeDescontoService.imprimirCupons(pedido1);
    }
}
