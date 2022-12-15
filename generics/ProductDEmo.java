import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class Product //implements Comparable
{
	Integer id;
	String name;
	Double qty,price;
	
	public Product(Integer id, String name, Double qty, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
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
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	/*
	 * public int compareTo(Object o) { Product p=(Product)o; if(this.qty>p.qty)
	 * return 1; else if(this.qty<p.qty) return -1; else return 0; }
	 */
	}
class IdComparator implements Comparator<Product>{
	public int compare(Product p1,Product p2) 
	{/*
		 * Product p1=(Product)o1; Product p2=(Product)o2;
		 */
	if(p1.qty>p2.qty)
		  return 1;
	else if(p1.qty<p2.qty) 
		return -1; 
	else return 0; }
	
}






public class ProductDEmo {
	public static void main(String[] args) {
	//	TreeSet<Product> productSet=new TreeSet<>(new IdComparator());
	    List<Product> productSet=new ArrayList<>();
		productSet.add(new Product(10,"box",80.00,900.00));
		productSet.add(new Product(8,"box",60.00,920.00));
		productSet.add(new Product(11,"box",20.00,980.00));
		productSet.add(new Product(5,"box",90.00,930.00));
		Collections.sort(productSet,new IdComparator());
		System.out.println(productSet);

	}

}
