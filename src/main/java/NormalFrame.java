

/**
 * Created by CPY on 2017/5/21.
 */
public class NormalFrame extends Frame {
    private int firstScore;
    private int secondScore;
    public NormalFrame(int firstScore, int secondScore){
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        super.number = 2;
        super.score = firstScore + secondScore;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getScore() {
        return score;
    }

    public int getFirstScore(){
        return firstScore;
    }

    public int getSecondScore(){
        return secondScore;
    }
}
