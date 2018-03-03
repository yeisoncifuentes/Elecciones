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
        
        Candidato obj1 = new Candidato("Polo", valorPolo, "CARLOS EMILIO", "PEREZ SANCHEZ", 12345678, 40, tel1, "CALLE 6D#28", "BOGOTA",1);
        Candidato obj2 = new Candidato("Polo", valorPolo, "JULIAN DAVID", "ORDOÑEZ RODRIGUEZ", 17125367, 45, tel2, "CALLE 4B#26", "BUCARAMANGA",2);
        Candidato obj3 = new Candidato("Polo", valorPolo, "JUAN MANUEL", "RINCON GARCIA", 18457125, 50, tel3, "CALLE 15A#76", "MEDELLIN",3);
        Candidato obj4 = new Candidato("Liberal", valorPolo, "LEONEL ANDRES", "MENDEZ VELAZQUES", 37456812, 60, tel4, "CALLE 4G#86", "BARRANQUILLA",4);
        Candidato obj5 = new Candidato("Liberal", valorPolo, "MARIA CECILIA", "PAEZ CARRILLO", 4236789, 34, tel5, "CALLE 3C#56", "CALI",5);
        Candidato obj6 = new Candidato("Verde", valorPolo, "DANIEL STEVEN", "FIGUEROA LARA", 6908560, 47, tel6, "CALLE 5E#87", "TUNJA",6);
        Candidato obj7 = new Candidato("Verde", valorPolo, "LAURA CATERINE", "HERNANDEZ RIVERA", 34125134, 56, tel7, "CALLE 8A#34", "CARTAGENA",7);
        Candidato obj8 = new Candidato("Mira", valorPolo, "GUSTAVO ENRIQUE", "SUAREZ ALVARADO", 16457893, 38, tel8, "CALLE 6B#24", "BOGOTA",8);
        Candidato obj9 = new Candidato("Mira", valorPolo, "KAREN DAYANA", "ROJAS BARRAGAN", 32678123, 49, tel9, "CALLE 3C#14", "MEDELLIN",9);
        //obj1.valorCampana(valor2);
        

        Scanner  leer = new Scanner(System.in);
        int opcionMenuPrincipal,escojerCandidato,votar;
        boolean voto=false;
        do{
            System.out.println("1. MOSTRAR DATOS DE CANDIDATO");
            System.out.println("2. VOTAR");
            System.out.println("3. MOSTRAR NUMERO DE VOTOS");
            System.out.println("4. MOSTRAR COSTO DE CAMPAÑA POR PARTIDOS");
            System.out.println("0. SALIR");
            opcionMenuPrincipal = leer.nextInt();
            System.out.println("_________________________");
            switch(opcionMenuPrincipal){
                case 1:
                    do{
                        System.out.println("ESCOJA UN CANDIDATO PARA MOSTRAR SUS DATOS");
                        System.out.println("1. CANDIDATO 1");
                        System.out.println("2. CANDIDATO 2");
                        System.out.println("3. CANDIDATO 3");
                        System.out.println("4. CANDIDATO 4");
                        System.out.println("5. CANDIDATO 5");
                        System.out.println("6. CANDIDATO 6");
                        System.out.println("7. CANDIDATO 7");
                        System.out.println("8. CANDIDATO 8");
                        System.out.println("9. CANDIDATO 9");
                        System.out.println("0. SALIR");
                        escojerCandidato = leer.nextInt();
                        switch(escojerCandidato){
                            case 1:
                                System.out.println(obj1.datosCandidato());
                                break;
                            case 2:
                                System.out.println(obj2.datosCandidato());
                                
                                break;
                            case 3:
                                System.out.println(obj3.datosCandidato());
                                break;
                            case 4:
                                System.out.println(obj4.datosCandidato());
                                break;
                            case 5:
                                System.out.println(obj5.datosCandidato());
                                break;
                            case 6:
                                System.out.println(obj6.datosCandidato());
                                break;
                            case 7:
                                System.out.println(obj7.datosCandidato());
                                break;
                            case 8:
                                System.out.println(obj8.datosCandidato());
                                break;
                            case 9:
                                System.out.println(obj9.datosCandidato());
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("OPCION INVALIDA");
                        }
                    }while(escojerCandidato!=0);
                    break;
                case 2:
                    do{
                        System.out.println("ESCOJA UN CANDIDATO PARA VOTAR (PRIMERO SE MOSTRARAN SUS DATOS Y LUEGO SE DARA LA OPCION DE VOTAR)");
                        System.out.println("1. CANDIDATO 1");
                        System.out.println("2. CANDIDATO 2");
                        System.out.println("3. CANDIDATO 3");
                        System.out.println("4. CANDIDATO 4");
                        System.out.println("5. CANDIDATO 5");
                        System.out.println("6. CANDIDATO 6");
                        System.out.println("7. CANDIDATO 7");
                        System.out.println("8. CANDIDATO 8");
                        System.out.println("9. CANDIDATO 9");
                        System.out.println("0. SALIR");
                        escojerCandidato = leer.nextInt();
                        switch(escojerCandidato){
                            case 1:
                                System.out.println(obj1.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj1.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 2:
                                System.out.println(obj2.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj2.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 3:
                                System.out.println(obj3.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj3.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 4:
                                System.out.println(obj4.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj4.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 5:
                                System.out.println(obj5.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj5.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 6:
                                System.out.println(obj6.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj6.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 7:
                                System.out.println(obj7.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj7.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 8:
                                System.out.println(obj8.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj8.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 9:
                                System.out.println(obj9.datosCandidato());
                                System.out.println("\nDESEA VOTAR POR ESTE CANDIDATO?");
                                System.out.println("1.SI       2.NO");
                                votar=leer.nextInt();
                                switch(votar){
                                    case 1:
                                        obj9.getVotosCandidato();
                                        System.out.println("GRACIAS POR VOTAR\n\n");
                                        voto=true;
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                    default:
                                    System.out.println("OPCION INVALIDA");
                                }
                                break;
                            case 0:
                                System.out.println("");
                                break;
                            default:
                                System.out.println("OPCION INVALIDA");
                        }
                        if(voto==true){
                            break;
                        }
                    }while(escojerCandidato!=0);
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
