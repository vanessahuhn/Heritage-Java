package menuHeritage;

/**
 * 
 */
public class CreateMenu {

    /**
     * Default constructor
     */
    public CreateMenu() {
    }
    
    public static void main(String[] args) {
    	//cr�ation des instances
    	Matin menuMatin = new Matin();
    	MidiSoir menuMidi = new MidiSoir();
    	MidiSoir menuSoir = new MidiSoir();
    	menuMatin.afficheMenuMatin();
    	menuMidi.afficheMenuMidiSoir();
    	menuSoir.afficheMenuMidiSoir();
    }

}