package Object_And_Class;

public class Const{

    public static void main(String args[])
    {
        Student s1 = new Student();
        // Student s2 = new Student("Yuvraj");
        // Student s3 = new Student(1235);

        s1.Name = "Yuvraj";
        s1.id = 007;

        
        Student s2 = new Student(s1);
        s2.Passworld = "Yuvraj";

    }
    
}

class Student{ 

    String Name;
    int id;
    String Passworld;
    int arr[]; 

    Student(Student s1){ // Coppy Constructor
        this.Name = s1.Name;
        this.id = s1.id;
        arr = new arr[3];
    }

    Student(){ // Defalut Constructor
        
        System.out.println("Constructor is called....");
       
    }

    Student(String name){ // Parameterrize Constructor

        this.Name = name;
        System.out.println(Name);

    }

    Student(int number)
    {
        this.id = number;
    }


}

