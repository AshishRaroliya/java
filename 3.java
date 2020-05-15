import java.util.Scanner;
class Ash
{
	public static void test (int at[])
	{ 

     for (int i=0 ; i < at.length-1 ; i++)
     {
       
       for(int j=0 ; j<at.length-i-1 ; j++)
       {

        if(at[j]>at[j+1])
        {
        	int temp = at[j];
        	at [j]  = at[j+1];
        	at[j+1]  = temp;
        }

       }
    
       }

	}
}

class Ash1
{
public static void main(String[] args) 
{    Scanner s1 = new Scanner (System.in);
	System.out.print("enter the length of array");
	 int length = s1.nextInt();
	int at[]=new int[length];
	System.out.print("enter the elements of array");
	for(int i=0 ; i<length ; i++)
	{
		at[i]=s1.nextInt();
	}

	Ash.test(at);

System.out.println("this is your sorted array");
for(int j =0 ; j<length ; j++)
{

	System.out.print(at[j]+",");
}

}

}
