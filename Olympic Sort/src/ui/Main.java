package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.Country;
import model.Olympic;

public class Main {

	private static Scanner sc=new Scanner(System.in);
	private static Olympic olympic= new Olympic();

	public static void main (String[] args) throws IOException {
		int numberCountries=0;
		System.out.println("How many countries participated?");
		numberCountries=sc.nextInt();
		sc.nextLine();
		enterCountries(numberCountries);

		olympic.sortCountriesByMaleMedals();
		System.out.println(olympic.showCountries(1));
		
		System.out.println("----------");
		olympic.sortCountriesByFemaleMedals();
		System.out.println(olympic.showCountries(2));
		
		System.out.println("----------");
		olympic.sortCountriesByTotalMedals();
		System.out.println(olympic.showCountries(3));
		
		System.out.println("----------");
		olympic.insertionSortByTotalMedals();
		System.out.println(olympic.showCountries(3));
	}

	public static void enterCountries(int numberCountries) throws IOException {
		String[] properties;
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the information separate with ';' in the next order: country, male (gold, silver , bronze) , female (gold , silver , bronze)");
		for(int i=0;i<numberCountries;i++) {
			String information=br.readLine();
			properties=information.split("\\;");
			olympic.addCounty(new Country(properties[0],Integer.parseInt(properties[1]),Integer.parseInt(properties[2]),Integer.parseInt(properties[3]), Integer.parseInt(properties[4]), Integer.parseInt(properties[5]), Integer.parseInt(properties[6])));
		}
	}
}
