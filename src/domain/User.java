package domain;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class User {
	
	public User (String name, String surname, String password, Date register_date) {
		
		nombre=name;
		apellido=surname;
		contrasenya=password;
		fecha_registro = register_date;
	
	}
		
	public String getName() {
		return nombre;
	}
	public String getSurname() {
		return apellido;
	}
	public String getPassword() {
		return contrasenya;
	}
	public Date getRegisterDate() {
		return fecha_registro;
	}
	
	private String nombre;
	private String apellido;
	private String contrasenya;
	private Date fecha_registro;
	
	static ArrayList<User> users_list = new ArrayList<User>();
	static String name;
	
	public static void createUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please introduce your name:");
		String name = sc.nextLine();	
		while (name == null || name.isEmpty() || name == " ") {
			System.out.println("No blank names allowed!");
			System.out.println("Please introduce your name:");
			name = sc.nextLine();}

		System.out.println("Please introduce your surname:");
		String surname = sc.nextLine();
		while (surname == null || surname.isEmpty() || surname == " ") {
			System.out.println("No blank surnames allowed!");
			System.out.println("Please introduce your surname:");
			surname = sc.nextLine();}
		
		System.out.println("Please introduce your password:");
		String password = sc.nextLine();
		while (password == null || password.isEmpty() || password == " ") {
			System.out.println("No blank password allowed!");
			System.out.println("Please introduce your password:");
			password = sc.nextLine();}
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date register_date = new Date(System.currentTimeMillis());
		users_list.add(new User(name, surname, password, register_date));
		System.out.println("User succesfully created:");
	
	}

	
	public String toString() {
        return  "\n Name ='" + getName() +
                "\n Surname ='" + getSurname() +
                "\n Registration =" + getRegisterDate() +
                '}';
    }

	public static void printUsers() {
		System.out.println(users_list);
		System.out.println("-----------------------------");
		
	}
	
}
	

