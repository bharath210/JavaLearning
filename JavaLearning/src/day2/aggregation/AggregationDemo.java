package day2.aggregation;





public class AggregationDemo 
{

	public static void main(String[] args) 
	{
		Address add1 = new Address("Mumbai","MH");
		Address add2 = new Address("Hyderabad","TS");
		Emp e1 = new Emp(1, "Govind", add1);
		Emp e2 = new Emp(2, "Sai", add2);
		
		System.out.println(e1.id+" "+e1.name+" "+e1.address.city+" "+e1.address.State);
		System.out.println(e2.id+" "+e2.name+" "+e2.address.city+" "+e2.address.State);
		

	}

}
