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
public class EmpleadoVo {

    private String empleado_id;
    private String usuario_id;
    
    public EmpleadoVo(){
        
    } 
    
    public EmpleadoVo( String empleado_id, String usuario_id){
        this.empleado_id = empleado_id;
        this.usuario_id = usuario_id;
    }
    
    public String getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(String empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }
}


