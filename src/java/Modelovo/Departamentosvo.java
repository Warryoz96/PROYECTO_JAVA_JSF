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
public class Departamentosvo {
    
    private String Cod_departamento;
    private String NombreDepartamento;

    public Departamentosvo() {
    }
    

    public Departamentosvo(String Cod_departamento, String NombreDepartamento) {
        this.Cod_departamento = Cod_departamento;
        this.NombreDepartamento = NombreDepartamento;
    }

    public String getCod_departamento() {
        return Cod_departamento;
    }

    public void setCod_departamento(String Cod_departamento) {
        this.Cod_departamento = Cod_departamento;
    }

    public String getNombreDepartamento() {
        return NombreDepartamento;
    }

    public void setNombreDepartamento(String NombreDepartamento) {
        this.NombreDepartamento = NombreDepartamento;
    }
            
    
}
