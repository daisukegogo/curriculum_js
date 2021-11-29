package check;

public class Pet {
	private String name;
	private String masterName;

	public Pet(String name, String masterName) {//セッター(コンストラクタ)
		this.name = name;
		this.masterName = masterName;
	}

	protected String getName() {// ゲッター
		return name;
	}

	protected String getMasterName() {// ゲッター
		return masterName;
	}

	public void introduce() {
		System.out.println("■僕の名前は" + name + "です");
		System.out.println("■ご主人様は" + masterName + "です");
	}
}

class RobotPet extends Pet {// Petを継承
	//コンストラクタ
	public RobotPet(String name, String masterName) {
		super(name, masterName);//継承元のセッターへ
	}

	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}
}
