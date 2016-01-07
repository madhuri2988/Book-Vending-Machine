package controller;

/**
 *OverStockState is concrete class in state pattern
 *which will notify admin when there is over stock
 *in vending machine
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class OverStockState extends VendingMachineState{

	@Override
	public void notifyStockStatus(int vmID) {
		System.out.println(" Remove Items from :"+vmID);
		
	}

}
