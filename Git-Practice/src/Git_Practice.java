import java.util.Scanner;
public class Git_Practice {
	public static void main(String[] args) {
		System.out.print("����, ����, ����, ��ȸ, ���� ������ ���ʷ� �Է��Ͻÿ�: ");		
		Scanner scanner = new Scanner(System.in);
		
		int ���� = scanner.nextInt();
		System.out.print("����:"+����+", ");
		
		int ���� = scanner.nextInt();
		System.out.print("����:"+����+", ");
		
		int ���� = scanner.nextInt();
		System.out.print("����:"+����+", ");
		
		int ��ȸ = scanner.nextInt();
		System.out.print("��ȸ:"+��ȸ+", ");
		
		int ���� = scanner.nextInt();
		System.out.print("����:"+����+", ");
		
		int ��� = ((����+����+����+��ȸ+����)/5)+((����+����+����+��ȸ+����)%5);
		System.out.println("�����:"+���);
		if(��� >= 80) {
			System.out.println("�հ��Դϴ�.");
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
		scanner.close();
	}
}
