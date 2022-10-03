package baseball.domain;

import baseball.common.GameMessage;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {

    public List<Integer> randomNumber(){

        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < GameMessage.NUMBER_LENGTH){
            numbers.add(Randoms.pickNumberInRange(GameMessage.MIN_NUMBER, GameMessage.MAX_NUMBER));
        }

        return new ArrayList<>(numbers);
    }

}
