
/**
 * Created by CPY on 2017/5/21.
 */
public class DefaultRule extends Strategy{
    Frame[] frame = null;

    public DefaultRule(Frame[] frame){
        this.frame = frame;
    }
    @Override
    public int getResult() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += frame[i].getScore();

            if(frame[i].getScore() == -1){
                sum = -1;
                break;
            }

            if (frame[i].getNumber() == 1) {    //全中
                    sum += frame[i + 1].getScore();
                    if (frame[i + 1].getNumber() == 1) {    //判断下一个frame是否为全中
                        if (frame[i + 2].getNumber() == 2) {
                            NormalFrame current = (NormalFrame)frame[i + 2];
                            sum += current.getFirstScore();
                        } else
                            sum += frame[i + 2].getScore();
                    }
            } else if (frame[i].getScore() == 10) { //补中的情况
                if (frame[i + 1].getNumber() == 1) {
                    sum += frame[i].getScore();
                }else if(frame[i + 1].getNumber() == 2){
                    NormalFrame current = (NormalFrame)frame[i + 1];
                    sum += current.getFirstScore();
                }
            }
        }
        return sum;
    }
}
