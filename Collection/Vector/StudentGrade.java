


/*
Q11. Create a POJO class Student with fields:
id
name
marks
Store 5 students in a Vector and display students who scored more than 60 marks.
Description
Program should:
Create Student class with getters/setters
Store objects in Vector
Apply condition marks > 60
Display qualified students
Input
101 Rahul 55 
102 Amit 78 
103 Neha 88 
104 Pooja 45 
105 Kiran 67
Output
Students scoring above 60:

102 Amit 78
103 Neha 88
105 Kiran 67
 */

import java.util.Vector;

class Student 
{
    private int id;
    private String name;
    private int marks;

    Student (int id, String name, int marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;

    }

 public void setId(int id)
   { this.id=id;
   }
   public int getId()
   { return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
   public void setmarks(int marks)
   { this.marks=marks;
   }
   public int getmarks()
   { return marks;
   }


}
public class StudentGrade {
    public static void main(String[] args) {
 
        Vector v=new Vector<>();
        Student s1=new Student(101, "Rahul", 55);
        Student s2=new Student(102, "Neha", 78);
        Student s3=new Student(103, "Pooja", 88);
        Student s4=new Student(104, "Kiran", 45);
        Student s5=new Student(105, "Amit", 67);

        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        v.add(s5);


        for (Object obj : v) {
             Student s=(Student)obj;
             if(s.getmarks() >60)
             {
                System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getmarks());

             }
			

            
        }
        
    }
    
}
