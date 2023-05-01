package Lesson7.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = (List.of(Action.KAMEN, Action.KAMEN, Action.BUMAGA));
        List<Action> friend2Action = (List.of(Action.BUMAGA, Action.NOJNICI, Action.NOJNICI));
        BestFriend bestFriend1 = new BestFriend("ivan", friend1Action, exchanger);
        BestFriend bestFriend2 = new BestFriend("petr", friend2Action, exchanger);
    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}


class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsActions) {
        if ((myAction == Action.KAMEN && friendsActions == Action.NOJNICI)
                || (myAction == Action.NOJNICI && friendsActions == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendsActions == Action.KAMEN)) {
            System.out.println(name + " победил");
        }
    }

    public void run() {
        Action reply;
        for (Action action: myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}