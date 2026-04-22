package Udemy;

public class MainChallenge {
    public static void main(String[] args) {
        String[] nameList = {"Tim", "Bob", "Percy", "Gilbert", "James"};
        int[] scoreList = {1500, 1000, 500, 100 ,25};
        int count = 0;
        for (String name : nameList) displayName(name, scoreList[count++]);
//        displayName("Tim", 1500);
//        displayName("Bob", 1000);
//        displayName("Percy", 500);
//        displayName("Gilbert", 100);
//        displayName("James", 25);
    }

    public static void displayName(String name,int score) {
        System.out.println(name + " managed to get into position " + calculateHighScorePosition(score) + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int result = 0;
        if (score >= 1000) result = 1;
        else if (score >= 500) result = 2;
        else if (score >= 100) result = 3;
        else result = 4;
        return  result;
    }
}
