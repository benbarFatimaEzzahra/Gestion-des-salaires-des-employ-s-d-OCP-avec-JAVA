package ma.ocp;

import java.util.Date;

public class ManutARisque extends Manutentionnaire{

	public ManutARisque(String nom, String prenom, int age, String dateEntreeService, int nombreHeure) {
		super(nom, prenom, age, dateEntreeService, nombreHeure);
	}
	
	@Override
	public double calculeSalaire() {
		return super.calculeSalaire() + 2000;
	}

}
