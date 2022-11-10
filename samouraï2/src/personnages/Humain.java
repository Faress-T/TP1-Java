package personnages;

public class Humain {
	
	String nom;
	int argent;
	String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;				
	}
	
	public void parler(String texte){
		System.out.println("(" + this.nom + ")" + " - " + texte);
	}
	
	public void direBonjour(){
		this.parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}
	
	public void boire(){
		this.parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}

	public String getNom() {
		return this.nom;
	}

	public int getArgent() {
		return this.argent;
	}

	public String getBoisson() {
		return this.boisson;
	}
	
	public void gagnerArgent(int n) {
		this.argent = this.argent + n;		
	}
	
	public void perdreArgent(int n) {
		this.argent = this.argent - n;		
	}
}
