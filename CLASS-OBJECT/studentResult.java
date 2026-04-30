/* 
 Create a class Student with attributes id, name, and marks.
Accept marks from the user and determine whether the student Passes or Fails.
If marks >= 35, print Pass, otherwise print Fail.
Input:
Enter Student Id : 101
Enter Student Name : Rahul
Enter Marks : 72

Output:
Student Id : 101
Student Name : Rahul
Marks : 72
Result : Pass
*/

import java.util.Scanner;
class students
{
	int  id ,marks;
	String name;
	public students(int id , String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	
	void show()
	{
		IO.println("Student Id : " +id);
		IO.println("Student Name : "+name);
		IO.println("Marks : "+marks);
		if(marks >=35)
		{
			IO.println("Result : Pass");
		}
		else {
			IO.println("Result : Fail");
		}
	}
}

class studentResult
{
	public static void main (String[] MJ)
	{
		Scanner sc=new Scanner (System.in);
		
		IO.println("Enter Student ID : ");
		int id=sc.nextInt();
		
		
		IO.println("Enter Student name : ");
		sc.nextLine();
		String name=sc.nextLine();
		
		
		IO.println("Enter marks : ");
		int marks=sc.nextInt();
		
		students s=new students(id, name,marks);
		s.show();
	}
	
	
	
}