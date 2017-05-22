package ThoughtWorks;

/**
 * Created by CPY on 2017/5/21.
 */
public abstract class BowlingGameTemplate {
    protected abstract void inputAnalyse();
    protected abstract void calculate();
    protected abstract int getResult();

    public int getScore() {
        inputAnalyse();
        calculate();
        return getResult();
    }
}
