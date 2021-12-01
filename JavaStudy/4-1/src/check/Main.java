package check;

//Constantsクラスをimport
import constants.Constants;

public class Main {
	// フィールド変数(static付与により自クラスから直接アクセス)
	private static String firstName = "及川";
	private static String lastName = "大輔";
	
	//自クラスのメソッドを使うためのmainメソッド
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		printName(firstName,lastName); //自クラスのフィールド変数・メソッドへアクセス
		
		//インスタンス化(①クラス名②インスタンス名（変数名）③= new④コンストラクタ名)
		// importしたクラスフィールドを使用
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE); 
		RobotPet rpt = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		pt.introduce();
		rpt.introduce();
	}
	
	//(static付与により自クラスから直接アクセス)
	private static void printName(String fName,String lName){
	
		System.out.println("printNameメソッド→" + fName + lName);
	}
}

