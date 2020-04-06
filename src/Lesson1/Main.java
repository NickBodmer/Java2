package Lesson1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Actions> actions = new ArrayList();
        actions.add(new Human(5, 10));
        actions.add(new Cat(2, 8));
        actions.add(new Robot(45, 56));

        for ( Actions s:actions) {
            System.out.println(s.jump() + " "+ s.run() + s.toString());

        }

        List< Action > runway = new LinkedList<>();

        runway.add(new Way(10));
        runway.add(new Wall(5));
        runway.add(new Way(5));
        runway.add(new Way(2));
        runway.add(new Wall(3));
        runway.add(new Wall(20));

        Actor actor = new Man(10, 10);

        try {

            for (Action action : runway) {
                action.run(actor);
            }
            System.out.println("Закончили");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }


}