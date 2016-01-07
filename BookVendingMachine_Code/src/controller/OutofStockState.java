package controller;

/**
 *OutofStockState class extends vendingMachineState
 *and is concrete class in state pattern
 *It will notify admin about the stock status
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class OutofStockState extends VendingMachineState {

	@Override
	public void notifyStockStatus(int vmID) {
		System.out.println(" Insert Items in :"+vmID);
		
	}

}
