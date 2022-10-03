package baseball.domain;

import java.util.List;

public class Ball {

    private int count;

    public Ball(){
        this.count=0;
    }

    public void check(List<Integer> inputNumber, Integer number, Integer index){
        if(inputNumber.contains(number) && !inputNumber.get(index).equals(number)){
            this.count++;
        }
    }

    public int getCount(){
        return this.count;
    }

    public int setCount(int count){
        return this.count;
    }

    public void reset(){
        this.count=0;
    }

    public boolean is(){
        return this.count > 0;
    }
}
