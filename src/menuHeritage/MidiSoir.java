package menuHeritage;

/**
 * 
 */
public class MidiSoir extends Menu {

    /**
     * Default constructor
     */
    public MidiSoir() {
    }

    /**
     * 
     */
    public String legume;

    /**
     * 
     */
    public String proteine;

    /**
     * @return
     */
    public void afficheMenuMidiSoir() {
        // TODO implement here
    	System.out.println("Au menu de votre repas : " + getBoisson() + " " + getFeculent() + " " + getFruit() + " " + getProduitLaitier() + " " + getLegume() + " " + getProteine());
    }

	public String getLegume() {
		return legume;
	}

	public void setLegume(String legume) {
		this.legume = legume;
	}

	public String getProteine() {
		return proteine;
	}

	public void setProteine(String proteine) {
		this.proteine = proteine;
	}

}