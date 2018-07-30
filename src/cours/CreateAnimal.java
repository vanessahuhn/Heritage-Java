package cours;

public class CreateAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chien monChien = new Chien();
		monChien.setNom("Médor");
		monChien.setCouleur("Noir");
		System.out.println("Mon chien s'appelle " + monChien.getNom() + " et il fait " + monChien.aboie() + ".");
	}

}
