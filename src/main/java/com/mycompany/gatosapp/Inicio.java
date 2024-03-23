/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gatosapp;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author JOAHAN CARLO
 */
public class Inicio {

    public static void main(String[] args) throws IOException {
        int opcion_menu = -1;
        String [] botones = {"1.ver gatos", "2.Salir"};
        do {            
            
            //Menu principal
            String opcion = (String)JOptionPane.showInputDialog(null, "Gatito java","Menu principal",JOptionPane.INFORMATION_MESSAGE,
                            null, botones, botones[0]);
            
            //Validamos que opcion selecciona el usuario
            for(int i=0; i<botones.length;i++){
                if(opcion.equals(botones[i])){
                    opcion_menu = i;
                }
            }
            
            switch(opcion_menu){
                case 0:
                    GatosService.verGatos();
                    break;
                default:
                    break;
            }
            
        } while (opcion_menu!=1);
    }
}
