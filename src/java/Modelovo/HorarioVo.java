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
public class HorarioVo {
    private String hora_id;
    private String hora;
    private String estado;

    public HorarioVo() {
    }

    public HorarioVo(String hora_id, String hora, String estado) {
        this.hora_id = hora_id;
        this.hora = hora;
        this.estado = estado;
    }

    public String gethora_id() {
        return hora_id;
    }

    public void sethora_id(String hora_id) {
        this.hora_id = hora_id;
    }

    public String gethora() {
        return hora;
    }

    public void sethora(String hora) {
        this.hora = hora;
    }

    public String getestado() {
        return estado;
    }

    public void setestado(String estado) {
        this.estado = estado;
    }
    
    
}
