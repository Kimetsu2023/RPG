package utils;

import java.util.Random;

// �������쐬����֗��ȃN���X
public class Dice {
	
	// �����C���X�^���X�̐���
	private static Random r = new Random();

	// min����max�܂ł̊ԂŐ����l�̃T�C�R����U��A���̒l��߂�l�Ƃ��郁�\�b�h
	public static int get(int min, int max) {
		return r.nextInt(max - min + 1) + min;
	}
}