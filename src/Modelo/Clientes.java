package Modelo;


public class Clientes {
    
    
    private String nombreCliente;
    private String apellidos;
    private String idCliente;
    private String direccion;
    private String telefono;
    private String ciudad;

    public Clientes(String nombreCliente, String apellidos, String idCliente, String direccion, String telefono, String ciudad) {
        this.nombreCliente = nombreCliente;
        this.apellidos = apellidos;
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String getDatosCliente()
    {
        return nombreCliente+"\t"+apellidos+"\t"+idCliente+"\t"+direccion+"\t"+telefono+"\t"+ciudad;        
    }
   

}
