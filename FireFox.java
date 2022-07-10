package week2.day2;

public class FireFox 
{
	
	boolean visible=true;
	int year=1998;
	char logo='m';
	
	private void edge() 
	{
		float version=100.2f;
		String name="firefox";
		System.out.println(version);
		System.out.println(name);
	}
	private void chrome() 
	{
		int speed=100;
		System.out.println(speed);
	}

	public static void main(String[] args)
	{
		FireFox data=new FireFox(); 
		{
			data.edge();
			data.chrome();
			
		}
	}
	

}
//Goal: To understand the primitive/non-primtive data types
//create method,and object
//a) Create a class by name:firefox (with main method) 
//b) Create following variables
   // 1) version = 100.2  (float)
   // 2) name = "firefox" (String)
    //3) visible = true (boolean)
    //4) year = 1998 (int)
   // 5) logo = 'm' (char)
//c)Create method name edge() inside two variable 1.version,2.name
//use print statement
//d)Create method name chrome() inside one variable speed;
//use print statement
//e)Create object for this class then call the method and variable(classname objname=new classname();)
//d) run and confirm the printed in console
