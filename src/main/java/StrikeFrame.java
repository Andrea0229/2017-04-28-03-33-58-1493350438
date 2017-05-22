

/**
 * Created by CPY on 2017/5/21.
 */
public class StrikeFrame extends Frame {
    public StrikeFrame(){
        super.number = 1;
        super.score = 10;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getScore() {
        return score;
    }
}
