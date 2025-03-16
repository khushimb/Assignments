
public class Holi {
    String color;
    String festivalName;
    boolean isDry;
    int duration; 
    String celebrationType;
    int numberOfParticipants;

   
    public Holi() {
        this("Red", "Holi", false, 5, "Community", 100); 
    }

    
    public Holi(String color) {
        this(color, "Holi", false, 5, "Community", 100);
    }

    
    public Holi(String color, String festivalName) {
        this(color, festivalName, false, 5, "Community", 100);
    }

   
    public Holi(String color, String festivalName, boolean isDry) {
        this(color, festivalName, isDry, 5, "Community", 100);
    }

    
    public Holi(String color, String festivalName, boolean isDry, int duration) {
        this(color, festivalName, isDry, duration, "Community", 100);
    }

   
    public Holi(String color, String festivalName, boolean isDry, int duration, String celebrationType) {
        this(color, festivalName, isDry, duration, celebrationType, 100);
    }

    
    public Holi(String color, String festivalName, boolean isDry, int duration, String celebrationType, int numberOfParticipants) {
        this.color = color;
        this.festivalName = festivalName;
        this.isDry = isDry;
        this.duration = duration;
        this.celebrationType = celebrationType;
        this.numberOfParticipants = numberOfParticipants;
    }

    
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Festival Name: " + festivalName);
        System.out.println("Is Dry: " + (isDry ? "Yes" : "No"));
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Celebration Type: " + celebrationType);
        System.out.println("Number of Participants: " + numberOfParticipants);
        System.out.println("-----------------------------");
    }
}
