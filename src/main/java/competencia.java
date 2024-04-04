
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 34331157
 */
public class competencia {

    /**
     * @param args the command line arguments
     *
     */
    
    public static void main(String[] args) {
        Boolean x= true;
        while(x){
    }
        
   String menu=JOptionPane.showInputDialog("*****competencia*******\n"
                 + "1. Registrar atleta. \n"
                 + "2. Datos del campeon. \n"
                 + "3. atletas´por pais. \n"
                 + "4. Tiempo promedio de todos los atletas.\n"
                 + "5.salir");
                int opcion;
                int Opcion=Integer.parseInt(menu);
                switch(Opcion){
                    case 1:
               String nombreatleta=JOptionPane.showInputDialog("Ingresar Nombre:");
               break;
                    case 2 :
                        String nombrecampeon=JOptionPane.showInputDialog("Ingresar nombre campeon:");
                          String nacionalidad=JOptionPane.showInputDialog(" Ingresar nacionalidad:");
                         String tiempo=JOptionPane.showInputDialog("Ingresar tiempo:");
                         break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        x= false;
                          break;
                    default:
                        System.out.println("opcion no valida. intentalo de nuevo");
                        break;
                
    }
    }//finalizar el while
}
                        
