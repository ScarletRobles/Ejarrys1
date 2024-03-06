/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejarrys;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Ejarrys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        ArrayList<Aprendiz> listaAprendiz = new ArrayList<Aprendiz>();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Aprendiz miAp = new Aprendiz();
            miAp.setId(i);
            System.out.println("ingrese el nombres: ");
            miAp.setNombre(teclado.next());
            System.out.println("ingrese nota 1: ");
            miAp.setNota1(teclado.nextInt());
            System.out.println("ingrese nota 2: ");
            miAp.setNota2(teclado.nextInt());
            System.out.println("ingrese nota 3: ");
            miAp.setNota3(teclado.nextInt());
            
            
          
            listaAprendiz.add(miAp);
            
        }
        
        System.out.println("Nombres y el promedio: ");
        for(Aprendiz var:listaAprendiz){
            System.out.println(var.getNombre());
            float prom = var.promedio();
            System.out.println(prom);
            
        }
        
    }
    
}
