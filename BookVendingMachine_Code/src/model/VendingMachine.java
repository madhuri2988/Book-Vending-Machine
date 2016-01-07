package model;

import java.util.List;

import controller.OutofStockState;
import controller.OverStockState;
import controller.VendingMachineState;
import model.MasterVM;
import db.SqlDB;

/**
 *This abstract class has details specific to vending machine 
 *like vending machine id , name and has state
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public abstract class VendingMachine {
	MasterVM masterVM = new MasterVM();
	int itemCount;
	String stockStatus;
	// functionalities of Vending machines
	private static final int OUT_OF_STOCK = 2;
	private static final int OVER_STOCK = 9;

	private VendingMachineState vState;
	protected String location;
	protected int vmID;
	protected String vmName;
	SqlDB sqlDB = new SqlDB();

	public void notifyMasterVM(VendingMachineState vmstate) {

		masterVM.update(vmID, vState);
	}

	public VendingMachineState getvState() {
		return vState;
	}

	public void setvState(VendingMachineState vState) {
		this.vState = vState;
	}

	/** Whenever there is state change master vm will be notified 
	 * of it. Observer is notified of the stock status and vending 
	 * machine state is change to specific state.
	 * 
	 */
	public void changeState() {

		int count = sqlDB.getItemCount(vmID);
		if (count < OUT_OF_STOCK) {
			setvState(new OutofStockState());
			notifyMasterVM(vState);
			vState.notifyStockStatus(vmID);

		} else if (count >= OVER_STOCK) {
			setvState(new OverStockState());
			notifyMasterVM(vState);
			vState.notifyStockStatus(vmID);

		}

	}

	abstract public List<Item> display_item();

	public String getVendingCard(VendingCard vc) {

		String message = sqlDB.insertNewVendingCard(vc);
		return message;

	}

	public int validateCard(VendingCard vc) {
		return sqlDB.validateCardDB(vc);
	}

	abstract public void remove_item(int id);

	public abstract String removeVendingMachine();

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getVmID() {
		return vmID;
	}

	public void setVmID(int vmID) {
		this.vmID = vmID;
	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	abstract public void donateBooks(List<String> bookname,
			List<String> category);

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

}