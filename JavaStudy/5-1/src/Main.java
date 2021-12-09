import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		{
//	      問① 下記の配列はInteger型しか格納できないように修正してください。
//			   現状は全てのクラスの継承元であるObject型を指定しているので、Stringもintも格納可能になっています。
			//List<Object> array = new ArrayList<>();
//		    <以下記述>
			List<Integer> array = new ArrayList<>();
//	      問② 前から二つ目の要素を"bar"にしましょう。
//		　<以下記述>
			List<Object> array2 = new ArrayList<>();
			array2.add("abc");
			array2.add("bar");
			array2.add("foo");
//	      問③ fooが格納されているインデックスを出力してください。
//		　<以下記述>
			for (int i = 0; i < array2.size(); i++) {
	            if(array2.get(i) == "foo") {
	            	System.out.println("fooのインデックス: " + i);
	            }
	        }
		}

		{
//	      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
			Map<String, Object> map = new HashMap<>();
//		
			map.put("address", "/////");
			map.put("name", "Kosuke");
			map.put("age", "29");
//	      問⑤上記で格納したキーを繰り返し文で出力しましょう。
			for (String key : map.keySet()) {// keySetを使用してキー値を取得
				System.out.println("key: " + key);
			}
//	      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
			// entrySetを使用してMapに含まれる要素の「キー／値」のセットを取得
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("value: " + entry.getValue());
			}
		}

		{
//	      問⑦ 配列arrayDateに今の年・月・日を入れてください。
			Calendar cal = Calendar.getInstance();

			Integer[] arrayDate = { cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DATE) };
//	      問⑧ 配列arrayDateをList型に変更しましょう。
			List<Integer> list = Arrays.asList(arrayDate);
//	      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
			for (Integer s1 : list) {
				System.out.println(s1);
			}
		}
	}

}
