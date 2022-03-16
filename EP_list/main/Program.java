package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int N = scanner.nextInt();
		List<Funcionario> cadastro = new ArrayList<>();
		
		
		
		for(int i = 0; i<N; i++) {
		   System.out.println("Employee #"+ i);
		  
		   System.out.print("id: ");
		   scanner.nextLine();
		   String id = scanner.nextLine();
		   
		   while(validationNumbers(id) == false) {
			   
			   System.out.println("Incorrect type of id, try again. ");
			   System.out.print("id: ");
			   id = scanner.nextLine();   
		
		   }
		  
		   System.out.print("Name: ");
		   String name = scanner.nextLine();
		   
		   while(validationLetters(name) == false) {
			   
			   System.out.println("Names doesn't have numbers, try again. ");
               System.out.print("Name: ");
               name = scanner.nextLine();
		   }
		   
		   System.out.print("Salary: ");
		   Double salary = scanner.nextDouble();
		   
		    while(salary <  0) {
		    	
		    	System.out.println("You can't pay for work, you are paid for your work, type a positive data");
		    	System.out.print("Salary: ");
		    	salary = scanner.nextDouble();
		    	
		    }
		   
		   Funcionario fun = new Funcionario(id, name, salary);
		   cadastro.add(i, fun);
		   System.out.println();
		}
		
		System.out.print("Enter the employee id that will be a salary increase: ");
		String teste = scanner.next();
		int cont = 0;
		int index = 0;
		
		for(int i = 0; i<N;i++) {
			if(cadastro.get(i).getId().contains(teste)) {
				index = i;
				cont += 1;
			}
		}
		
		
		if(cont >= 1 ) {
			
	      System.out.println("Enter the porcentage: ");
	      int porcentage = scanner.nextInt();
	      cadastro.get(index).increaseSalary(porcentage);;
		  
		}
		else {
		  System.out.println("This id does not exist!!!");
		}
		
		for(Funcionario x: cadastro) {
			System.out.println(x);
		}
		
		
		scanner.close();
	}
	
    //it isn't working in name validation
	public static boolean validationLetters(String word) {
		if (word.matches("[a-zA-Z]+")){
		
		return true;
		}
		
		else {
	    return false;
		}
		
	}
    
	public static boolean validationNumbers(String numbers) {
		if (numbers.matches("[0-9]+")) {
			return true;
		}
		
		else {
			return false;
		}
	}


}
