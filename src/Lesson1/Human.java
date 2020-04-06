package Lesson1;

public class Human implements Actions {
    double runDist;
    double jumpDist;

    public Human(double runDist, double jumpDist) {
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
