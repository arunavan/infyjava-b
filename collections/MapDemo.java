package com.infosys.collections;
import java.util.*;
import java.util.Map.Entry;


public class MapDemo {

	public static void main(String[] args) {
		
		  Map<Integer,Object> hmap=new HashMap<Integer,Object>();
		  hmap.put(5, new Date()); 
		  hmap.put(2, null); 
		  hmap.put(1, null); 
		  hmap.put(9, null); 
		  hmap.put(8,
		  new Course(101,"Java"));
hmap.put(10, new Course(101,"Java"));
hmap.put(19, "webservices"); 
hmap.put(null, new Course(101,"Java"));
		  System.out.println(hmap.get(5)); 
		  System.out.println(hmap.containsKey(1));
		  System.out.println(hmap.containsValue("rest")); 
		  System.out.println(hmap); Set
		  keys=hmap.keySet(); //K System.out.println(keys); Iterator
		  i2=keys.iterator(); 
		  while(i2.hasNext()) 
			  System.out.println(i2.next());
		  Collection val=hmap.values(); //V System.out.println(val); Set
		  eset=hmap.entrySet(); //K-V //System.out.println(eset)); Iterator
		  it=eset.iterator(); 
		  while(it.hasNext()){
			  Entry entry=(Entry)it.next();
		  System.out.println(entry.getKey()+"  "+entry.getValue()); 
		  }
		 
        //synchronized ,//HashMap,LinkedHashMap,TreeMap,Hashtable
		//Map<Integer,Object> map=new Hashtable<>();
		//Map<Integer,Object> map=new HashMap<>();
		//Map map=new HashMap();//add - put, keys are unique, null as key
		//not sorted , not ordered
		Map<String,Object> map=new TreeMap<String,Object>();//add - put, keys are unique, null as key
		map.put("monday",3);
		map.put("tuesday",new User(1, "Ram1"));
		//map.put(1,3987.89);
		//map.put(6,new Date());
		//map.put(9,3);
		//map.put(8,"java");
		//map.put(8,7);
	//	map.put(12, "11");
	//	map.remove(10);
	//	System.out.println(map.containsKey(9));
		System.out.println(map.containsValue(7));
		System.out.println(map);
		Set keys=map.keySet();
		System.out.println(keys);
		Collection c=map.values();
		System.out.println(c);
		Set entries=map.entrySet();
		Iterator i=entries.iterator();
		while(i.hasNext()) {
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		Map<User,String> um=new HashMap<>();
		um.put(new User(1, "Ram1"),"user A");
		um.put(new User(2, "Ram2"),"user B");
		um.put(new User(1, "Ram1"),"user C");
		um.put(new User(2, "Ram2"),"user D");
		um.put(new User(3, "Ram3"),"user E");
			System.out.println(um);
			
	}

}
