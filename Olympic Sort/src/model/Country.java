package model;

public class Country {
	private String name;
	private int maleGold;
	private int maleSilver;
	private int maleBronze;
	private int femaleGold;
	private int femaleSilver;
	private int femaleBronze;
	
	public Country(String name, int maleGold, int maleSilver, int maleBronze, int femaleGold, int femaleSilver, int femaleBronze) {
		this.name = name;
		this.maleGold = maleGold;
		this.maleSilver = maleSilver;
		this.maleBronze = maleBronze;
		this.femaleGold = femaleGold;
		this.femaleSilver = femaleSilver;
		this.femaleBronze = femaleBronze;
	}

	public String getName() {
		return name;
	}

	public int getMaleGold() {
		return maleGold;
	}

	public int getMaleSilver() {
		return maleSilver;
	}

	public int getMaleBronze() {
		return maleBronze;
	}

	public int getFemaleGold() {
		return femaleGold;
	}

	public int getFemaleSilver() {
		return femaleSilver;
	}

	public int getFemaleBronze() {
		return femaleBronze;
	}
	
	public String toString() {
		return name+"\n Male medals : "+maleGold+"|"+maleSilver+"|"+maleBronze+"\n Female medals : "+femaleGold+"|"+femaleSilver+"|"+femaleBronze+"\n";
	}
	
}
