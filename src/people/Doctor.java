
package people;

/**
 *
 * @author ekate
 */
public class Doctor extends Person{
    private String title;
    private String specialization;
    //Doctor is specified by the title and specialization
    //constructor
    public Doctor( String title,String name,  String specialization){
        super(name);
        this.title=title;
        this.specialization=specialization;
    }
    //get info
    @Override
    public String getInfo(){
        return this.title+" "+super.getInfo()+" "+this.specialization;
    }
    
    
}
