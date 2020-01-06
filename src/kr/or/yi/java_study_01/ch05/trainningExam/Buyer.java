package kr.or.yi.java_study_01.ch05.trainningExam;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 " + p.toString() + "을/를 살수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	void add(Product p) {
		if(i>=cart.length) {
			Product[] tmp = new Product[i*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i] = p;
		i++;
	}
	void summany() {
		int summary = 0;
		System.out.print("구입한 물건");
		for(int i=0;i<this.i;i++) {
			summary += cart[i].price;
			System.out.printf("%s%s",cart[i].toString(),i==this.i-1?"":",");
		}
		System.out.println();
		System.out.println("사용한 금액 : " + summary);
		System.out.println("남은 금액 : " + money);
	}
}
