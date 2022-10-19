
package calculodeareaq6;


public class Retangulo {
 private double Arearetangulo,Base,altura;
          
  public Retangulo(){
      
  }

  public Retangulo(double Arearetangulo, double Base, double altura){
      super();
      this.Arearetangulo = Arearetangulo;
      this.Base = Base;
      this.altura = altura;
  }
 
    public double getArearetangulo() {
        return Arearetangulo;
    }
    public void setAlturaretangulo(double Arearetangulo) {
        this.Arearetangulo = Arearetangulo;
    }
    
    public double getBase() {
        return Base;
    }
    public void setBase(double Base) {
        this.Base = Base;
    }
    
    public double getaltura() {
        return altura;
    }
    public void setaltura(double altura) {
        this.altura = altura;
    }
    
    public double calculoretangulo(double Base, double altura){
         Arearetangulo = Base * altura;
         return Arearetangulo;
 }

  
    }

  
    

    
      



