package ma.ocp;

import java.util.ArrayList;

public class Personnel {
	private ArrayList<Employe> employes;
	
	public Personnel (){
		employes = new ArrayList<Employe>();
	}
	
	public void ajouterEmploye(Employe e) {
		employes.add(e);
	}
	
	public double salaireMoyen() {
		double salaires = 0;
		
		for(Employe e: employes) {
			salaires += e.calculeSalaire();
		}
		
		return salaires/employes.size();
	}
	
	public void afficherSalaires() {
		for(Employe e : employes) {
			System.out.println(e.getNom() + " gagne " + e.calculeSalaire() + " Dh");
		}
	}
}


