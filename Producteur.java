package ma.ocp;

import java.util.Date;

public class Producteur extends Employe {
	private int nombreUnite;
	
	public Producteur(String nom, String prenom, int age, String dateEntreeService, int nombreUnite) {
		super(nom, prenom, age, dateEntreeService);
		this.nombreUnite= nombreUnite;
	}

	@Override
	public double calculeSalaire() {
		return 5 * nombreUnite;
	}
	
	@Override
	public String getNom() {
		return "Le technicien " + super.getNom();
	}
	
}
