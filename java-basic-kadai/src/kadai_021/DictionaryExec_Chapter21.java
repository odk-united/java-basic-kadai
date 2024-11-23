package kadai_021;

public class DictionaryExec_Chapter21 { 

	public static void main(String[] args) {
        // 辞書オブジェクトを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べたい単語を配列で準備
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        // 辞書クラスで単語リストを検索
        dictionary.searchWords(wordsToSearch);
    }

}
