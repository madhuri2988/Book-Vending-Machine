package controller;

import java.util.ArrayList;

import model.Currency;

/**
 * DispenseHandler class is interface in COR pattern
 * which will be extended by class which can handle the request
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public interface DispenseHandler {
	void setNextChain(DispenseHandler nextChain);
    
	ArrayList<String> dispense(Currency cur,ArrayList<String> msg);
}
