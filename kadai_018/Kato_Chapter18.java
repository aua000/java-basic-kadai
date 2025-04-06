package kadai_018;

abstract public class Kato_Chapter18 {

	//フィールド
	String familyName = "加藤";
	String givenName;
	String address = "東京都中の区○×";

	//メソッド
	public void commonIntroduce() {
		
		//共通の紹介を出力
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");

	}

	//個別の紹介を出力(抽象メソッド)
	abstract public void eachIntroduce(); 

	//紹介を実行
	public void execIntroduce() {

		commonIntroduce();
		eachIntroduce();

	}
}