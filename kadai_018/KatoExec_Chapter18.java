package kadai_018;

public class KatoExec_Chapter18 extends KatoHanako_Chapter18 {
	public static void main(String[] args) {
	    
		//各子クラスのインスタンス作成
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

		//setGivenNameのメソッドを実行
		taro.setGivenName("太郎");
		ichiro.setGivenName("一郎");
		hanako.setGivenName("花子");

		//execIntroduceメソッドを実行
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
	
	}

}
