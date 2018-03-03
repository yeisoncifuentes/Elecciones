/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.math.BigDecimal;
import java.util.Scanner;

/**
 * version 1.0
 * @author YEISON and cass465
 * 03/03/2018
 * clase principal main
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigDecimal valorPolo = new BigDecimal("3000000000");
        BigDecimal valorLiberal = new BigDecimal("2000000000");
        BigDecimal valorVerde = new BigDecimal("1000000000");
        BigDecimal valorMira = new BigDecimal("500000000");
        
        BigDecimal tel1 = new BigDecimal("3201457525");
        BigDecimal tel2 = new BigDecimal("3131447579");
        BigDecimal tel3 = new BigDecimal("3201457525");
        BigDecimal tel4 = new BigDecimal("3105476521");
        BigDecimal tel5 = new BigDecimal("3124184512");
        BigDecimal tel6 = new BigDecimal("3152367456");
        BigDecimal tel7 = new BigDecimal("3216789012");
        BigDecimal tel8 = new BigDecimal("3121263477");
        BigDecimal tel9 = new BigDecimal("3143245093");
        
        BigDecimal publicidadTv = new BigDecimal("200000");
        BigDecimal publicidadRadio = new BigDecimal("150000");
        BigDecimal publicidadInternet = new BigDecimal("10000");
        
        Candidato obj1 = new Candidato("Polo", valorPolo, "CARLOS EMILIO", "PEREZ SANCHEZ", 12345678, 40, tel1, "CALLE 6D#28", "BOGOTA");
        Candidato obj2 = new Candidato("Polo", valorPolo, "JULIAN DAVID", "ORDOÑEZ RODRIGUEZ", 17125367, 45, tel2, "CALLE 4B#26", "BUCARAMANGA");
        Candidato obj3 = new Candidato("Polo", valorPolo, "JUAN MANUEL", "RINCON GARCIA", 18457125, 50, tel3, "CALLE 15A#76", "MEDELLIN");
        Candidato obj4 = new Candidato("Liberal", valorPolo, "LEONEL ANDRES", "MENDEZ VELAZQUES", 37456812, 60, tel4, "CALLE 4G#86", "BARRANQUILLA");
        Candidato obj5 = new Candidato("Liberal", valorPolo, "MARIA CECILIA", "PAEZ CARRILLO", 4236789, 34, tel5, "CALLE 3C#56", "CALI");
        Candidato obj6 = new Candidato("Verde", valorPolo, "DANIEL STEVEN", "FIGUEROA LARA", 6908560, 47, tel6, "CALLE 5E#87", "TUNJA");
        Candidato obj7 = new Candidato("Verde", valorPolo, "LAURA CATERINE", "HERNANDEZ RIVERA", 34125134, 56, tel7, "CALLE 8A#34", "CARTAGENA");
        Candidato obj8 = new Candidato("Mira", valorPolo, "GUSTAVO ENRIQUE", "SUAREZ ALVARADO", 16457893, 38, tel8, "CALLE 6B#24", "BOGOTA");
        Candidato obj9 = new Candidato("Mira", valorPolo, "KAREN DAYANA", "ROJAS BARRAGAN", 32678123, 49, tel9, "CALLE 3C#14", "MEDELLIN");
        //obj1.valorCampana(valor2);
        

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
