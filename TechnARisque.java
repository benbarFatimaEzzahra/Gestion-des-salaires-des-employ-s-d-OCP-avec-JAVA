package ma.ocp;

import java.util.Date;

public class TechnARisque extends Producteur{

	public TechnARisque(String nom, String prenom, int age, String dateEntreeService, int nombreUnite) {
		super(nom, prenom, age, dateEntreeService, nombreUnite);
	}
	
	@Override
	public double calculeSalaire() {
		return super.calculeSalaire() + 2000;
	}
}
