/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recivos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE19
 */
public class Recivos {

    public static void main(String[] args) {
        int agua;
        int luz;
        int telefono;
        int estrato;
        String nombre;
        int cedula;
        String direccion;
        String previo;
        int empresa;
        int edificio;
        int resultado;
        int resultado1;

        
        
        agua = luz = telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Que servicio deseas pagar \n 1. agua \n 2. luz \n 3. telefono " ));
        if(agua == 1){
            JOptionPane.showMessageDialog(null, "Haz digitado 1. servicio de agua");
            cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la cedula del usuario " ));
            nombre = JOptionPane.showInputDialog(null, "Digita el nombre del usuario " );
            direccion = JOptionPane.showInputDialog(null, "Digita la direccion " );
            previo = JOptionPane.showInputDialog(null, "Digita el previo " );
            estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el estrato al que pertenece 1 2 3 o 4 " ));
            
            JOptionPane.showMessageDialog(null, "Cedula : " + cedula + "\n Nombre " + nombre + "\n direccion " + direccion + "\n previo " + previo + "\n estrato " + estrato);
            
            if (estrato == 1){
                if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 8000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(agua);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 8000;
                resultado = (int) (agua * 0.10);
                resultado1 = agua + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 8000;
                resultado = (int) (agua * 0.25);
                resultado1 = agua + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                
                
                
            }
            else if (estrato == 2){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 16000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(agua);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 16000;
                resultado = (int) (agua * 0.10);
                resultado1 = agua + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 16000;
                resultado = (int) (agua * 0.25);
                resultado1 = agua + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
               
            }
             else if (estrato == 3){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 20000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(agua);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 20000;
                resultado = (int) (agua * 0.10);
                resultado1 = agua + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 20000;
                resultado = (int) (agua * 0.25);
                resultado1 = agua + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                 
            }
             else if (estrato == 4){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 35000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(agua);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 35000;
                resultado = (int) (agua * 0.10);
                resultado1 = agua + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                agua = 35000;
                resultado = (int) (agua * 0.25);
                resultado1 = agua + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                
            }
             else {
                 JOptionPane.showMessageDialog(null, " no digito correctamente el estrato  ");
             }
            if(luz == 2){
            JOptionPane.showMessageDialog(null, "Haz digitado 1. servicio de agua");
            cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la cedula del usuario " ));
            nombre = JOptionPane.showInputDialog(null, "Digita el nombre del usuario " );
            direccion = JOptionPane.showInputDialog(null, "Digita la direccion " );
            previo = JOptionPane.showInputDialog(null, "Digita el previo " );
            estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el estrato al que pertenece 1 2 3 o 4 " ));
            
            JOptionPane.showMessageDialog(null, "Cedula : " + cedula + "\n Nombre " + nombre + "\n direccion " + direccion + "\n previo " + previo + "\n estrato " + estrato);
            
            if (estrato == 1){
                if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 40000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(luz);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 40000;
                resultado = (int) (luz * 0.10);
                resultado1 = luz + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 40000;
                resultado = (int) (luz * 0.25);
                resultado1 = luz + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                
                
                
            }
            else if (estrato == 2){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 60000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(luz);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 60000;
                resultado = (int) (luz * 0.10);
                resultado1 = luz + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 60000;
                resultado = (int) (luz * 0.25);
                resultado1 = luz + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
               
            }
             else if (estrato == 3){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 80000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(luz);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 80000;
                resultado = (int) (luz * 0.10);
                resultado1 = luz + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 80000;
                resultado = (int) (luz * 0.25);
                resultado1 = luz + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                 
            }
             else if (estrato == 4){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 120000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(luz);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 120000;
                resultado = (int) (luz * 0.10);
                resultado1 = luz + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                luz = 120000;
                resultado = (int) (luz * 0.25);
                resultado1 = luz + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                
            }
             else {
                 JOptionPane.showMessageDialog(null, " no digito correctamente el estrato  ");
             }
             if(telefono == 3){
            JOptionPane.showMessageDialog(null, "Haz digitado 1. servicio de agua");
            cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la cedula del usuario " ));
            nombre = JOptionPane.showInputDialog(null, "Digita el nombre del usuario " );
            direccion = JOptionPane.showInputDialog(null, "Digita la direccion " );
            previo = JOptionPane.showInputDialog(null, "Digita el previo " );
            estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el estrato al que pertenece 1 2 3 o 4 " ));
            
            JOptionPane.showMessageDialog(null, "Cedula : " + cedula + "\n Nombre " + nombre + "\n direccion " + direccion + "\n previo " + previo + "\n estrato " + estrato);
            
            if (estrato == 1){
                if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 20000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(telefono);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono= 20000;
                resultado = (int) (telefono * 0.10);
                resultado1 = telefono + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 20000;
                resultado = (int) (telefono * 0.25);
                resultado1 = telefono + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                
                
                
            }
            else if (estrato == 2){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 25000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(telefono);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 25000;
                resultado = (int) (telefono * 0.10);
                resultado1 = telefono + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 25000;
                resultado = (int) (telefono * 0.25);
                resultado1 = telefono + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
               
            }
             else if (estrato == 3){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 35000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(agua);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 35000;
                resultado = (int) (telefono * 0.10);
                resultado1 = telefono + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 80000;
                resultado = (int) (telefono * 0.25);
                resultado1 = telefono + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                 
            }
             else if (estrato == 4){
                 if (previo.equalsIgnoreCase("hogar")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 60000;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(telefono);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("empresa")){
                     JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 60000;
                resultado = (int) (telefono * 0.10);
                resultado1 = telefono + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                else if (previo.equalsIgnoreCase("edificio")){
                    JOptionPane.showMessageDialog(null, "Haz digitado estrato " + estrato);
                telefono = 60000;
                resultado = (int) (telefono * 0.25);
                resultado1 = telefono + resultado;
                DecimalFormat num= new DecimalFormat("###,###");
                String numero = num.format(resultado1);
                JOptionPane.showMessageDialog(null, "Se debera pagar " + numero);
                }
                
            }
             else {
                 JOptionPane.showMessageDialog(null, " no digito correctamente el estrato  ");
             }
            
        }
       
            
        
            }
        }
        }
}
