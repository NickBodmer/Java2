package Lesson1;

public class Way implements Action {
    private int length;

    public Way(int length){
        this.length = length;
    }

    @Override
    public void run(Actor actor) throws Exception {
        actor.doRun(length);
    }
}

