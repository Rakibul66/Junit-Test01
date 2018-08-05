/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopruebasunitarias;

/**
 *
 * @author Rakibul Hasan
 */
public class EjemploPruebasUnitarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               EjemploPruebasUnitarias m=new EjemploPruebasUnitarias();
        System.out.println(m.sum(2,3));
       System.out.println(m.mult(2,3)); 
    }
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int mult(int a,int b){
        return a*b;
    }
    
    
}
