import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema para converter dias em segundos: ");
        System.out.println("Informe o número de dias: ");
		int days = scanner.nextInt();
        int horas = days *24;
        int minutos = horas * 60;
        int segundos = minutos * 60; 
		System.out.println(segundos);
		//your code goes here
		
	}
}