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
    private String Cod_ciudad;
    private String NombreCiudad;
    private String Cod_departamento;

    public CitaVo() {
    }

    public CitaVo(String Cod_ciudad, String NombreCiudad, String Cod_departamento) {
        this.Cod_ciudad = Cod_ciudad;
        this.NombreCiudad = NombreCiudad;
        this.Cod_departamento = Cod_departamento;
    }

    public String getCod_ciudad() {
        return Cod_ciudad;
    }

    public void setCod_ciudad(String Cod_ciudad) {
        this.Cod_ciudad = Cod_ciudad;
    }

    public String getNombreCiudad() {
        return NombreCiudad;
    }

    public void setNombreCiudad(String NombreCiudad) {
        this.NombreCiudad = NombreCiudad;
    }

    public String getCod_departamento() {
        return Cod_departamento;
    }

    public void setCod_departamento(String Cod_departamento) {
        this.Cod_departamento = Cod_departamento;
    }
    
    
}
