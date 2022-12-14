public class Ref {

    String mood;
    String shirtColor = "Yellow";
    String refOnPitch;
    String lineRef;

    public Ref(String mood, String shirtColor, String refOnPitch, String lineRef){
        this.mood = mood;
        this.shirtColor = shirtColor;
        this.refOnPitch = refOnPitch;
        this.lineRef = lineRef;
    }

    public String getMood(){
        return mood;
    }

    public String getShirtColor(){
        return shirtColor;
    }

    public String getRefOnPitch() {
        return refOnPitch;
    }

    public String getLineRef() {
        return lineRef;
    }
}
