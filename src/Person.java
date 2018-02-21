
public class Person {
	String name;
	int age;
	public Person(String name1,int age1) 
	{
		name=name1;
		age=age1;
	}
	public boolean isAdult()
	{
		if(age>18)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
