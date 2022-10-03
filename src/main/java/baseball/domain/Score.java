package baseball.domain;

import baseball.common.GameMessage;

import java.util.List;

public class Score {

    private final Strike strike;
    private final Ball ball;

    public Score(){
        this.strike = new Strike();
        this.ball = new Ball();
    }

    public void result(List<Integer> randomNumbers, List<Integer> userNumbers){
        reset();
        for(int i = 0; i < GameMessage.NUMBER_LENGTH; i++){
            int randomNumber = randomNumbers.get(i);
            int userNumber = userNumbers.get(i);
            this.strike.check(randomNumber == userNumber);
            this.ball.check(randomNumbers,userNumber,i);
        }
        System.out.println(resultMessage());
    }
        private void reset(){
            this.strike.reset();
            this.ball.reset();
    }

    public int strikeCount(){
        return this.strike.getCount();
    }

    private int ballCount(){
        return this.ball.getCount();
    }

    private boolean is3strike(){
        return this.strike.getCount() == 3 && this.ball.getCount() == 0;
    }
    private boolean isStrike(){
        return this.strike.is() && !this.ball.is();
    }

    private boolean isBall(){
        return !this.strike.is() && this.ball.is();
    }

    private boolean isBallStrike(){
        return this.strike.is() && this.ball.is();
    }

    public String resultMessage(){

        if(is3strike()){
            return (GameMessage.TREE_STRIKE);
        }

        if(isBallStrike()){
            return (this.ball.getCount()+ GameMessage.BALL+" "+this.strike.getCount()+ GameMessage.STRIKE);
        }

        if(isStrike()){
            return (this.strike.getCount()+ GameMessage.STRIKE);
        }

        if(isBall()){
            return (this.ball.getCount()+ GameMessage.BALL);
        }

        return GameMessage.NOTHING;
    }



}
