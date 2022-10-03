package baseball.controller;

import baseball.common.ExcMessage;
import baseball.common.GameMessage;
import baseball.domain.Computer;
import baseball.domain.Score;
import baseball.domain.User;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class BaseGameController {
    private Computer computer;

    private User user;

    private Score score;

    private boolean sttus;

    public BaseGameController(){
        this.computer = new Computer();
        this.user = new User();
    }

    public void play(){
        this.score = new Score();
        this.sttus = true;
        List<Integer> randomNumbers = computer.randomNumber();
        while (sttus){
            System.out.print(ExcMessage.INPUT);
            List<Integer> inputNumbers = user.inputNumber(Console.readLine());
            score.result(randomNumbers,inputNumbers);
            if(score.strikeCount() == 3){break;}
        }
        restart();
    }

    public void restart() {
        System.out.println(ExcMessage.ASK);
        String number = Console.readLine();
        if (number.equals(GameMessage.CONTINUE)) {
            play();
        }

        if(number.equals(GameMessage.END)){
            System.out.println(GameMessage.GAME_END);
        }
    }
}
