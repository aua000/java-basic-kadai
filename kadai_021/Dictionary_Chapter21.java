package kadai_021;

import java.util.HashMap;


public class Dictionary_Chapter21 extends DictionaryExec_Chapter21{

	//変数を定義（中身はまだない）
	HashMap<String,String> dictionary;
	
	public Dictionary_Chapter21(){
		
		//定義した変数をインスタンス化する
		dictionary = new HashMap<String,String>();
		
		//辞書に英単語と意味を追加
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
	}
		//辞書を調べて結果を出力
	public void search(String[] words){
		for (String word:words){
	
			if (dictionary.containsKey(word)) {
				System.out.println( word + "の意味は" + dictionary.get(word) );
			} else {
				System.out.println( word + "は辞書に存在しません" );
			}
		    
		 }
	
	}
	

}
