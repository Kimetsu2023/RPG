package bases;

// ������\�����钊�ۃN���X
public abstract class Living {

	// �t�B�[���h
	protected String name; // �L�����N�^�[�̖��O
	protected String weapon; // ���햼
	protected int hp; // �q�b�g�|�C���g�i�����́j
	protected int offensive; // �U����

	// �R���X�g���N�^
	public Living(String name, String weapon) {
		this.name = name;
		this.weapon = weapon;
	}

	// �Q�b�^�[�A�Z�b�^�[
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getOffensive() {
		return offensive;
	}

	public void setOffensive(int offensive) {
		this.offensive = offensive;
	}

    // �^�[�Q�b�g�ɍU�����郁�\�b�h
	public abstract void attack(Living target); 

	// �������g��\�����镶����̃I�[�o�[���C�h
	@Override
	public String toString() {
		String alert = "";
		if (this.hp <= 50) {
			alert = "�� HP�c��킸���I�A�u�i�C";
		}
		return String.format("[���O]: %s, [�q�b�g�|�C���g]: %d, [�U����]: %d %s", this.name, this.hp, this.offensive, alert);
	}

}