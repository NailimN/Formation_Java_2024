
public class HealthStation {

    private int weighCount;
    
    public int weighings(){
        return weighCount;
    }
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighCount++;
        return person.getWeight();
        
    }
    
    public void feed(Person person){
        
        person.setWeight(person.getWeight() + 1);
    }

}
