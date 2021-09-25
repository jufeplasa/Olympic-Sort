package model;

public class Country implements Comparable<Country>{
	private String name;
	private int maleGold;
	private int maleSilver;
	private int maleBronze;
	private int femaleGold;
	private int femaleSilver;
	private int femaleBronze;
	private int totalGold;
	private int totalSilver;
	private int totalBronze;

	public Country(String name, int maleGold, int maleSilver, int maleBronze, int femaleGold, int femaleSilver, int femaleBronze) {
		this.name = name;
		this.maleGold = maleGold;
		this.maleSilver = maleSilver;
		this.maleBronze = maleBronze;
		this.femaleGold = femaleGold;
		this.femaleSilver = femaleSilver;
		this.femaleBronze = femaleBronze;
		totalGold=this.maleGold + this.femaleGold ;
		totalSilver=this.maleSilver + this.femaleSilver ;
		totalBronze=this.maleBronze + this.femaleBronze;
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

	public String maleMedals() {
		return name+" "+maleGold+" "+maleSilver+" "+maleBronze;
	}

	public String femaleMedals() {
		return name+" "+femaleGold+" "+femaleSilver+" "+femaleBronze;
	}

	public int getTotalGold() {
		return totalGold;
	}

	public int getTotalSilver() {
		return totalSilver;
	}

	public int getTotalBronze() {
		return totalBronze;
	}

	public String totalMedals() {
		return name+" "+(totalGold)+" "+(totalSilver)+" "+(totalBronze);
	}
	
	public int compareByTotalMedals(Country o) {
		if(Integer.compare(o.getTotalGold(), totalGold)!=0) {
			return Integer.compare(o.getTotalGold(), totalGold);
		}
		else {
			if(Integer.compare(o.getTotalSilver(), totalSilver)!=0) {
				return Integer.compare(o.getTotalSilver(), totalSilver);
			}
			else {
				if(Integer.compare(o.getTotalBronze(), totalBronze)!=0) {
					return Integer.compare(o.getTotalBronze(), totalBronze);
				}
				else {
					return o.getName().compareTo(name);
				}
			}
		}
	}

	@Override
	public int compareTo(Country o) {
		if(Integer.compare(femaleGold, o.getFemaleGold())!=0) {
			return Integer.compare(femaleGold, o.getFemaleGold());
		}
		else {
			if(Integer.compare(femaleSilver, o.getFemaleSilver())!=0) {
				return Integer.compare(femaleSilver, o.getFemaleSilver());
			}
			else {
				if(Integer.compare(femaleBronze , o.getFemaleBronze())!=0) {
					return Integer.compare(femaleBronze , o.getFemaleBronze());
				}
				else {
					return name.compareTo(o.getName());
				}
			}
		}
	}
}

