package baseball.domain;

import baseball.common.ExcMessage;
import baseball.common.GameMessage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class User {

    public List<Integer> inputNumber(String inputNumbers){
        inputValidation(inputNumbers);

        List<Integer> numbers = inputNumberList(inputNumbers);
        inputDuplicate(inputNumbers);
        return numbers;
    }

    private List<Integer> inputNumberList(String inputNumbers) {
        String[] strNumber = inputNumbers.split("");
        List<Integer> numbers = new ArrayList<>();
        for(String number : strNumber){
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }


    public boolean inputValidation(String inputNumbers){
        isEmpty(inputNumbers);
        inputLength(inputNumbers);
        inputRegex(inputNumbers);
        return true;
    }

    /** 입력값 숫자 체크*/
    private void inputRegex(String input){
        if(!Pattern.matches(ExcMessage.NUMBER_REGEX, input)){
            throw new IllegalArgumentException(ExcMessage.ERROR_EXCEPTION);
        }
    }

    /** 입력값 중복값 체크*/
    private void inputDuplicate(String input){
        String[] inputNumberArr = String.valueOf(input).split("");

        Set<Integer> numSet = new HashSet<>();
        for (String inputNumber : inputNumberArr) {
            numSet.add(Integer.valueOf(inputNumber));
        }
        if (numSet.size() != inputNumberArr.length){
            throw new IllegalArgumentException(ExcMessage.ERROR_NUMBER_DUC);
        }
    }

    /** 입력값 자리수 체크*/
    private void inputLength(String input){
        if(input.length() != GameMessage.NUMBER_LENGTH){
            throw new IllegalArgumentException(ExcMessage.ERROR_LENGTH);
        }

    }

    /** 입력값 null 체크*/
    private void isEmpty(String input){
        if(input.length() == 0){
            throw new IllegalArgumentException(ExcMessage.ERROR_EMPTY);
        }

    }

}
