package matyja.projects;

public class P418ConstructorTrainer {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double slope;
    private double mx;
    private float b;


    public P418ConstructorTrainer(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public P418ConstructorTrainer(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public P418ConstructorTrainer(double mx, float b){
        this.mx = mx;
        this.b = b;
    }


}
