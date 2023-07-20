package bases;

import utils.Dice;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		super(name,weapon);

		// Livingクラスで定義したコンストラクタを利用する
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		int num = Dice.get(1, 10)*offensive;

		target.hp = target.getHp() - num;

		System.out.println("「" + getName() + "」が" + "「" + getWeapon() + "」で攻撃！" + "「" + target.name + "」に" + num + "のダメージを与えた。");
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする

		// 相手のHPをダメージ値だけ減らす

		// コンソールにステータスを表示

	}
}
