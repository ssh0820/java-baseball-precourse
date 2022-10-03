package baseball.domain;

public class Strike {

    private int count;

    public Strike(){
        this.count=0;
    }

    public void check(boolean isMatch){
        if(isMatch){
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
        this.count = 0;
    }

    public boolean is(){
        return this.count > 0;
    }
}
