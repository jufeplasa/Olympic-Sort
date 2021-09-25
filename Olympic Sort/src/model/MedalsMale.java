package model;

import java.util.Comparator;

public class MedalsMale implements Comparator<Country>{


	@Override
	public int compare(Country o1, Country o2) {
		if(Integer.compare(o2.getMaleGold(),o1.getMaleGold())!=0) {
			return Integer.compare(o2.getMaleGold(),o1.getMaleGold());
		}
		else {
			if(Integer.compare(o2.getMaleSilver(),o1.getMaleSilver())!=0) {
				return Integer.compare(o2.getMaleSilver(),o1.getMaleSilver());
			}
			else {
				if(Integer.compare(o2.getMaleBronze(),o1.getMaleBronze())!=0) {
					return Integer.compare(o2.getMaleBronze(),o1.getMaleBronze());
				}
				else {
					return o2.getName().compareTo(o1.getName());
				}
			}
		}
	}

}
