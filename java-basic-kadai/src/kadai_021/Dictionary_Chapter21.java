package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> fluitMap;
	
	public Dictionary_Chapter21() { 
		fluitMap = new HashMap<>();
	
	    fluitMap.put("apple", "りんご");
	    fluitMap.put("peach", "桃");
	    fluitMap.put("banana", "バナナ");
	    fluitMap.put("lemon", "レモン");
	    fluitMap.put("pear", "梨");
	    fluitMap.put("kiwi", "キウィ");
	    fluitMap.put("strawberry", "いちご");
	    fluitMap.put("grape", "ぶどう");
	    fluitMap.put("muscat", "マスカット");
	    fluitMap.put("cherry", "さくらんぼ");
	}
	
	public void searchWords(String[] words) {
        for (String word : words) { // 繰り返し処理で単語を調べる
            String meaning = fluitMap.get(word); // 辞書から意味を取得
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
		
}
