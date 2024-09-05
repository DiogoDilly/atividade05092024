/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;
import java.util.Scanner;

public class estoque {
    Scanner sc = new Scanner (System.in);
    private String feijao;
    private String arroz;
    private String carne;
   private int numfeijao;
   private int numarroz;
   private int numcarne;
   private int confir;
    
    
    public estoque(String feijao,String arroz,String carne,int numfeijao,int numarroz,int numcarne){
         
        this.arroz = arroz;
        this.carne = carne;
        this.feijao = feijao;
        this.numarroz = numarroz;
        this.numcarne = numcarne;
        this.numfeijao = numfeijao;
       
        
        
        
    }

    public String getFeijao() {
        return feijao;
    }

    public void setFeijao(String feijao) {
        this.feijao = feijao;
    }

    public String getArroz() {
        return arroz;
    }

    public void setArroz(String arroz) {
        this.arroz = arroz;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public int getNumfeijao() {
        return numfeijao;
    }

    public void setNumfeijao(int numfeijao) {
        this.numfeijao = numfeijao;
    }

    public int getNumarroz() {
        return numarroz;
    }

    public void setNumarroz(int numarroz) {
        this.numarroz = numarroz;
    }

    public int getNumcarne() {
        return numcarne;
    }

    public void setNumcarne(int numcarne) {
        this.numcarne = numcarne;
    }
    public void impri(){
        System.out.println("digite 1 para ver a lista");    
        confir =sc.nextInt();
        
        if(confir == 1){
            System.out.println("lista");
            System.out.println(feijao);
            System.out.println("unidades:"+numfeijao);
            System.out.println(arroz);
            System.out.println("unidades:"+numarroz);
            System.out.println(carne);
            System.out.println("unidades:"+numcarne);
            
        }
        
    }
    
    
    
    
    
}
