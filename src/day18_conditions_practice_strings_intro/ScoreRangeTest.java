package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 90;
        if (score >= 1 && score <= 40){
            System.out.println("Score: D");
        } else if (score>40 && score <=60) {
            System.out.println("Score: C");
        } else if (score>60 && score <=90) {
            System.out.println("Score: B");
        } else if (score>90 && score <=100) {
            System.out.println("Score: A");
        }else{
            System.out.println("invalid score");
        }
    }
}
