package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	Scanner scan = new Scanner(System.in);
	
	//自分のじゃんけんの手を入力
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		while (true) {
			String choice = scan.next();
			
			if(!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
				System.out.println("正しい手を入力してください");
				continue;
			} else{
				return choice;
			}
		
		}
		
	}
	//pcが出す手を選択
	public String getRandom() {
		String[] pcChoice = {"r", "s", "p" };
		int random = (int)(Math.floor(Math.random()*3));
        return pcChoice[random];
	}

	//勝ち負けを判定して出力
	public void playGame() {
		HashMap<String, String> jyankenMap = new HashMap<>();
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		String myChoice = getMyChoice();
		String pcChoice = getRandom();
		
		System.out.println("自分の手は" + jyankenMap.get(myChoice) + ", 対戦相手の手は" + jyankenMap.get(pcChoice));
		
		if (myChoice.equals(pcChoice)) {
			System.out.println("あいこです。");
		} else if ((myChoice.equals("r") && pcChoice.equals("s")) ||
		           (myChoice.equals("s") && pcChoice.equals("p")) ||
		           (myChoice.equals("p") && pcChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
			
		}
		
	scan.close();
	}
}
