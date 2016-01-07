package controller;

/**This interface is implemented by different payment strategies
 * to pay the specified amount
 * @author Venkata Kambalapalli,Priyanka Rao
 *
 */
public interface PaymentStrategy {
	public String pay(int amount);

}
