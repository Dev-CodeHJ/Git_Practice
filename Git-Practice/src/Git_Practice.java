import java.util.Scanner;
public class Git_Practice {
	public static void main(String[] args) {
		System.out.print("����, ����, ����, ��ȸ, ���� ������ ���ʷ� �Է��Ͻÿ�: ");		
		Scanner s = new Scanner(System.in);
		
		int ���� = s.nextInt();			// ��������� ������ �Է¹���
		System.out.print("����:"+����+", ");
		
		int ���� = s.nextInt();			// ��������� ������ �Է¹���
		System.out.print("����:"+����+", ");
		
		int ���� = s.nextInt();			// ���а����� ������ �Է¹���
		System.out.print("����:"+����+", ");
		
		int ��ȸ = s.nextInt();			// ��ȸ������ ������ �Է¹���
		System.out.print("��ȸ:"+��ȸ+", ");
		
		int ���� = s.nextInt();			// ���а����� ������ �Է¹���
		System.out.print("����:"+����+", ");
		
		double ��� = ((����+����+����+��ȸ+����)/5.0); // �Է¹��� 5������ �� ����� �Ҽ��� ù°�ڸ����� ���ϴ� ����
		System.out.println("�����:"+���);
		if(��� >= 80) {                   // ���� ����� �հ����� ���հ����� �Ǻ�
			System.out.println("�հ��Դϴ�.");    
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
		s.close();
	}
}
