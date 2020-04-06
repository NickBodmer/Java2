package Lesson1;

public class Robot implements Actions {
    double runDist;
    double jumpDist;

    public Robot(double runDist, double jumpDist) {
        this.runDist = runDist;
        this.jumpDist = jumpDist;
    }

    @Override
    public double run() {
        return runDist;
    }

    @Override
    public double jump() {
        return jumpDist;
    }
}
