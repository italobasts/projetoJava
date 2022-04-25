package main;

import java.util.Scanner;

import controller.BaseController;
import model.User;

public class Main {

	public static void main(String[] args) {
		BaseController base = new BaseController();
		base.initBase();
		
		Scanner scan = new Scanner(System.in);
		int chosen;
		
		do {
			System.out.println("1 - Cadastrar um usuario");
			System.out.println("2 - Listar usuarios");
			System.out.println("0 - Terminar aplicação");
			chosen = scan.nextInt();
			
			if(chosen == 1) {
				System.out.println("Nome do usuario");
				String name = scan.next();
				System.out.println("Email do usuario");
				String email = scan.next();
				base.registerUser(new User(name, email, null));
				System.out.println("Usuario cadastrado com sucesso!");
			}else if(chosen == 2) {
				base.showUsers();
			}else {
				scan.close();
				break;
			}
			
		}while(true);		
	}


}
