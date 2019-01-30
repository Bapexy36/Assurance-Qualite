package TP1;

public class CV {
	private static String nom;
	private static String prenom;
	private static String formation;
	private static int nbAnnees;
	private static String[] competences = new String[2];
	private static String attentes;
	
	public void setNom(String nom) {
		nom = CV.nom;
	}
	
	public static String getNom() {
		return nom;
	}
	
	public void setPrenom(String prenom) {
		prenom = CV.prenom;
	}
	
	public static String getPrenom() {
		return prenom;
	}
	
	public void setFormation(String formation) {
		formation = CV.formation;
	}
	
	public static String getFormation() {
		return formation;
	}
	
	public void setNbAnnees(int nbAnnees) {
		nbAnnees = CV.nbAnnees;
	}
	
	public static int getNbAnnees() {
		return nbAnnees;
	}
	
	public void setCompetences(String[] competences) {
		competences = CV.competences;
	}
	
	public static String[] getCompetences() {
		return competences;
	}
	
	public void setAttentes(String attentes) {
		attentes = CV.attentes;
	}
	
	public static String getAttentes() {
		return attentes;
	}
	
	public void main(String[] args) {
		
		System.out.println("Bienvenue chez Barette!");
		
		setNom("Létourneau");
		setPrenom("Charles");
		setFormation("Informatique de Gestion");
		setNbAnnees(6);
		setCompetences(competences = new String[] {"Proactif", "Le sens des priorités"});
		setAttentes("Passer le cours");
		
		afficher();
		
		setNom("Grecu");
		setPrenom("Ioana");
		setFormation("Informatique de Gestion");
		setNbAnnees(4);
		setCompetences(competences = new String[] {"Travailler en équipe", "Gère bien mon temps"});
		setAttentes("Je n'ai pas d'attente");
		
		afficher();
	}
	
	public static void afficher() {
		
		String informations = "\nNom: " + getNom() + ""
				+ "\nPrenom: " + getPrenom()
				+ "\nFormation: " + getFormation()
				+ "\nExpérience de travail (nombre d'années) :" + getNbAnnees()
				+ "\nCompetences: " + getCompetences()
				+ "\nAttentes vis à vis le cours 4B4: " + getAttentes();
		
		System.out.println(informations);
	
}
