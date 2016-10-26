import java.util.LinkedList;

public class Stream_Collectors {

	public static void main(String[] args) {
	     LinkedList<String> s=new LinkedList<>();
	     
	     s.add("one");
	     
	     s.add("");    s.add("");
	     s.add("two");
	     
	     int count =(int) s.stream().filter(string -> string.isEmpty()).count();
	     
	     System.out.println(count);
	}

}
