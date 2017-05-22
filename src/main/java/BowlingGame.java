
/**
 * Created by CPY on 2017/5/21.
 */
public class BowlingGame {
    public int getBowlingScore(String bowlingCode) {
        if (bowlingCode == null)
            return -1;

        String[] inputStr = bowlingCode.split("\\|");
        if(inputStr.length > 12 || inputStr.length < 10){
            return -1;
        }

        BowlingGameTemplate game = new DefaultBowlingGame(bowlingCode);
        return game.getScore();
    }
}
