import java.util.Scanner;

public class Start implements Weapons
{
	public void intialise()
	{
		String useName;
		int useAge;
Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		useName=sc.next();
		System.out.println("enter your age");
		useAge=sc.nextInt();
		if(useAge>18)
		{
			System.out.println("Hello "+useName+" welcome to the world of jombis");
			Begin();
			
		}
		else
		{
			System.out.println("you are not allowed");
		}
		
		}
	
	
	public void Begin()
	{
		Scanner sc=new Scanner(System.in);
	
	System.out.println("you have 3 regions you can move");
		System.out.println("1.North of Jombiland");
		System.out.println("2.South of Jombiland");
		System.out.println("3.West of Jombiland");
		System.out.println("please enter your choice");
		int i=sc.nextInt();
		if(i==1)
		{
			System.out.println("You have entered into the North of Jombiland");
			
			System.out.println("you have three weapons to pick and proceed forward");
			System.out.println("1.Gun 2.Sword 3.Granite 4.Missile Launcher");
			int choice=sc.nextInt();
			if(choice==1)
			{
				gun();
			}
			
			else if(choice==2)
			{
				Missile();
			}
			
			else if(choice==3)
			{
				
				Sword();
			}
			
		}
		
		
		else if(i==2)
		{
			
			System.out.println("You have entered into the South of Jombiland");
		}
		else if(i==3)
		{
			System.out.println("You have entered into the west of Jombiland");
		}
	}
	
	
	
	@Override
	public void gun() {
		System.out.println("...");
		
	}

	@Override
	public void Missile() {
		// TODO Auto-generated method stub
		System.out.println("booom..");
	}

	@Override
	public void Sword() {
		// TODO Auto-generated method stub
		System.out.println("cut into pieces");
		
	}
	

}
