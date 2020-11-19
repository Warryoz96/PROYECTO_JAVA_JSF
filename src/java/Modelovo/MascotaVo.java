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
public class MascotaVo {
    private String mascota_id;
    private String nombre;
    private String edad;
    private String raza;
    private String sexo;

    

    public MascotaVo() {
    }

    public MascotaVo(String mascota_id, String nombre, String edad, String raza, String sexo) {
        this.mascota_id = mascota_id;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getmascota_id() {
        return mascota_id;
    }

    public void setmascota_id(String mascota_id) {
        this.mascota_id = mascota_id;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getedad() {
        return edad;
    }

    public void setedad(String edad) {
        this.edad = edad;
    }
    
    public String getraza() {
        return raza;
    }

    public void setraza(String raza) {
        this.raza = raza;
    }

    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }
    
}
