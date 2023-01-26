package ma.ocp;


public class Vendeur extends EmployeChiffreAffaire{

	public Vendeur(String nom, String prenom, int age, String dateEntreeService, double chiffreAffaire) {
		super(nom, prenom, age, dateEntreeService, chiffreAffaire);
	}
	
	@Override
	public double calculeSalaire() {
		return super.calculeSalaire() + 4000;
	}

	@Override
	public String getNom() {
		return "Le vendeur " + super.getNom();
	}
}
