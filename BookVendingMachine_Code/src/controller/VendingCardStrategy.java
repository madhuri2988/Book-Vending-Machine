package controller;

import db.SqlDB;
import model.VendingCard;
/**
 *VendingcardStrategy is concrete class of payment strategy
 *which used card details to pay the amount
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public class VendingCardStrategy implements PaymentStrategy{
	VendingCard vc;
	public VendingCardStrategy(VendingCard vc){
		this.vc=vc;
	}
	
	@Override
	public String pay(int amount) {
		SqlDB sqldb=new SqlDB();
		String message=sqldb.selectVendingCardDB(vc,amount);
		return message;
	}

}
