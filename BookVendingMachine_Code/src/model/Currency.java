package model;

/**
 *Currency is entity model which sets and get amount
 *new currencies can be added by extending this class
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class Currency {
	private int amount;
    
    public Currency(int amt){
        this.amount=amt;
    }
     
    public int getAmount(){
        return this.amount;
    }
}
