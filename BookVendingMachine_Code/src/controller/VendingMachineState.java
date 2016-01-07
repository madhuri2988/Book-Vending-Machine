package controller;

/**
 *This abstract class describes vendingMachine state
 *which has two states, over stock and out of stock
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public abstract class VendingMachineState {
  public abstract void notifyStockStatus(int vmID);
}
