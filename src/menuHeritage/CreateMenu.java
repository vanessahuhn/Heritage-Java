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
    	//création des instances
    	Matin menuMatin = new Matin();
    	MidiSoir menuMidi = new MidiSoir();
    	MidiSoir menuSoir = new MidiSoir();
    	   	
    	menuMatin.setBoisson("café");
    	menuMatin.setCereale("muesli");
    	menuMatin.setFeculent("pain complet");
    	menuMatin.setFruit("orange");
    	menuMatin.setProduitLaitier("lait");
    	
    	menuMidi.setBoisson("eau");
    	menuMidi.setFeculent("pâtes");
    	menuMidi.setFruit("banane");
    	menuMidi.setLegume("poivron");
    	menuMidi.setProduitLaitier("yaourt");
    	menuMidi.setProteine("tofu");
    	
    	menuSoir.setBoisson("eau");
    	menuSoir.setFeculent("riz");
    	menuSoir.setFruit("pomme");
    	menuSoir.setLegume("courgette");
    	menuSoir.setProduitLaitier("fromage");
    	menuSoir.setProteine("thon");
    	
    	menuMatin.afficheMenuMatin();
    	menuMidi.afficheMenuMidiSoir();
    	menuSoir.afficheMenuMidiSoir();
    }

}