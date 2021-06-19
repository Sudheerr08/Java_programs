package Package2;

public class constructor {
	constructor()
	{
		this(2,3,4,5);
		System.out.println("Default constructor");
	}
	constructor(int a)
	{
		this(2,3);
		System.out.println("1 parameterized constructor");
	}
	constructor(int a,int b)
	{
		this();
		System.out.println("2 parameterized constructor");
	}
	constructor(int a,int b,int c)
	{
		this(2);
		System.out.println("3 parameterized constructor");
	}
	constructor(int a,int b,int c,int d)
	{
		System.out.println("4 parameterized constructor");
	}
	
	
	
	public static void main(String[] args)
	{
		constructor cs = new constructor(2,3,4);
		
	}

}
