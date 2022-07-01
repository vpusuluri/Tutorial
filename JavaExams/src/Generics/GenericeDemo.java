package Generics;
class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob=ob;
		
	}
	public void show()
	{
		System.out.println("The type of ob is = " + ob.getClass().getName());
	}
	public T getOb()
	{
		return ob;
	}
}
public class GenericeDemo {

	public static void main(String[] args) 
	{
		
		Gen<String> g1 = new Gen<String>("Durga");
		g1.show();
		System.out.println("The String object= " + g1.getOb());
		
		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		System.out.println("The Integer object= " + g2.getOb());
		
		Gen<Double> g3 = new Gen<Double>(10.5);
		g3.show();
		System.out.println("The Integer object= " + g3.getOb());

	}

}
