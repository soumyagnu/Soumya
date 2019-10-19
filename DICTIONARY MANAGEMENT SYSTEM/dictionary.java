import java.util.*;
class dictionary
{ public static void main(String[] args) 
    {   Scanner sc = new Scanner(System.in); int a=1,count=0;char b;
		String[] strArray = { "Abandon", " To go away forever", "Above", " Higher than", "Baby", " Very young child who cannot walk yet", "Bad", " Not good; Wrong","Cab"," Place where driver seats;Taxi","Cable"," A very strong thick rope", "Daily"," Every day","Damage", " Harm or injury","Eager"," Waiting very much to do something", "Earnest", " Serious; Sincere","Zeal"," Enthusiasm,eagerness,passionate"};
		while(a!=2)
		{   count=0;
			System.out.println("### Dictionary Management System ###\n");
			System.out.print("    Enter Word: ");
			String s = sc.nextLine(); 
			for (int i = 0; i < strArray.length; i++)
			{   
				if(s.equals(strArray[i])) 
				{   
					System.out.println("    Meaning is:"+strArray[i+1]+"\n"); count=1;
				}
			} 	
			if(count==0){System.out.println("OOPS!!! Word Not Found!!!");}
			System.out.println("Do you want to contiue(Y/N)");
			b= sc.next().charAt(0);
			if(b=='n'||b=='N')
			{
			 a=2;
			 System.out.println("Logging Out");
			} else{a=1;}
		}	
	}
}
