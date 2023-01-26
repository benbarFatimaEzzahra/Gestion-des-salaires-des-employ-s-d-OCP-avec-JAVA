package ma.ocp;

public class Salaire {

	public static void main(String[] args) {
		Personnel p = new Personnel();

		p.ajouterEmploye(new Vendeur("Mourad", "Business", 45, "1995", 30000));
		p.ajouterEmploye(new Representant("Mohamed", "Vendtout", 25, "2001", 20000));
		p.ajouterEmploye(new Producteur("Yves", "Bosseur", 28, "1998", 1000));
		p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
		p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
		p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));

		p.afficherSalaires();
		System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " Dhs.");
		

	}

}
