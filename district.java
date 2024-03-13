import java.util.*;
class district
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		String a[] = new String[5];
		a[0]="Ahemdabad";
		a[1]="Surat";
		a[2]="Rajkot";
		a[3]="junagadh";
		a[4]="morbi";
		
		System.out.println("Enter the index of district to print:");
		int index = sc1.nextInt();
		
		if(index>=0 && index<a.length)
		{
				System.out.println("Disctrict at index "+index+" is "+a[index]);
		}
		else
			System.out.println("Out Of Bounds");
	}
}