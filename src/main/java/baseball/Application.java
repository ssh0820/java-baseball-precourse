package baseball;

import baseball.controller.BaseGameController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        BaseGameController baseGameController = new BaseGameController();
        baseGameController.play();
    }
}