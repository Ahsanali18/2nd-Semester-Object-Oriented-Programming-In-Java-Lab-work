package ArrayLists;
import java.util.ArrayList;

public class ProvidName_To_Delete {
    public static void main(String[] args) {
        Univers uni= new Univers("MUET", 1);
        ArrayList<Univers> al= new ArrayList<>();
        al.add(uni);//Provide name to remove object instead of index;
        System.out.println(uni.name);
           al.remove(uni);
    }   
}
class Univers{
    String name;
    int rank;
    
    public Univers(String name, int rank)
    {
        this.name=name;
        this.rank=rank;
    }

    public void showdata()
    {
        System.out.println("Uni name: "+name);
        System.out.println("Uni rank: "+rank);
        
    }

}
class Studen{
    String name;
    int age;
    
    public Studen(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void showdata()
    {
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        
    }

}
class Depart{
    String name;
    int t_students;
    
    public Depart(String name, int t_students)
    {
        this.name=name;
        this.t_students=t_students;
    }

    public void showdata()
    {
        System.out.println("Department name: "+name);
        System.out.println("Total student in depatment: "+t_students);
    }

}
