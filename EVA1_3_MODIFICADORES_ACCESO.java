/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_modificadores_acceso;

import Otro_paquete.NO_SE;

/**
 *
 * @author nacho
 */
public class EVA1_3_MODIFICADORES_ACCESO {
   public int x;
   protected int y;
   private int z;
   int w;
    public static void main(String[] args) {
        //PruebaA es default
        PruebaA objetoA= new PruebaA();
        //objetoA. --> puedo ver x (public)
        //puedo ver a y (protected)
        //puedo ver a w (default)
    NO_SE otro_objetoB= new NO_SE(); 
    //otro_objetoB. x--> se ve x porque es public 
    //los demas no son visibles
    //PruebaB objetoB= new PruebaB();    }
}
}
class PruebaA{
   public int x;
   protected int y;
   private int z;
   int w;
}
