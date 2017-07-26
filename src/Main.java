
import java.util.Scanner;

public class Main {  
    
    public static Bird Add(Scanner in) {
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Latin Name: ");
        String latinName = in.nextLine();
        
        Bird bird = new Bird(name, latinName);
        
        return bird;        
    }    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        birdDB birds = new birdDB();                
        
        while (true) {            
            System.out.print("? ");
            String command = in.nextLine();
            
            if (command.toUpperCase().equals("ADD")) {
                birds.Add(Add(in));
            }
            
            if (command.toUpperCase().equals("OBSERVATION")) {
                System.out.print("What was observed:? ");
                String name = in.nextLine();
                birds.Observation(name);
            }
            
            if (command.toUpperCase().equals("STATISTICS")) {
                birds.Statistics();
            }
            
            if (command.toUpperCase().equals("SHOW")) {
                System.out.print("What? ");
                String name = in.nextLine();
                birds.Show(name);
            }
            
            if (command.toUpperCase().equals("QUIT")) {
                break;
            }
            
        }
    }

}
