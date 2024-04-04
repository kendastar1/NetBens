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
         int columnaSums []= new int[matriz[0].length];
         int columnaSums1 []= new int[matriz[0].length];
          for(int a = 0; a < matriz.length;a++){
            for( int i = 0; i < matriz[a].length;i++){
                matriz[a][i] = aleatorio.nextInt(15);
                columnaSums[i] += matriz[a][i];
                columnaSums1[a] += matriz[a][i];
                
            }
        }
       
         for(int a = 0; a < matriz.length;a++){
            for( int i = 0; i < matriz[a].length;i++){
                System.out.print("[\t" + matriz[a][i] + "\t]\t");
              
                
            }
             System.out.println();
             
        }
         for (int sum : columnaSums) {
            System.out.println("La suma de las columnas es "+sum);
            double promedio =(double) sum /3;
            System.out.println("el promedio de la columna es " + promedio);
        }
           for (int sum1 : columnaSums1) {
            System.out.println("La suma de las filas es "+sum1);
            double promedio =(double) sum1 /3;
            System.out.println("el promedio de la columna es " + promedio);
        }
         
      
         
         
        
    }
    public static void matriz2(int matriz1[][]){
        Random aleatorio= new Random();
        matriz1 = new int [3][3];
        int columnaSums []= new int[matriz1[0].length];
         int columnaSums1 []= new int[matriz1[0].length];
          for(int a = 0; a < matriz1.length;a++){
            for(int i = 0; i < matriz1[a].length;i++){
                matriz1[a][i] = aleatorio.nextInt(15);
                 columnaSums[i] += matriz1[a][i];
                 columnaSums1[a] += matriz1[a][i];
            }
        }
       
         for(int a = 0; a < matriz1.length;a++){
            for(int i = 0; i < matriz1[a].length;i++){
                
                System.out.print("[\t" + matriz1[a][i] + "\t]\t");
            }
             System.out.println();
        }
           for (int sum : columnaSums) {
            System.out.println("La suma de las columnas es "+sum);
            double promedio = (double)sum /3;
            System.out.println("el promedio de la columna es " + promedio);
        }
           for (int sum1 : columnaSums1) {
            System.out.println("La suma de las filas es "+sum1);
             double promedio =(double) sum1 /3;
            System.out.println("el promedio de la columna es " + promedio);
        }
    }
    
    
}
