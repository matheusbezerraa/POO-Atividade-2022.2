
package calculodeareaq6;


public class Circulo {
 private double Areacirculo,PI,Raio;
 
    public Circulo(){
        
    }
   
    public Circulo(double Areacirculo, double PI, double Raio ){
    super ();
    this.Areacirculo = Areacirculo;
    this.PI = PI;
    this.Raio = Raio;
    }
    
    public double getAreacirculo() {
        return Areacirculo;
    }
    public void setAreacirculo(double Areacirculo) {
        this.Areacirculo = Areacirculo;
    }
    public double getPI() {
        return PI;
    }
    public void setPI(double PI) {
        this.PI = PI;
    }
    public double getRaio() {
        return Raio;
    }
    public void setRaio(double Raio) {
        this.Raio = Raio;
    
    }
   
    public double calculocirculo(double raiocirculo){
    Areacirculo = Math.PI * Math.pow(raiocirculo,2);    
    return Areacirculo;

              }
}


    

    

   

   
    


