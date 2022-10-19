
package calculodeareaq6;

import calculodeareaq6.Triangulo;
import calculodeareaq6.Retangulo;
import calculodeareaq6.quadrado;
import calculodeareaq6.Circulo;
        
import java.util.Scanner;


public class CalculodeareaQ6 {

   
    public static void main(String[] args) {
     int resposta;
     double area; 
     
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Informe a figura geometrica que voce deseja calcular: ");
     System.out.println("1-Quadrado");
     System.out.println("2-Circulo");
     System.out.println("3-Retangulo");
     System.out.println("4-Triangulo");
     System.out.println("------------------------------------------------------");
     resposta = sc.nextInt();
     if (resposta == 1){ 
        System.out.print("Informe o lado do quadrado: ");
        
        double ladoquadrado = sc.nextDouble();
        
        quadrado quadrado1 = new quadrado();
        quadrado1.calculoquadrado(ladoquadrado);
        quadrado1.setLados(ladoquadrado);
        System.out.println("Lado = "+ quadrado1.getLados());
        System.out.println("Area = "+ quadrado1.getAreaquadrado());
     }
     else if(resposta == 2){ 
        System.out.println("Informe o o raio do circulo");
        
        double raiocirculo = sc.nextDouble();
        
        Circulo circulo1 = new Circulo();
        circulo1.calculocirculo(raiocirculo);
        circulo1.setRaio(raiocirculo);
        System.out.println("Raio = "+ circulo1.getRaio());
        System.out.println("Area= "+ circulo1.getAreacirculo());
      }
     else if (resposta == 3){
    System.out.println("Informe a base do retangulo:");
    System.out.println("Informe a altura do retangulo:");
    
    double baseretangulo = sc.nextDouble();
    double alturaretangulo = sc.nextDouble();
    
    Retangulo retangulo1 = new Retangulo();
      retangulo1.calculoretangulo(baseretangulo, alturaretangulo);
      retangulo1.setBase(baseretangulo);
      retangulo1.setaltura(alturaretangulo);
        System.out.print("Base= "+ retangulo1.getBase());
        System.out.print("Altura= "+ retangulo1.getBase());
        System.out.println("Area= "+retangulo1.getArearetangulo());
     }
     else if (resposta == 4){
         System.out.println("Informe a base do triangulo");
         System.out.println("Informe a altura do triangulo");
         
         double basetriangulo = sc.nextDouble();
         double alturatriangulo = sc.nextDouble();
         
         Triangulo triangulo1 = new Triangulo();
         triangulo1.calculartriangulo(basetriangulo, alturatriangulo);
         triangulo1.setBase(basetriangulo);
         triangulo1.setaltura(alturatriangulo);
            System.out.println("Base= "+triangulo1.getBase());
            System.out.println("Altura= "+triangulo1.getaltura());
            System.out.println("Area= "+triangulo1.getAreatriangulo());
     }
     
    }   
}
