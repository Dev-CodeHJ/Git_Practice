import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		String name = s.next();			//�̸� �Է¹ޱ�
		
		System.out.print("������ �Է��Ͻÿ�(0~100): ");
		int score = s.nextInt();		//���� �Է¹ޱ�
		
		System.out.print("�г��� �Է��Ͻÿ�(1~4): ");
		int year = s.nextInt();			//�г� �Է¹ޱ�
		
		char a='A',b='B', c='C', d='D', f='f';		//�Է��� ������ ��ȯ�� ���� ��������
		
		if(year != 4) 			//4�г��� �ƴ϶��
			if(score >= 90)			//90�� �̻� A���� ���ް���
				System.out.print(year+"�г� "+name+"��(��) "+a+"�����̰� "+(++year)+"�г����� ���ް������Դϴ�.");
			else if(score >= 80)		//80�̻� 90�̸� B���� ���ް���
				System.out.print(year+"�г� "+name+"��(��) "+b+"�����̰� "+(++year)+"�г����� ���ް������Դϴ�.");
			else if(score >= 70)		//70�̻� 80�̸� C���� ���ް���
				System.out.print(year+"�г� "+name+"��(��) "+c+"�����̰� "+(++year)+"�г����� ���ް������Դϴ�.");
			else if(score >= 60)		//60�̻� 70�̸� D���� ���ް���
				System.out.print(year+"�г� "+name+"��(��) "+d+"�����̰� "+(++year)+"�г����� ���ް������Դϴ�.");
			else						//60�̸� F���� ����
				System.out.print(year+"�г� "+name+"��(��) "+f+"�������ν� �����Դϴ�.");
								//4�г��̶��
		else if(score >= 90)		//90�� �̻� A���� ��������
			System.out.print(year+"�г� "+name+"��(��) "+a+"�������� �����������Դϴ�.");
		else if(score >= 80)		//80�̻� 90�̸� B���� ��������
			System.out.print(year+"�г� "+name+"��(��) "+b+"�������� �����������Դϴ�.");
		else if(score >= 70)		//70�̻� 80�̸� C���� ��������
			System.out.print(year+"�г� "+name+"��(��) "+c+"�������� �����������Դϴ�.");
		else						//70�̸� ��������
			System.out.print(year+"�г� "+name+"��(��) ���� �����Դϴ�.");
		
		s.close();
	}
}
