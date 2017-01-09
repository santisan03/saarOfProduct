package saar_mercado;

public class User {
	private static int idStaticUser = 0;
	private int idUser;
	private String usuario;
	private String nombre;
	private String apellido;

	public User (String usuario, String nombre, String apellido) {
		this.setUsuario(usuario);
		this.setNombre(nombre);
		this.setApellido(apellido);
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

}