package ThoughtWorks;

/**
 * Created by CPY on 2017/5/22.
 */
public class ErrorFrame extends Frame{

    public ErrorFrame(){
        super.number = 0;
        super.score = -1;
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
