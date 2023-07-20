package bases;

import utils.Dice;

// 人間を表現する抽象クラス
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		super(name,weapon);
		// Livingクラスで定義したコンストラクタを利用する
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target){
		int num = Dice.get(1, 10)*offensive;

		target.hp = target.getHp() - num;
       
		offensive = getOffensive() -1;

		System.out.println("「" + getName() + "」が" + "「" + getWeapon() + "」で攻撃！" + "「" + target.name + "」に" +num + "のダメージを与えた。しかし自分の攻撃力も1減少した。");

		}


}
	// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする

		// 相手のHPをダメージ値だけ減らす

		// 自分の攻撃力を1だけ減らす

		// コンソールにステータスを表示


