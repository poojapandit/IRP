import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.omg.Messaging.SyncScopeHelper;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<>();
		
		obj.add(2); //autoboxing
		obj.add(2);
		
		obj.add(5);
		
		System.out.println(obj);
		
		//2
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		//3
		for(Integer i : obj)
		{
			System.out.println(i);
		}
		
		//4
		Iterator it = obj.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ListIterator listIt=obj.listIterator();
		while(listIt.hasNext())
		{
			System.out.println(listIt.next());
		}
		System.out.println("Using java 8");
		
		
		obj.forEach(a->System.out.println(a));
		System.out.println("Method references");
		obj.forEach(System.out::println);
	}

}
