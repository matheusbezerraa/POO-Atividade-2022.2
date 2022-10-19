
package calculodeareaq6;


public class quadrado {
 private double Areaquadrado,Lados;
   
 
   public quadrado(){
       
   }
   
   public quadrado(double Areaquadrado, double Lados){
       super();
       this.Areaquadrado= Areaquadrado;
       this.Lados = Lados;
   }
   
    public double getAreaquadrado() {
        return Areaquadrado;
    }
    public void setAreaquadrado(double Areaquadrado) {
        this.Areaquadrado = Areaquadrado;
    }
    public double getLados() {
        return Lados;
    }
    public void setLados(double Lados) {
        this.Lados = Lados;
    }
    
    public double calculoquadrado(double lado) {
    Areaquadrado = Math.pow(lado, 2) ;
    return Areaquadrado;
   }

}
