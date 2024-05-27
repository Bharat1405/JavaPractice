class Student implements Cloneable
{
    public String name;
    public int marks;
    public int age;

    public Student(String str, int a, int b)
    {
        this.name = str;
        this.marks = a;
        this.age = b;
    }

    public Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo     //extends Object
{
    public static void main(String Arg[])
    {
        try
        {
            Student obj1 = new Student("Amit",57,27);
            Student obj2 = (Student)obj1.clone();

            System.out.println(obj1.name);
            System.out.println(obj1.marks);
            System.out.println(obj1.age);

            System.out.println(obj2.name);
            System.out.println(obj2.marks);
            System.out.println(obj2.age);            
        }
        catch(Exception obj)
        {

        }
        
    }
}