package marcelo.ufes.projeto01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Projeto01 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        
        Cliente cliente = new Cliente("Henrique", "Ouro", 0, "Rua tal", "Bela Vista", "Alegre");
        Pedido pedido1 = new Pedido(LocalDate.now(), cliente);
        
        Item item1 = new Item("Livro", 2, 120.0, "Educação");
        Item item2 = new Item("Tablet Samsung ", 1, 320.0, "Educação");
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        
        PedidoService pedidoService = new PedidoService(new CupomDescontoService());
        System.out.println("Valor do Pedido: " + pedido1.getValorPedido());
        
        System.out.println(pedidoService.aplicarCupom(pedido1, "NATAL10"));
        System.out.println("Valor do Pedido: " + pedido1.calcularValorFinal());
        
        System.out.println(pedidoService.aplicarCupom(pedido1, "DESC10"));
        System.out.println("Valor do Pedido: " + pedido1.calcularValorFinal());
        
        System.out.println(pedidoService.aplicarCupom(pedido1, "DESC30"));
        System.out.println("Valor do Pedido: " + pedido1.calcularValorFinal());
        
        System.out.println(pedidoService.aplicarCupom(pedido1, "NATAL10"));
        System.out.println("Valor do Pedido: " + pedido1.calcularValorFinal());
        
        
        while(flag){
            /*
            String nomeCliente, tipoCliente, logradouroCliente, bairroCliente, cidadeCliente;
            double fidelidadeCliente;
            System.out.println("Cliente: ");
            nomeCliente = br.readLine();
            
            System.out.println("Tipo: ");
            tipoCliente = br.readLine();
            
            System.out.println("Fidelidade: ");
            fidelidadeCliente = Double.parseDouble(br.readLine());
            
            System.out.println("Logradouro: ");
            logradouroCliente = br.readLine();
            
            System.out.println("Bairro: ");
            bairroCliente = br.readLine();
            
            System.out.println("Cidade: ");
            cidadeCliente = br.readLine();
            
            Cliente cliente = new Cliente(nomeCliente, tipoCliente, fidelidadeCliente, logradouroCliente, bairroCliente, cidadeCliente);
            */
            /*
            String nomeItem, tipoItem;
            int quantidadeItem;
            double valorItem;
            
            System.out.println("Item: ");
            nomeItem = br.readLine();
            
            if(nomeItem.equals("")){
                flag = false;
                break;
            }
            
            System.out.println("Tipo: ");
            tipoItem = br.readLine();
            
            System.out.println("Quantidade: ");
            quantidadeItem = Integer.parseInt(br.readLine());
            
            System.out.println("Valor UN: ");
            valorItem = Double.parseDouble(br.readLine());
            */
        }
        //calculadoraDeDescontoService.imprimirCupons(pedido1);
    }
}
