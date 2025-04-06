package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
	    
		//各子クラスのインスタンス作成
		KatoTaro_Chapter18 KatoTaro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 KatoIchiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 KatoHanako = new KatoHanako_Chapter18();

		//setGivenNameのメソッドを実行
		KatoTaro.setGivenName();
		KatoIchiro.setGivenName();
		KatoHanako.setGivenName();

		//execIntroduceメソッドを実行
		KatoTaro.execIntroduce();
		KatoIchiro.execIntroduce();
		KatoHanako.execIntroduce();
	
	}

}
 