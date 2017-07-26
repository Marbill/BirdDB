
import java.util.ArrayList;


/* @author marbi */
public class birdDB {
    
    private ArrayList<Bird> birds;
    
    public birdDB() {
        birds = new ArrayList<Bird>();
    }
    
    public void Add(Bird bird) {
        birds.add(bird);
    }
    
    private Bird getBird(String name) {
        Bird b;
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                b = bird;
                return b;
            }
        }
        
        return null;
    }
    
    public void Observation(String name) {
        
        Bird bird = getBird(name);
        
        if (bird != null) {
            bird.setObservation(1);
        } else {
            System.out.println("Is not a bird!");
        }
    }
    
    public void Show(String name) {
        Bird bird = getBird(name);
        
        if (bird != null) {
            System.out.println(bird);
        } else {
            System.out.println("Bird not found!");
        }
    }
    
    public void Statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
}
