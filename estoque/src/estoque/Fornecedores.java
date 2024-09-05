/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;
import java.util.Scanner;


public class Fornecedores {
Scanner sc = new Scanner(System.in);
private String pedido;


public Fornecedores(String Fornecedores){
    this.pedido = pedido;
    
    
    
}

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
public void impri(){
    System.out.println("digite seu pedido para o fornecerdor");
    pedido =sc.next();
    System.out.println("seu pedido para o cliente:"+pedido);
    
    
    
}


    
}
