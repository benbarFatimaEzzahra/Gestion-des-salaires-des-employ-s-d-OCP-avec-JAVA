package ma.ocp;

import java.util.Date;

public class Manutentionnaire extends Employe {
	private int nombreHeure;
	
	public Manutentionnaire(String nom, String prenom, int age, String dateEntreeService, int nombreHeure) {
		super(nom, prenom, age, dateEntreeService);
		this.nombreHeure= nombreHeure;
	}

	@Override
	public double calculeSalaire() {
		return 650 * nombreHeure;
	}
	
	@Override
	public String getNom() {
		return "Le Manut. " + super.getNom();
	}
}
