import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {

    @Test
    public void test_all_strike() throws Exception {
        String bowlingCode = "X|X|X|X|X|X|X|X|X|X||XX";           //300
        Assert.assertEquals(new BowlingGame().getBowlingScore(bowlingCode), 300);
    }

    @Test
    public void test_second_spare() throws Exception {
        String bowlingCode = "5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5";  //150
        Assert.assertEquals(new BowlingGame().getBowlingScore(bowlingCode), 150);
    }

    @Test
    public void test_second_miss() throws Exception {
        String bowlingCode = "9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||";   //90
        assertEquals(new BowlingGame().getBowlingScore(bowlingCode), 90);

    }

    @Test
    public void test_other_situation() throws Exception {
        String bowlingCode = "X|7/|9-|X|-8|8/|-6|X|X|X||81";      //167
        assertEquals(new BowlingGame().getBowlingScore(bowlingCode), 167);

    }
    
    @Test
    public void test5(){
        String bowlingCode = "--|--|--|--|--|--|--|--|--|--||";      //0
        assertEquals(0, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test6(){
        String bowlingCode = "X|X|9/|8-|X|-/|X|X|9/|8-||";      //0
        assertEquals(190, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test7(){
        String bowlingCode = "6/|8/|9/|X|X|-7|--|8-|9/|X||XX";      //0
        assertEquals(159,new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test8(){
        String bowlingCode = "X|9/|8/|7/|6/|5/|4/|3/|2/|1/||-";      //0
        assertEquals(146, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test9(){
        String bowlingCode = "X|9/|8/|7/|6/|5/|4/|3/|2/|1/||X";      //146
        assertEquals(156, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test10(){
        String bowlingCode = "9-|9-|8/|-7|61|52|41|32|27|18||";      //77
        assertEquals(77, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test11(){
        String bowlingCode = "--|9-|1-|-7|27|36|54|62|53|X||11";      //72
        assertEquals(72, new BowlingGame().getBowlingScore(bowlingCode));
    }

    

    @Test
    public void test13(){
        String bowlingCode = null;      //error score
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test14(){
        String bowlingCode = "--|9-|1-|-7|27|36|54|62|53|";      //error length
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test15(){
        String bowlingCode = "";                                            //error length
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test16(){
        String bowlingCode = "8/3|8/|8/|8/|8/|8/|8/|8/|8/|8/||8";      //error length
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test17(){
        String bowlingCode = "8/|8/|8/|8/|81/|8/|8/|8/|8/|8/||8";      //error length
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test18(){
        String bowlingCode = "8/|8/|8/|8/|81/||8/|8/|8/|8/||8";      //error length
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test19(){
        String bowlingCode = "8/|8a|8/|8/|8/|8/|8/|8/|8/|8/||8";      //error score
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test20(){
        String bowlingCode = "8/|8/-|8/|8/|8/|8/|8/|8/|8/|8/||8";      //error length
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test21(){
        String bowlingCode = "a|8/|8/|8/|8/|bc|8/|8/|8/|8/||8";      //error ecore
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }

    @Test
    public void test22(){
        String bowlingCode = "7-||7-|7-||7-|7-|7-|7-|7-||";      //error score
        assertEquals(-1, new BowlingGame().getBowlingScore(bowlingCode));
    }
}

