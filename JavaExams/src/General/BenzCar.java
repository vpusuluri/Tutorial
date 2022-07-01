package General;


interface ABC
{
	public void startEngine();
}
public class BenzCar implements ABC
{
    public void startEngine()
    {
    	System.out.println("Enginer Started");
    }
	public static void main(String[] args) 
	{
		BenzCar bc = new BenzCar();
		bc.startEngine();

	}

}
