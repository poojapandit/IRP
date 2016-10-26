interface Maths
{
	int operation(int a,int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		Maths m = new Maths(){

			@Override
			public int operation(int a, int b) {
				
				return a+b;
			}
		
		};
		
		System.out.println(m.operation(4, 4));
		
		Maths m2=(int a,int b) ->{
            return a*b;
	};
	
	System.out.println(m2.operation(5, 5));
	
	Maths m3=(a,b)-> a+b;
	
	System.out.println(m3.operation(77, 77));

}}
