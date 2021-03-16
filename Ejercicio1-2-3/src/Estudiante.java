
public class Estudiante {
	
	private String nombre;
	private String Apellidos;
	private String fecha_nacimiento;
	private String DNI;
	private String estudios;
	private String telefono;
	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellidos, String fecha_nacimiento, String dNI, String estudios,
			String telefono) {
		super();
		this.nombre = nombre;
		Apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		DNI = dNI;
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
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
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
		DNI = dNI;
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
		return "Estudiante [nombre=" + nombre + ", Apellidos=" + Apellidos + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", DNI=" + DNI + ", estudios=" + estudios + ", telefono=" + telefono + "]";
	}
}
