
package bhaskaraq3;

import static java.lang.Math.sqrt;
  import javax.swing.JOptionPane;

 public class calculo {
 
    public Double a;
    public Double b;
    public Double c;
    public Double delta;
    public Double raizdelta;
    public Double r1;
    public Double r2;
    
    public void calcular(){
        a = Double.parseDouble(JOptionPane.showInputDialog("(_)x2 + Bx + C = 0"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ax2 + (_)x + C = 0"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Ax2 + Bx + (_) = 0"));
        delta = Math.pow(b, 2) - 4 * a * c;
        raizdelta = Math.sqrt(delta);
        r1 = (-b + raizdelta) / 2 * a;
        r2 = (-b - raizdelta) / 2 * a;
        
        
        if (delta < 0){
            JOptionPane.showMessageDialog(null,"não existem raizes reais para valores de delta negativos");
            JOptionPane.showMessageDialog(null, "delta " + delta);
        }
        else if (delta == 0){
            JOptionPane.showMessageDialog(null, "a raiz da equação é " + r1); 
            JOptionPane.showMessageDialog(null, "delta " + delta);
        }
        else {
            JOptionPane.showMessageDialog(null, "As raizes da equação são: r1: "+ r1 +" e r2 " + r2);
            JOptionPane.showMessageDialog(null, "delta " + delta);
        
        }
  
    }
 }

