package saar_mercado;

public class User {
	private static int idStaticUser = 0;
	private int idUser;
	private String usuario;
	private String contraseña;
	private String nombre;
	private String apellido;

	public User (String usuario, String contraseña, String nombre, String apellido) {
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUser = generarIdUser();
	}
	
	public static int generarIdUser() {
		idStaticUser ++;
		return idStaticUser;
	}
	
	public int getId() {
		return idUser;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}