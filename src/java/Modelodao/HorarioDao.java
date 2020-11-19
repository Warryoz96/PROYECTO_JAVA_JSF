/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelodao;

import Conexion.Conexion;
import Modelovo.Ciudadesvo;
import Modelovo.Departamentosvo;
import Modelovo.Duenovo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;



/**
 *
 * @author usuario
 */
@ManagedBean
@SessionScoped

public class HorarioDao {
    private String mensaje;
    private String Documento="";
    private String Nombres="";
    private String Apellidos="";
    private String Telefono="";
    private String Departamento="";
    private String Ciudad="";
    private  ArrayList<Departamentosvo> Departamentos;
    private  ArrayList<Ciudadesvo> Ciudades;
    private  ArrayList<Ciudadesvo> Ciudadesfiltradas=new ArrayList<Ciudadesvo>();;
    

    public ArrayList<Ciudadesvo> getCiudadesfiltradas() {
        return Ciudadesfiltradas;
    }

    public void setCiudadesfiltradas(ArrayList<Ciudadesvo> Ciudadesfiltradas) {
        this.Ciudadesfiltradas = Ciudadesfiltradas;
    }
    private  ArrayList<Duenovo> listadueno;
    
    
    public HorarioDao()
    {
    //    setDueno(new Duenovo());
      buscarDueno(); 
      buscarDepartamento();
      buscarCiudad();
    }
    
    public ArrayList<Departamentosvo> getDepartamentos() {
        return Departamentos;
    }

    public void setDepartamentos(ArrayList<Departamentosvo> Departamentos) {
        this.Departamentos = Departamentos;
    }

    public ArrayList<Ciudadesvo> getCiudades() {
        return Ciudades;
    }

    public void setCiudades(ArrayList<Ciudadesvo> Ciudades) {
        this.Ciudades = Ciudades;
    }
 
    
    

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    private String foto;
    private boolean editar;
    private Duenovo dueno;

    public Duenovo getDueno() {
        return dueno;
    }

    public void setDueno(Duenovo dueno) {
        this.dueno = dueno;
    }

    
    
    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<Duenovo> getListadueno() {
        return listadueno;
    }

    public void setListadueno(ArrayList<Duenovo> listadueno) {
        this.listadueno = listadueno;
    }
   

    
    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
           
    public void registrardueno()
    {
            Conexion conex= new Conexion();
            Duenovo dueno=new Duenovo(getDocumento(),getNombres(),getApellidos(),getTelefono(),getDepartamento(),getCiudad(),getFoto(),false);
            try {
                    Statement estatuto = conex.getConnection().createStatement();
                    estatuto.executeUpdate("INSERT INTO dueno VALUES ('"+dueno.getDocumento()+"', '"
                                    +dueno.getNombres()+"', '"+dueno.getApellidos()+"', '"
                                    +dueno.getTelefono()+"', '"+dueno.getDepartamento()+"', '"
                                    +dueno.getCiudad()+"', '"
                                    +dueno.getFoto()+"')");
                    mensaje="Se ha registrado Exitosamente!";
                    estatuto.close();
                    conex.desconectar();
                    setDocumento("");
                    setNombres("");
                    setApellidos("");
                    setTelefono("");
                    setFoto("");
            } catch (SQLException e) {
                mensaje="No se registro";
            }  
            buscarDueno();
	}
        
        public ArrayList buscarDueno() 
	{
		Conexion conex= new Conexion();
		listadueno=new ArrayList<>();
             	try {
			
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM dueno");
			
			ResultSet res = consulta.executeQuery();
			while(res.next()){
			listadueno.add(new Duenovo(res.getString("Documento"),res.getString("Nombres"), 
                                res.getString("Apellidos"),res.getString("Telefono"),res.getString("Departamento"), res.getString("Ciudad"),res.getString("foto"),isEditar()));
			}
			res.close();
			conex.desconectar();
			} catch (SQLException e) {
			
			}
             return listadueno;							
	}
        
        
               public ArrayList buscarDepartamento() 
	{
		Conexion conex= new Conexion();
		Departamentos=new ArrayList<>();
             	try {
			
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM departamento");
			
			ResultSet res = consulta.executeQuery();
			while(res.next()){
			Departamentos.add(new Departamentosvo(res.getString("Cod_departamento"), 
                                res.getString("NombreDepartamento")));
			}
			res.close();
			conex.desconectar();
			} catch (SQLException e) {
			
			}
             return Departamentos;							
	}
               
             public ArrayList buscarCiudad() 
	{
		Conexion conex= new Conexion();
		Ciudades=new ArrayList<Ciudadesvo>();
             	try {
			
			//PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM ciudad WHERE Cod_departamento='"+Departamento+"'"); 
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM ciudad");
			ResultSet res = consulta.executeQuery();
			while(res.next()){
			Ciudades.add(new Ciudadesvo(res.getString("Cod_ciudad"), 
                                res.getString("NombreCiudad"),res.getString("Cod_departamento")));
			}
			res.close();
			conex.desconectar();
			} catch (SQLException e) {
			
			}
             return Ciudades;							
	}
             
             public void actualizarCiudades(AjaxBehaviorEvent e)
    {
        Ciudadesfiltradas=new ArrayList<Ciudadesvo>();
        for(int x=0; x<Ciudades.size();x++)
        {
       
        if(Ciudades.get(x).getCod_departamento().equals(Departamento))
        {            
            Ciudadesfiltradas.add(new Ciudadesvo(Ciudades.get(x).getCod_ciudad(),Ciudades.get(x).getNombreCiudad(),Ciudades.get(x).getCod_departamento()));
    
        }
        
        }
       // }
    }

        public void editardueno(Duenovo dueno)
        {
                 guardardueno();
                 dueno.setEditar(true);                              
        }
        
        public void guardardueno()
        {        
        for(Duenovo dueno:listadueno)
        {
        dueno.setEditar(false);
        }
        }
        
        
	public void modificardueno(Duenovo dueno) {	
      		Conexion conex= new Conexion();
		try{
			String consulta="update dueno set Documento= ?, Nombres = ? ,Apellidos = ? , Telefono=? , Departamento=?, Ciudad=?, Foto=? WHERE Documento= ?";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);			
                        estatuto.setString(1, dueno.getDocumento());
                        estatuto.setString(2, dueno.getNombres());
                        estatuto.setString(3, dueno.getApellidos());
                        estatuto.setString(4, dueno.getTelefono());
                        estatuto.setString(5, dueno.getDepartamento());  
                        estatuto.setString(6, dueno.getCiudad());
                        estatuto.setString(7, dueno.getFoto());                       
                        estatuto.setString(8, dueno.getDocumento());            
                        estatuto.executeUpdate();
                        conex.desconectar();
                        mensaje= " Se ha Modificado Correctamente "+getNombres();
        }catch(SQLException	 e){            
            mensaje="Error al Modificar";
        }
            System.out.println(mensaje);  
        
        guardardueno();
	}

	public void eliminardueno(String codigo)
	{
		Conexion conex= new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM dueno WHERE Documento='"+codigo+"'");
                        mensaje=" Se ha Eliminado Correctamente";
			estatuto.close();
			conex.desconectar();			
		} catch (SQLException e) {           
			mensaje= "No se Elimino";
		}
                buscarDueno();
	}
}
