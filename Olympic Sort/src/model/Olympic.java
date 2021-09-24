package model;

import java.util.ArrayList;
import java.util.List;

public class Olympic {
	
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
	
	public void addCounty(Country newCountry) {
		countries.add(newCountry);
	}
	
	public String showCountries() {
		String message = "";
		for(int i=0;i<countries.size();i++) {
			message+=countries.get(i).toString()+"\n";
		}
		return message;
	}
	
}
