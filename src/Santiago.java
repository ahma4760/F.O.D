public class Santiago {

    int length = 105;
    int width = 68;
    double goalNetLength = 7.3;
    double goalNetWidth = 2.4;

    public Santiago (int length, int width, double goalNetLength, double goalNetWidth){
        this.length = length;
        this.width = width;
        this.goalNetLength = goalNetLength;
        this.goalNetWidth = goalNetWidth;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public double getGoalNetLength(){
        return goalNetLength;
    }

    public double getGoalNetWidth(){
        return goalNetWidth;
    }
}
