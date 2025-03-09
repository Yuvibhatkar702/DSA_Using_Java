package Object_And_Class;

public class Getter_And_Setter {

    public static void main(String args[])
    {
        familiy fm = new familiy();

        fm.setParent("Gajanan, Madhuri");
        System.out.println(fm.getParent());
        
        fm.setSalery((float)55.2);
        System.out.println(fm.getSalery());
    }
    
}

class familiy{

    public  String parents;
    private float salery;
    

    void setParent(String para)
    {
       this.parents = para;
    }

    String getParent(){
        return this.parents;
    }

    void setSalery(float sal)
    {
        this.salery = sal;
    }

    float getSalery(){
        return this.salery;
    }




}
