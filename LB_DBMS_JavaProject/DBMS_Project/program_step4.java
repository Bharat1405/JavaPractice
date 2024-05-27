import java.util.*;

class Student {
    public int Rno;
    public String Name;
    public int Age;
    public int Marks;

    public static int Generator;

    static {
        Generator = 0;
    }

    public Student(String str, int X, int Y) {
        this.Rno = ++Generator;
        this.Name = str;
        this.Age = X;
        this.Marks = Y;
    }

    public void Display() {
        System.out.println(this.Rno + " " + this.Name + " " + this.Age + " " + this.Marks);
    }
}

class DBMS {
    public LinkedList<Student> lobj;

    public DBMS() {
        lobj = new LinkedList<Student>();
        // https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
    }

    public void StartDBMS() {
        System.out.println("DBMS started successfully...");
        System.out.println("Table schema created successfully...");
    }

    // insert into table values(____, ______, ____)
    public void InsertIntoTable(String name, int age, int marks) 
    {
        Student sobj = new Student(name, age, marks);
        lobj.add(sobj);
    }

    // select * from student;
    public void SelectFrom() 
    {
        System.out.println("\nAll the records : \n");

        for (Student sref : lobj) 
        {
            sref.Display();
        }
    }

    // select * from student where Rno = 11;
    public void SelectFrom(int no) 
    {

        for (Student sref : lobj) 
        {
            if (sref.Rno == no) 
            {
                sref.Display();
                break;
            }
        }
    }

    // select * from student where Name = 'Rahul';
    public void SelectFrom(String str) {

        for (Student sref : lobj) 
        {
            if (str.equals(sref.Name)) 
            {
                sref.Display();
                break;
            }
        }
    }

    // delete from student where Rno = 11;
    public void DeleteFrom(int no) 
    {
        int i = 0;

        for (Student sref : lobj) 
        {
            if (sref.Rno == no) 
            {
                lobj.remove(i);
                break;
            }
            i++;
        }
    }

    //select MAX(marks) from student
    public int Aggregate_MAX() 
    {
        Student temp = lobj.get(0);
        int iMax = temp.Marks;

        for (Student sref : lobj) 
        {
            if (sref.Marks > iMax) 
            {
                iMax = sref.Marks;
                break;
            }
        }

        return iMax;
    }

    //select MIN(marks) from student
    public int Aggregate_MIN() 
    {
        Student temp = lobj.get(0);
        int iMin = temp.Marks;

        for (Student sref : lobj) 
        {
            if (sref.Marks < iMin) 
            {
                iMin = sref.Marks;
                break;
            }
        }

        return iMin;
    }


    //select SUM(marks) from student
    public int Aggregate_SUM() 
    {
        int iSum = 0;

        for (Student sref : lobj) 
        {
            iSum += sref.Marks; 
        }

        return iSum;
    }

    //select AVG(marks) from student
    public double Aggregate_AVG() 
    {
        int iSum = 0;
        double dAvg = 0.0;

        for (Student sref : lobj) 
        {
            iSum += sref.Marks; 
        }

        return iSum/lobj.size();
    }

    
}

public class program_step4 
{
    public static void main(String arg[]) {
        DBMS obj = new DBMS();
        obj.StartDBMS();

        obj.InsertIntoTable("Rahul", 23, 89);
        obj.InsertIntoTable("Sagar", 26, 98);
        obj.InsertIntoTable("Pooja", 20, 56);
        obj.InsertIntoTable("Sayali", 30, 78);
        obj.InsertIntoTable("Tejas", 29, 68);

        obj.SelectFrom();

        System.out.println("\nMax : "+ obj.Aggregate_MAX());
        System.out.println("Min : "+ obj.Aggregate_MIN());
        System.out.println("Sum : "+ obj.Aggregate_SUM());
        System.out.println("Avg : "+ obj.Aggregate_AVG()+"\n");

        obj.SelectFrom(4);
        obj.SelectFrom("Tejas");

        obj.DeleteFrom(4);
        obj.SelectFrom();

    }
}
