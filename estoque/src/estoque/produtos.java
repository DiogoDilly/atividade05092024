

package estoque;
import java.util.Scanner;

public class produtos {
    Scanner sc = new Scanner(System.in);
    private int numerodig;
    private int numprod;
    private String produto;
    public produtos (int numprod,String produto){
        this.numprod = numprod;
        this.produto = produto;
        this.numerodig = numerodig;
        
    }

    public int getNumprod() {
        return numprod;
    }

    public void setNumprod(int numprod) {
        this.numprod = numprod;
    }

    public String getProduto() {
        return produto;
    }

    public int getNumerodig() {
        return numerodig;
    }

    public void setNumerodig(int numerodig) {
        this.numerodig = numerodig;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    public void impri(){
        System.out.println("quantos produtos você quer adicionar");
        numerodig = sc.nextInt();
        numprod = numprod + numerodig;
        System.out.println("produto adicionado");
        System.out.println("numero de produtos:"+ numprod);
        
        
        
        
    }
    
    
}
