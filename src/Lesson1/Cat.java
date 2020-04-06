package Lesson1;

public class Cat implements Actions {
    double runDist;
    double jumpDist;

    public Cat(double runDist, double jumpDist) {
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
