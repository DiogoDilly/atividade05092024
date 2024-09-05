/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;
import java.util.Scanner;

public class Pedidos {
    Scanner sc = new Scanner(System.in);
    private int confir;
    private int numero1;
    private int numero2;
    private int numero3;
    

    public Pedidos(int confir,int numero1,int numero2,int numero3 ){
        this.confir = confir;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        
        
        
        
    }

    public int getConfir() {
        return confir;
    }

    public void setConfir(int confir) {
        this.confir = confir;
    
    
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
public void impri(){
    System.out.println("digite 1 para pedir a lista de produtos");
    confir = sc.nextInt();
    if (confir == 1){    
    if (numero1 < 10){
        System.out.println("temos:" +numero1+" unidades");
    }
    if (numero2 < 10){
        System.out.println("temos:" +numero2 +" unidades");
    }    
        if (numero3 < 10) {
            System.out.println("temos:" +numero3 +" unidades");   
        }
    }
    
}

    

}


