/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosmatrices;

import java.util.Random;

/**
 *
 * @author ESTUDIANTE19
 */
public class metodos {
    public static void matriz1(int matriz[][]){
   
       
        Random aleatorio= new Random();
        matriz = new int [3][3];
          for(int a = 0; a < matriz.length;a++){
            for( int i = 0; i < matriz[a].length;i++){
                matriz[a][i] = aleatorio.nextInt(15);
                
            }
        }
       
         for(int a = 0; a < matriz.length;a++){
            for( int i = 0; i < matriz[a].length;i++){
                System.out.print("[\t" + matriz[a][i] + "\t]\t");
                
            }
             System.out.println();
             
        }
         
         
        
    }
    public static void matriz2(int matriz1[][]){
        Random aleatorio= new Random();
        matriz1 = new int [3][3];
          for(int a = 0; a < matriz1.length;a++){
            for(int i = 0; i < matriz1[a].length;i++){
                matriz1[a][i] = aleatorio.nextInt(15);
            }
        }
       
         for(int a = 0; a < matriz1.length;a++){
            for(int i = 0; i < matriz1[a].length;i++){
                
                System.out.print("[\t" + matriz1[a][i] + "\t]\t");
            }
             System.out.println();
        }
    }
    
    
}
