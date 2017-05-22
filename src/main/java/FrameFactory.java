package ThoughtWorks;


/**
 * Created by CPY on 2017/5/21.
 */
public class FrameFactory {
    public static Frame createFrame(String input){
        Frame current = null;
        switch(input.length()){
            case 1:
                int score = getScore(input.charAt(0));
                if(score == -1){
                    current = new ErrorFrame();
                }
                else if (score == 10)                            //一次全中
                    current = new StrikeFrame();
                else                                        //最后一次（且仅一次）奖励
                    current = new NormalFrame(score, 0);
                break;
            case 2:
                int firstScore = getScore(input.charAt(0));
                int secondScore = getScore(input.charAt(1));
                if(firstScore==-1 || secondScore==-1){
                    current = new ErrorFrame();
                }
                else if (input.charAt(1) != '/')
                    current = new NormalFrame(firstScore, secondScore);
                else
                    current = new NormalFrame(firstScore, secondScore - firstScore);
                break;
            default:
                current = new ErrorFrame();
                break;
        }
        return current;
    }

    private static int getScore(char input) {
        if (input <= '9' && input >= '1')
            return input - '0';
        else if(input == '/')
            return 10;
        else if (input == 'X')
            return 10;
        else if (input == '-')
            return 0;
        else
            return -1;
    }
}
