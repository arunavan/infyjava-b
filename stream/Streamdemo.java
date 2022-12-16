import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Account{
	Integer id;
	String name;
	Double balance;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Account(Integer id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
//@FunctionalInterface
interface Arith<T>{
	T op(T a,T b);
	//double getVal();
	
}
public class Streamdemo {
	public static void main(String[] args) {
		
		Arith<Integer> a1=( a, b)->{ return a+b;};
		System.out.println(a1.op(4, 5));
		
		Arith<Double> a2=( a, b)->a+b;
		System.out.println(a2.op(43.56, 523.45));
		
		
		List<Integer> list=Arrays.asList(2,2,4,6,8,10,12,14,7,4,9,1,5,7,4);
		for(Integer l :list)
			System.out.println(l);
		System.out.println("streams...");
		list.stream().distinct().limit(3).filter(x->x%2==0).map(n->n*n).forEach(x->System.out.println(x));
		
		list.stream().filter(x->x<10).forEach(x->System.out.println(x));
		
		List<Integer> newList=list.stream().filter(x->x<5).collect(Collectors.toList());
			newList.forEach(System.out::println);	
				
		  Stream s=Stream.of(34,56,78,90); 
		    s.forEach(x->System.out.println(x));
		 //	s.forEach(System.out::println);
		    
		    
		    List<Account> aList=Arrays.asList(new Account(101,"ram",5678.45),new Account(111,"ram5678",5678.45),
		    		new Account(109,"ram123",5678.45),
		    		new Account(104,"ram2134",5678.45));
		    
		    aList.stream().map(a->a.getName()).forEach(System.out::println);
		    
		    aList.stream().map(Account::getBalance).forEach(System.out::println);
		    
		    
		
	}
}
