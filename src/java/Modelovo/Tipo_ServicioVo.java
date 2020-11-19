/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelovo;

/**
 *
 * @author bsgal
 */
public class Tipo_ServicioVo {

    
    private String tipo_servicio_id;
    private String nombre;
  
    public Tipo_ServicioVo() {
    }
    
    public Tipo_ServicioVo(String tipo_servicio_id, String nombre){
        this.tipo_servicio_id = tipo_servicio_id;
        this.nombre = nombre;
    }
    
    public String getTipo_servicio_id() {
        return tipo_servicio_id;
    }

    public void setTipo_servicio_id(String tipo_servicio_id) {
        this.tipo_servicio_id = tipo_servicio_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
 
