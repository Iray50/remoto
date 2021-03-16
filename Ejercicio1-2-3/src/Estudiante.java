
public class Estudiante {
	
	private String nombre;
	private String apellidos;
	private String fecha_nacimiento;
	private String DNI;
	private String estudios;
	private String telefono;
	
	public Estudiante() {}

	public Estudiante(String nombre, String apellidos, String fecha_nacimiento, String dNI, String estudios, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.DNI = dNI;
		this.estudios = estudios;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		this.DNI = dNI;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", Apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", DNI=" + DNI + ", estudios=" + estudios + ", telefono=" + telefono + "]";
	}
}
