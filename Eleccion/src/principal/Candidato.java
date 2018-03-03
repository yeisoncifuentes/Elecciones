/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.math.BigDecimal;
/**
 * version 1.0
 * @author YEISON and cass4
 * 03/03/2018
 * esta clase contiene los datos del candidato y los datos de campaña
 */
public class Candidato extends Partido{
    public int numCandidato;
    public String nombre;
    public String apellido;
    public long documento;
    public int edad;
    public BigDecimal telefono;
    public String direccion;
    public String ciudadNacimiento;
    
    public int votosCandidato;
    
    
 /**
  * metodo constructor de la clase Candidato
  * @param nombre
  * @param apellido
  * @param documento
  * @param edad
  * @param telefono
  * @param direccion
  * @param ciudadNacimiento 
  */
    
    Candidato(String nombrePartido,BigDecimal valorCampana,String nombre,String apellido,long documento,int edad, BigDecimal telefono,String direccion, String ciudadNacimiento,int numCandidato){
        super(nombrePartido,valorCampana );
        this.numCandidato=numCandidato;
        this.nombre=nombre;
        this.apellido=apellido;
        this.documento=documento;
        this.edad=edad;
        this.telefono=telefono;
        this.direccion=direccion;
        this.ciudadNacimiento=ciudadNacimiento;   
    }
    
    public String datosCandidato(){
        
        String datosCandidato=this.numCandidato+"."; 
        datosCandidato+="\nNombre: "+this.nombre;
        datosCandidato+="\n Apellidos: "+this.apellido;
        datosCandidato+="\n Edad: "+this.edad;
        datosCandidato+="\n Telefono"+this.telefono;
        datosCandidato+="\n Direccion"+this.direccion;
        datosCandidato+="\n Ciudad de Nacimiento: "+this.ciudadNacimiento;
        datosCandidato+="\n_________________________\n";
        return datosCandidato;
    }
    
     /**
     * asignar el valor del nombre
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * sirve para imprimir el valor de la variable nombre
     * @return 
     */
    public String getNombre(){
        return this.nombre;
   }
    
     /**
     * asignar el valor del apellido
     * @param apellido
     */
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    /**
     * asignar el valor del documento
     * @param documento
     */
    public void setDocumento(long documento){
        this.documento=documento;
    }
    /**
     * sirve para imprimir el valor de la variable nombre
     * @return 
     */
    public long getDocumento(){
        return this.documento;
   
    } 
    /**
     * asignar el valor de la edad
     * @param edad
     */
    public void setEdad(int edad){
        this.edad=edad;
    }
    /**
     * sirve para imprimir el valor de la variable nombre
     * @return 
     */
    public int getEdad(){
        return this.edad;
   }
    
    /**
     * asignar el valor de la edad
     * @param telefono
     */
    public void setTelefono(BigDecimal telefono){
        this.telefono=telefono;
    }
    /**
     * sirve para imprimir el valor de la variable nombre
     * @return 
     */
    public BigDecimal getTelefono(){
        return this.telefono;
   }
    
    /**
     * asignar el valor de la direccion
     * @param direccion
     */
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    /**
     * sirve para imprimir el valor de la variable nombre
     * @return 
     */
    public String getDireccion(){
        return this.direccion;
   }
    
    /**
     * asignar el valor de la edad
     * @param ciudadNacimiento
     */
    public void setCiudadNacimiento(String ciudadNacimiento){
        this.ciudadNacimiento=ciudadNacimiento;
    }
    /**
     * sirve para imprimir el valor de la variable nombre
     * @return 
     */
    public String getCiudadNacimiento(){
        return this.ciudadNacimiento;
   }
    
   
    /**
     * asignar el valor de la edad
     * @param votosCandidato
     */
    public void setVotosCandidato(int votosCandidato){
        this.votosCandidato=votosCandidato;
    }
    /**
     * sirve para imprimir el valor de la variable nombre
     * @return 
     */
    public int getVotosCandidato(){
        return this.votosCandidato;
   }
    
    /**
     * este metodo suma los votos totales del candidato
     * @return 
     */
    public int votosCandidato(){
        this.votosCandidato++;
        return this.votosCandidato;
    }
    
    
}
