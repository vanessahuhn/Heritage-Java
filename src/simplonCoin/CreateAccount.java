package simplonCoin;

/**
 * 
 */
public class CreateAccount {

    /**
     * Default constructor
     */
    public CreateAccount() {
    }
    
    public static void main(String[] args) {
    	AccountMain pierreAccountMain = new AccountMain();
    	AccountPEL pierreAccountPEL = new AccountPEL();
    	AccountMain aureliaAccountMain = new AccountMain();
    	AccountPEL aureliaAccountPEL = new AccountPEL();
    	
    	pierreAccountMain.setSolde(200.0);
    	aureliaAccountMain.setSolde(100.0);
    	System.out.println("Solde du compte de Pierre avant le virement: " + pierreAccountMain.getSolde());
    	System.out.println("Solde du compte de Aurelia avant le virement: " + aureliaAccountMain.getSolde());
    	
    	pierreAccountMain.virement(25.0, aureliaAccountMain);
    	
    	System.out.println("Solde du compte de Pierre après le virement: " + pierreAccountMain.getSolde());
    	System.out.println("Solde du compte de Aurelia après le virement: " + aureliaAccountMain.getSolde());
    	
    	
    }

}