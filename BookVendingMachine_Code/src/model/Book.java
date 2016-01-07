package model;

/**
 *Book is type of item which has some features specific to it like
 *category,publication and price
 * 
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class Book extends Item {

	private String bookCategory;
	private String publication;
	private int price;

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	@Override
	public void displayItemDetails() {
		// TODO Auto-generated method stub

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
