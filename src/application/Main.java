package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\Isabel\\Desktop\\Estudos\\Curso de Java Completo\\Anotações\\Arquivo escrito usando FileWriter e BufferedWriter.txt";
		
		
		
		for (int i=1; i<=1; i++) {
			System.out.print("Digite o nome: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("Digite o preço: ");
			Double price = sc.nextDouble();
			System.out.print("Digite a quantidade: ");
			Integer quantity = sc.nextInt();
			Product product = new Product(name, price, quantity);
			list.add(product);
		}
		
		for (Product product : list) {
			System.out.println(product.toString2());
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (Product product : list) {
				bw.write(product.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

		path = "C:\\Users\\Isabel\\Desktop\\Estudos\\Curso de Java Completo\\Anotações\\out.txt";
		boolean succes = new File(path + "\\out").mkdir();
		System.out.println("Directory created successfully");
		
		try (BufferedWriter bwW = new BufferedWriter(new FileWriter(path))){
			for (Product product : list) {
				bwW.write(product.toString2());
				bwW.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		sc.close();
	}

}