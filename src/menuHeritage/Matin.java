package menuHeritage;

/**
 * 
 */
public class Matin extends Menu {

    /**
     * Default constructor
     */
    public Matin() {
    }

    /**
     * 
     */
    public String cereale;

    /**
     * @return
     */
    public void afficheMenuMatin() {
        // TODO implement here
        System.out.println("Au menu de votre petit-déjeuner : " + getBoisson() + " " + getFeculent() + " " + getFruit() + " " + getProduitLaitier() + " " + getCereale());
    }

	public String getCereale() {
		return cereale;
	}

	public void setCereale(String cereale) {
		this.cereale = cereale;
	}

}