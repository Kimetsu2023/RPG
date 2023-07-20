package demo;

import java.util.ArrayList;
import java.util.List;
import utils.Dice;
import bases.Human;
import bases.Monster;
import humans.Brave;
import humans.Fighter;
import humans.Wizard;
import monsters.Dragon;
import monsters.Oak;
import monsters.Slime;




public class Main {



	public static void main(String[] args) {



		System.out.println("���� ==== �킢�̊J�n���I�I ==== ����");

	 Human human1 = new Brave("���c���i","��");
	 Human human2 = new Fighter("�����Y","��");
	 Human human3 = new Wizard("���{����","���@");


		// Brave�i�E�ҁj, Fighter�i��m�j, Wizard�i���@�g���j�N���X�̊e�C���X�^���X�𐶐�

		// �l�ԃO���[�v�̃��X�g����Ő���
		List<Human> humans = new ArrayList<>();

		// �E�ҁA��m�A���@�g����l�ԃO���[�v�̃��X�g�ɒǉ�
         humans.add(human1);
         humans.add(human2);
         humans.add(human3);

		// Slime�i�X���C���j, Oak�i�I�[�N�j, Dragon�i�h���S���j�N���X�̊e�C���X�^���X�𐶐�
		Monster monster1 = new Slime("�L���O�X���C��","�̓�����");
		Monster monster2 = new Oak("�I�[�N�L���O","��");
		Monster monster3 = new Dragon("�g��","��");
		// �����X�^�[�O���[�v�̃��X�g����Ő���
		List<Monster> monsters = new ArrayList<>();

        // �X���C���A�I�[�N�A�h���S���������X�^�[�O���[�v�̃��X�g�ɒǉ�
         monsters.add(monster1);
         monsters.add(monster2);
         monsters.add(monster3);
		// ���݂̊e�O���[�v�̏�Ԃ��ꗗ�\��
		showGroupInfos(humans, monsters);

		// �扽��킩�������J�E���^�[�ϐ�
		int count = 1;

		// ���s�����܂Ŗ������[�v
		while (true) {


			System.out.printf("\n�� ��%d��� ==========\n", count);

			System.out.println("\n[�l�Ԃ̃^�[���I]\n");

			// �l�ԃO���[�v����1�l�I��

			Human human = choiceHuman(humans);

			// �����X�^�[�O���[�v����1�l�I��

			Monster monster = choiceMonster(monsters);


			// �I�΂ꂽ�l�Ԃ��A�I�΂ꂽ�����X�^�[���U��
			human.attack(monster);
			// �����X�^�[��HP��0�ȉ��ɂȂ�΁A�����X�^�[�͓|��A���̃����X�^�[�������X�^�[�O���[�v����폜
           if(monster.getHp() <= 0){

        	   monsters.remove(monster);

           System.out.println("�� �u" + monster.getName() + "�v�͓|�ꂽ�B");
           }
			// �����X�^�[�O���[�v�ɒN�����Ȃ��Ȃ�΁A�l�ԃO���[�v�̏���
           if(monsters.isEmpty()) {
        	   System.out.println("���� ==== �����������I�I ==== ����\r\n"+ "");

        	   System.out.println("�l�ԒB�͏�������!!");
        	   break;

           }
			System.out.println("\n[�����X�^�[�̃^�[���I]\n");

			// �l�ԃO���[�v����1�l�I��
			human = choiceHuman(humans);
			// �����X�^�[�O���[�v����1�l�I��
			monster = choiceMonster(monsters);

			// �I�΂ꂽ�����X�^�[���A�I�΂ꂽ�l�Ԃ��U��
			monster.attack(human);
			// �l�Ԃ�HP��0�ȉ��ɂȂ�΁A�l�Ԃ͓|��A���̐l�Ԃ������X�^�[�O���[�v����폜
			if(human.getHp() <= 0){
	        	   humans.remove(human);


			System.out.println("�� �u" + human.getName() + "�v�͓|�ꂽ�B");
			}
			// �l�ԃO���[�v�ɒN�����Ȃ��Ȃ�΁A�l�ԃO���[�v�̔s�k
			if(humans.isEmpty()) {
				System.out.println("���� ==== �����������I�I ==== ����\r\n"+ "");

	        	   System.out.println("�l�ԒB�͔s�k����!!");
	        	   break;
	           }
			// ���݂̊e�O���[�v�̏�Ԃ��ꗗ�\��
			showGroupInfos(humans, monsters);

			// ���[�v�ϐ���1���₷
			count++;
		}

		// �Ō�Ɋe�O���[�v�̏�Ԃ��ꗗ�\�����ăv���O�����I��
		showGroupInfos(humans, monsters);
			}






	// �����ł�������l�ԃO���[�v���X�g���烉���_����1�l��I�����A���̌��ʂ�߂�l�Ƃ��郁�\�b�h
		public static Human choiceHuman(List<Human> humans) {
			Human human = humans.get(Dice.get(0, humans.size() - 1));
			System.out.printf("�l�ԃO���[�v���� �u%s�v �̂��o�܂����I\n", human.getName());
			return human;
		}

	// �����ł�����������X�^�[�O���[�v���X�g���烉���_����1�l��I�����A���̌��ʂ�߂�l�Ƃ��郁�\�b�h
	public static Monster choiceMonster(List<Monster> monsters) {
		Monster monster = monsters.get(Dice.get(0, monsters.size() - 1));
		System.out.printf("�����X�^�[�O���[�v���� �u%s�v �̂��o�܂����I\n", monster.getName());
		return monster;
	}

	// �����ł�������l�ԃO���[�v���X�g�ƃ����X�^�[�O���[�v���X�g�̂��ꂼ��̏��ꗗ��\�����郁�\�b�h
	public static void showGroupInfos(List<Human> humans, List<Monster> monsters) {

		System.out.println("\n## === �O���[�v��� === ##");
		System.out.printf("# [�l�ԃO���[�v]: %d�l\n", humans.size());
		for (Human human : humans) {
			System.out.println(human);
		}

		System.out.printf("\n# [�����X�^�[�O���[�v]: %d�l\n", monsters.size());
		for (Monster monster : monsters) {
			System.out.println(monster);
		}
	}

}