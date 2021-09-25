package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
	

public class Olympic {

	public static final String IMPORT_DATA="data/Countries.txt";
	public static final String EXPORT_DATA="";
	
	private List<Country> countries;


	public Olympic() {
		countries=new ArrayList<Country>();
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public void addCountry(Country newCountry) {
		countries.add(newCountry);
	}

	public String showCountries(int option) {
		String message = "";
		if(option==1) {
			message="Male \n";
			for(int i=0;i<countries.size();i++) {
				message+=countries.get(i).maleMedals()+"\n";
			}
		}
		else if(option==2) {
			message="Female \n";
			for(int i=0;i<countries.size();i++) {
				message+=countries.get(i).femaleMedals()+"\n";
			}
		}
		else if(option==3) {
			message="Total \n";
			for(int i=0;i<countries.size();i++) {
				message+=countries.get(i).totalMedals()+"\n";
			}
		}
		return message;
	}
	
	public void sortCountriesByMaleMedals() {
		Comparator<Country> s1= new MedalsMale();
		Collections.sort(countries, s1);
	}

	public void sortCountriesByFemaleMedals() {
		Collections.sort(countries);
	}

	public void sortCountriesByTotalMedals() {
		int pos=0;
		while(pos<countries.size()) {
			Country min= countries.get(pos);
			for (int i=pos;i<countries.size();i++) {
				if(countries.get(i).compareByTotalMedals(min)<0) {
					Country temp = countries.get(i);
					countries.set(i, min);
					min=temp;
				}
			}
			countries.set(pos, min);
			pos++;
		}
	}
	
	public void insertionSortByTotalMedals() {
		int j;
		Country aux;
		for(int i=1;i<countries.size();i++) {
			aux=countries.get(i);
			j = i-1;
			while(j>=0 && aux.compareByTotalMedals(countries.get(j)) < 0 ) {
				countries.set(j+1,countries.get(j));
				j--;
			}
			countries.set(j+1, aux);
		}
	}
	
	public void importData() throws IOException {
		BufferedReader br= new BufferedReader(new FileReader(IMPORT_DATA));
		String line = br.readLine();
		while(line!=null) {
			String [] part = line.split(";");
			Country register = new Country(part[0],Integer.parseInt(part[1]),Integer.parseInt(part[2]),Integer.parseInt(part[3]),Integer.parseInt(part[4]),Integer.parseInt(part[5]),Integer.parseInt(part[6]));
			addCountry(register);
			line = br.readLine();
		}
		br.close();
	}
}
