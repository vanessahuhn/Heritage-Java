package simplonCoin;

/**
 * 
 */
public class AccountPEL extends Account {

    /**
     * Default constructor
     */
    public AccountPEL() {
    }

    /**
     * 
     */
    public double tauxEpargne = 0.035;

	public double getTauxEpargne() {
		return tauxEpargne;
	}

	public void setTauxEpargne(double tauxEpargne) {
		this.tauxEpargne = tauxEpargne;
	}

}