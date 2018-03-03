/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.math.*;

/**
 * version 1.0
 * @author YEISON and cass465
 * 03/03/2018
 * datos del partido politico 
 */
public class Partido {
    private String nombrePartido;
    private int votosPartido;
    private BigDecimal valorCampana;
    /**
     * contructor que inicia la clase partido
     * @param nombrePartido 
     */
    Partido(String nombrePartido, BigDecimal valorCampana){
        this.nombrePartido=nombrePartido;
        this.valorCampana=valorCampana;
    }
    /**
     * asignar nombre del partido
     * @param nombrePartido 
     */
    public void setNombrePartido(String nombrePartido){
        this.nombrePartido=nombrePartido;
        
    }
    /**
     * obtener nombre del partido
     * @return 
     */
    public String getNombrePartido(){
        return this.nombrePartido;
    }
    /**
     * asignar el valor de votos del partido
     * @param votosPartido 
     */
    public void setVotosPartido(int votosPartido){
        this.votosPartido=votosPartido;
    } 
    /**
     * sirve para imprimir el valor de la variable
     * @return 
     */
    public int getVotosPartido(){
        return this.votosPartido;
   }
    /**
     * este metodo suma los votos totales del partido
     * @return 
     */
   public int votosPartido(){
       this.votosPartido++;
       return this.votosPartido;
   }
   /**
     * asignar el valor de la campaña
     * @param valorCampana
     */
    public void setValorCampana(BigDecimal valorCampana){
        this.valorCampana=valorCampana;
    }
    /**
     * sirve para imprimir el valor de la variable
     * @return 
     */
    public BigDecimal getValorCampana(){
        return this.valorCampana;
    }
    /**
     * calcular el valor de la campaña del partido
     * @param publicidad
     * @return 
     */
    public BigDecimal valorCampana(BigDecimal publicidad){
      this.valorCampana=this.valorCampana.add(publicidad); 
      return this.valorCampana;
   }
    
    
    
    
            
    
    
}
