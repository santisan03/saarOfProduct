package saar_mercado;

public class User {
	private static int idStaticUser = 0;
	private int idUser;
	private String usuario;
	private String contrase�a;
	private String nombre;
	private String apellido;

	public User (String usuario, String contrase�a, String nombre, String apellido) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

}