/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamonTalaveraMoralesPedroJoaquin2122 miJamonTalaveraMoralesPedroJoaquin2122;
        int stockActual;
        
        miJamonTalaveraMoralesPedroJoaquin2122 = new JamonTalaveraMoralesPedroJoaquin2122("5Jotas",580,100);
        vendeJamTalaveraMoralesPedroJoaquin2122(miJamonTalaveraMoralesPedroJoaquin2122);
        
        try
        {
            System.out.println("Compra de Jamones");
            miJamonTalaveraMoralesPedroJoaquin2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
        stockActual = miJamonTalaveraMoralesPedroJoaquin2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void vendeJamTalaveraMoralesPedroJoaquin2122(JamonTalaveraMoralesPedroJoaquin2122 miJamonTalaveraMoralesPedroJoaquin2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonTalaveraMoralesPedroJoaquin2122.vender(80, "Espa\u00f1a");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
