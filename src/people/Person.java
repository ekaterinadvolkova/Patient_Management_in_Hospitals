
package people;

/**
 * Person with default name, which is unique
 * @version 0.1
 * @author ekate
 */
public class Person {
    private String name;
    private int age;
    //create a person identified with name
    public Person (String name){
        this.name=name;
//        this.age=age;
        
    }
    //show unknown perople
    public Person(){
        this.name="Not identified";
    }
    //get the info about the person
    public String getInfo(){
        return this.name;
    }
    //get age
    public int getAge(){
        return this.age;
    }
    //set age
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public String toString (){
        return this.name+"is "+this.age+" years old.";
    }   
    
    
}
