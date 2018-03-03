/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.math.BigDecimal;


import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BigDecimal valor=new BigDecimal("3000000000");
        BigDecimal valor2=new BigDecimal("200000");
        Partido obj1=new Partido("polo",valor);
        
        obj1.valorCampana(valor2);
        

        Scanner  leer = new Scanner(System.in);
        int opcionMenuPrincipal;
        
        do{
            System.out.println("1. MOSTRAR DATOS DE CANDIDATO");
            System.out.println("2. VOTAR");
            System.out.println("3. MOSTRAR NUMERO DE VOTOS");
            System.out.println("4. MOSTRAR COSTO DE CAMPAÑA POR PARTIDOS");
            System.out.println("0. SALIR");
            opcionMenuPrincipal = leer.nextInt();
            switch(opcionMenuPrincipal){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("-------------------------");
                    System.out.println("EL PROGRAMA HA FINALIZADO");
                    System.out.println("-------------------------");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }while(opcionMenuPrincipal!=0);

    }
    
    
    
}
