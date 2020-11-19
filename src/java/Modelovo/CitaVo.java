/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelovo;

/**
 *
 * @author usuario
 */
public class CitaVo {
    private String cita_id;
    private String fecha_cita;
    private String mascota_id;
    private String empleado_id;
    private String tipo_servicio_id;
    private String usuario_id;
    private String hora_id;

    public CitaVo() {
    }

    public CitaVo(String cita_id, String fecha_cita, String mascota_id, String empleado_id, 
            String tipo_servicio_id, String usuario_id, String hora_id) {
        this.cita_id = cita_id;
        this.fecha_cita = fecha_cita;
        this.mascota_id = mascota_id;
        this.empleado_id = empleado_id;
        this.tipo_servicio_id = tipo_servicio_id;
        this.usuario_id = usuario_id;
        this.hora_id = hora_id;
    }

    public String getcita_id() {
        return cita_id;
    }

    public void setcita_id(String cita_id) {
        this.cita_id = cita_id;
    }

    public String getfecha_cita() {
        return fecha_cita;
    }

    public void setfecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getmascota_id() {
        return mascota_id;
    }

    public void setmascota_id(String mascota_id) {
        this.mascota_id = mascota_id;
    }
    
    public String getempleado_id() {
        return mascota_id;
    }
    
    public void setempleado_id(String empleado_id){
        this.empleado_id = empleado_id;
    }
    
    public String gettipo_servicio_id() {
        return tipo_servicio_id;
    }
    
    public void settipo_servicio_id(String tipo_servicio_id){
        this.tipo_servicio_id = tipo_servicio_id;
    }
    
    public String getusuario_id() {
        return usuario_id;
    }
    
    public void setusuario_id(String usuario_id){
        this.usuario_id = usuario_id;
    }
    public String gethora_id() {
        return mascota_id;
    }
    
    public void sethora_id(String hora_id){
        this.hora_id = hora_id;
    }
}
