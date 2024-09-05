/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        produtos t1 = new produtos(27, "");
        Fornecedores t2 = new Fornecedores("");
        Pedidos t3 = new Pedidos(29,8,2);
        estoque t4 = new estoque("","","",29,8,2);
        
        
        
        System.out.println("atividade 1:");
        t1.impri();
        t2.impri();
        t3.impri();
        
        
        System.out.println("atividade 2:");
        
        
        
    }
}

    

