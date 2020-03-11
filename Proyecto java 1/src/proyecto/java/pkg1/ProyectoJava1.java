/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.java.pkg1;

/**
 *
 * @author Wilson
 */
public class ProyectoJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        imprimirNombre();
        sumar2Numeros(3,2);
        System.out.println(sumar2Numeros (3,2));
     
        // TODO code application logic here
    }
    //comentario de una linea//
    
    //DECLARAR VARIABLES//
    int numeroEntero = 5;
    double numeroDouble = 3.14;
    char letra = 'A';
    String cadena = "hola mundo";
    boolean valorBoolean = false;
    boolean valorBool = true;
        /*solo numeros que representan las distintas fnciones de la ecuacion
    dada en el libro de la materia vista
    */
    
    public static void imprimirNombre(){
      //System.out.println("juan \n perez");
      //System.out.println("kev\tin");
      String nombre= "  Juann  ";
      System.out.println(nombre.length());
      System.out.println(nombre.trim());
      System.out.println(nombre.toUpperCase());
      System.out.println(nombre.toLowerCase());
      System.out.println(nombre.replace(nombre, "orlando"));
      System.out.println(nombre.split(" "));





}
    public static int sumar2Numeros(int num1, int num2) {
         int suma = num1 + num2;
        return suma;
}
}