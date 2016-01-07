package model;

/**
 *Abstract class item defines all the properties related to items of vending machine
 *Different items can be included late to vending machine by extending this class
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public abstract class Item {
	String itemName;
	String itemCategory;
	int itemPrice;	
	int itemId;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public abstract void displayItemDetails();
	
}