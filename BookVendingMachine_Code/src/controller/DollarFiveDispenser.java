package controller;

import java.util.ArrayList;

import model.Currency;

/**
 *This is first class in Chain of responsibility pattern
 *which implements the handler and overrides the method to handle 
 * dispensing of $5 notes
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class DollarFiveDispenser implements DispenseHandler {
	private DispenseHandler chain;
    
    @Override
    public void setNextChain(DispenseHandler nextChain) {
        this.chain=nextChain;
    }
 
    @Override
    public ArrayList<String> dispense(Currency cur,ArrayList<String> msg) {
    
    	String s = null;
        if(cur.getAmount() >= 5){
            int num = cur.getAmount()/5;
            int remainder = cur.getAmount() % 5;
         
            s="Dispensing "+num+" 5$ note";
            msg.add(s);
            if(remainder !=0) this.chain.dispense(new Currency(remainder),msg);
        }else{
            this.chain.dispense(cur,msg);
        }
        return msg;
    }
}
