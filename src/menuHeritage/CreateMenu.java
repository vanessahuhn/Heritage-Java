package menuHeritage;

import java.util.*;

/**
 * 
 */
public class CreateMenu {

    /**
     * Default constructor
     */
    public CreateMenu() {
    }

    public Matin getMenuMatin() {
		return menuMatin;
	}

	public void setMenuMatin(Matin menuMatin) {
		this.menuMatin = menuMatin;
	}

	public MidiSoir getMenuMidi() {
		return menuMidi;
	}

	public void setMenuMidi(MidiSoir menuMidi) {
		this.menuMidi = menuMidi;
	}

	public MidiSoir getMenuSoir() {
		return menuSoir;
	}

	public void setMenuSoir(MidiSoir menuSoir) {
		this.menuSoir = menuSoir;
	}

	/**
     * 
     */
    public Matin menuMatin;

    /**
     * 
     */
    public MidiSoir menuMidi;

    /**
     * 
     */
    public MidiSoir menuSoir;
    
    public static void main(String[] args) {
    	
    }

}