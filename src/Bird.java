
/* @author marbi */
public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getName() {
        return name;
    }    

    public int getObservation() {
        return observation;
    }

    public void setObservation(int observation) {
        this.observation += observation;
    }   

    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observation + " observations";
    }   

}
