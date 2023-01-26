package ma.ocp;

public abstract class Employe {
	private String nom;
	private String prenom;
	private int age;
	private String dateEntreeService;
	
	public Employe(String nom, String prenom, int age, String dateEntreeService) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntreeService = dateEntreeService;
	}
	
	public abstract double calculeSalaire();
	
	public String getNom() {
		return nom + " " + prenom;
	}
}
