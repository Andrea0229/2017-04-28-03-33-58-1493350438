

import java.util.Arrays;

/**
 * Created by CPY on 2017/5/21.
 */
public class DefaultBowlingGame extends BowlingGameTemplate {
    String bowlingCode = null;
    Frame[] frames = null;
    int result = 0;

    public DefaultBowlingGame(String bowlingCode) {
        this.bowlingCode = bowlingCode;
    }

    @Override
    public void inputAnalyse(){
        String[] inputStr = bowlingCode.split("\\|");

        if (inputStr.length != 10) {
            inputStr[10] = inputStr[11];
            inputStr = Arrays.copyOfRange(inputStr, 0, 11);
        }
        frames = new Frame[inputStr.length];
        for (int i = 0; i < inputStr.length; i++) { //将字符串中所有的frame化为一个个对象
            frames[i] = FrameFactory.createFrame(inputStr[i]);
        }
    }

    @Override
    public void calculate() {
        Strategy currentRule = new DefaultRule(frames);
        result = currentRule.getResult();
    }

    @Override
    public int getResult() {
        return result;
    }
}
