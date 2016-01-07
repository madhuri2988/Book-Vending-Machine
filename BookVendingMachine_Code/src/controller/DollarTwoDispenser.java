package controller;

import java.util.ArrayList;

import model.Currency;

/**
 *This is second class in Chain of responsibility pattern
 *which implements the handler and overrides the method to handle 
 * dispensing of $1 notes
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class DollarTwoDispenser implements DispenseHandler{

	 
    private DispenseHandler chain;
     
    @Override
    public void setNextChain(DispenseHandler nextChain) {
        this.chain=nextChain;
    }
 
    @Override
    public ArrayList<String> dispense(Currency cur,ArrayList<String> msg) {
    	String s=null;
        if(cur.getAmount() >= 2){
        	
            int num = cur.getAmount()/2;
            int remainder = cur.getAmount() % 2;
            s="Dispensing "+num+" 2$ note";
            msg.add(s);
            if(remainder !=0) this.chain.dispense(new Currency(remainder),msg);
        }else{
            this.chain.dispense(cur,msg);
        }
        return msg;
    }
 
}
