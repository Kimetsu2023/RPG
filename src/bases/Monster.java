package bases;

import utils.Dice;

// �����X�^�[��\�����钊�ۃN���X
public abstract class Monster extends Living {

	// �R���X�g���N�^
	public Monster(String name, String weapon) {
		super(name,weapon);

		// Living�N���X�Œ�`�����R���X�g���N�^�𗘗p����
	}

	// attack���\�b�h�̃I�[�o�[���C�h
	@Override
	public void attack(Living target) {
		int num = Dice.get(1, 10)*offensive;

		target.hp = target.getHp() - num;

		System.out.println("�u" + getName() + "�v��" + "�u" + getWeapon() + "�v�ōU���I" + "�u" + target.name + "�v��" + num + "�̃_���[�W��^�����B");
		// 1����10�܂ł̃T�C�R����U��A�����̍U���͂Ƃ������킹���l�𑊎�ɗ^����_���[�W�Ƃ���

		// �����HP���_���[�W�l�������炷

		// �R���\�[���ɃX�e�[�^�X��\��

	}
}
