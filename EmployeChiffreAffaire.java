package ma.ocp;

public class EmployeChiffreAffaire extends Employe{
	private double chiffreAffaire;

	public EmployeChiffreAffaire(String nom, String prenom, int age, String dateEntreeService, double chiffreAffaire) {
		super(nom, prenom, age, dateEntreeService);
		this.chiffreAffaire= chiffreAffaire;
	}
	
	@Override
	public double calculeSalaire() {
		return 2 * chiffreAffaire;
	}
	
}
