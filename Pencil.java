package day8functions;

public class Pencil {
int price;
int tax;
int dis;
int taxper;
int disAmt;
public int findNetPrice() {
	return price+tax-dis;
}
public int taxAmount() {
	return price*taxper/100;
	
}
public int disAmount() {
	return price*disAmt/100;
}
}
