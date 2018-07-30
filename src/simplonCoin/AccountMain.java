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
    public void virement(double sommeViree, AccountMain compteDebite, AccountMain compteCredite) {
        // TODO implement here
    	compteDebite.setSolde(compteDebite.getSolde() - sommeViree);
    	compteCredite.setSolde(compteCredite.getSolde() + sommeViree);
    }

}