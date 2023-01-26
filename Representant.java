package ma.ocp;

public class Representant extends EmployeChiffreAffaire{

	public Representant(String nom, String prenom, int age, String dateEntreeService, int chiffreAffaire) {
		super(nom, prenom, age, dateEntreeService, chiffreAffaire);
	}
	
	@Override
	public double calculeSalaire() {
		return super.calculeSalaire() + 8000;
	}
	
	@Override
	public String getNom() {
		return "Le représentant " + super.getNom();
	}
}
