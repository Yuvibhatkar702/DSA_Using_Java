

public class Inforamtion {
    public static void main(String args[])
    {
        /*
         * Object is a Entity in the real world. like pen,duster,board,etc
         * Class is a group of entities or Class is a group of similer object.
         * 
        Acccess Specifire 
         * 1. Private - Accesseble only within a class
         * 2. Default - Accesseble within class and Within pakage
         * 3. Protected - Accesseble within a class , Package and Subclass only.
         * 4. public - Accesseble any ware in the program  
         * 
        
        "this" is a KeyWorld that refers to a current Obeject.
         
        Encapsulation:- 
          Encapsulation is a one of the piller in OOP that is used in java.
          By using Encapsulation we can warpper a data and Methodes in a Single Unit,that is class class. 
          by using Encapulation we can implements a data Hiding in java. by using diffrent access Specifiare.
          
        

        */

        // Student st = new Student(); // Object
        // st.CGPA((float)8.6);
        // System.out.println(st.CGPA);

        // Bank_Account bank = new Bank_Account();
        // bank.user_name = "Yuvibhatkar702";
        // System.out.println(bank.user_name);

        // bank.Password("123");

        // bank.Account_number(0); // or any valid integer value
        // System.out.println(bank.Account_number);

        // RS rs = new RS();
        // rs.numberOfStudent(100);
        // rs.Room(12);
        // rs.Rent(1600);
        // System.out.println(rs.studentNumber);
        // System.out.println(rs.room);
        // System.out.println(rs.rent);

        RS rs = new RS();

        rs.setStudentNumber(100);
        rs.setRoom(12);
        rs.setRent(1600);

        System.out.println(rs.getStudentNumber());
        System.out.println(rs.getRoom());
        System.out.println(rs.getRent());
            

    }

}

class Bank_Account{

    public String user_name;
    private String passworld;
    protected int Account_number;
    

    void User_Name(String user)
    {
        user_name = user;
    }

    void Password(String pass)
    {
        passworld = pass;
    }

    void Account_number(int ac)
    {
        Account_number = ac;
    }
}

class Student{ // class
    
    String Name;
    int ID;
    float CGPA;

    void SetName(String name) // Propartiys.
    {
        Name = name;
    }

    void Stu_id(int id)
    {
        ID = id;
    }

    void CGPA(float cgpa)
    {
        CGPA = cgpa;
    }

}

class RS {

    private int studentNumber;
    private int rent,room;

    void setStudentNumber(int x){
        this.studentNumber = x;    
    }

    int getStudentNumber(){
        return this.studentNumber;
    }


    void setRoom(int room) {
        this.room = room;
    }

    int getRoom() {
        return this.room;
    }

    void setRent(int rent) {
        this.rent = rent;
    }

    int getRent() {
        return this.rent;
    }

}
