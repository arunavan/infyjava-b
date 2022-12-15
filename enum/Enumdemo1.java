package com.infosys;
 enum pizzasize{
	SMALL,MEDIUM,LARGE
}
public class Enumdemo1 {
	public static void main(String[] args) {
		direction dim;
		pizzasize pizza;
		pizza=pizzasize.LARGE;
		if(pizza.equals(pizzasize.SMALL))
			System.out.println("correct");
		else
			System.out.println("incorrect");
		
		switch (pizza) {
		
		case SMALL : {System.out.println("price is 200"); break;}
		case MEDIUM : {System.out.println("price is 500"); break;}
		
		case LARGE: {System.out.println("price is 800"); break;}
		
		default : System.out.println("wrong input");
		}
		for(pizzasize p:pizzasize.values())
			System.out.println(p+"  "+p.ordinal());
		
		
		for(direction d:direction.values())
			System.out.println(d+"  "+d.ordinal());
	}

}
