package simplonCoin;

/**
 * 
 */
public class AccountMain extends Account {

    /**
     * Default constructor
     */
    public AccountMain() {
    }

    /**
     * 
     */
    public void virement(double sommeViree,AccountMain compteDebite) {
        // TODO implement here
    	compteDebite.setSolde(compteDebite.getSolde() - sommeViree);
    	solde = solde + sommeViree;
    }

}