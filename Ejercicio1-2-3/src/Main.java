import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nom="",nom1="",nom2="",nom3="",nom4="",nom5="";
		int opc=0;
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		System.out.println("Introduzca número de estudiantes: ");
		opc=sc.nextInt();
		for (int i = 0; i < opc; i++) {
			System.out.println("Introduzca su nombre: ");
			nom=sc.nextLine();
			System.out.println("Introduzca su apellido: ");
			nom1=sc.nextLine();
			System.out.println("Introduzca su fecha de nacimiento: ");
			nom2=sc.nextLine();
			System.out.println("Introduzca su DNI: ");
			nom3=sc.nextLine();
			System.out.println("Introduzca su estudios previos: ");
			nom4=sc.nextLine();
			System.out.println("Introduzca su teléfono: ");
			nom5=sc.nextLine();
		}
	}
}
