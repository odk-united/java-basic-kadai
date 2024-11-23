package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        
        String myChoice = scanner.nextLine();
        while (!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("p")) {
            System.out.println("r、s、pで入力してください");
            myChoice = scanner.nextLine();
        }
        return myChoice;
    }

	public String getRandom() {
        String[] opponentChoice = {"r", "s", "p"};
        double randomNumber = Math.random() * 3;
        int randomIndex = (int) Math.floor(randomNumber);
        return opponentChoice[randomIndex];
    }

    public void playGame(String myChoice, String opponentChoice) {
        HashMap<String, String> choiceMap = new HashMap<>();
        choiceMap.put("r", "グー");
        choiceMap.put("s", "チョキ");
        choiceMap.put("p", "パー");

        System.out.println("自分の手は" + choiceMap.get(myChoice) + ", 対戦相手の手は" + choiceMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
