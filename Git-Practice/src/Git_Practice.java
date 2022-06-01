import java.util.Scanner;
public class Git_Practice {
	public static void main(String[] args) {
		System.out.print("국어, 영어, 수학, 사회, 과학 점수를 차례로 입력하시오: ");		
		Scanner scanner = new Scanner(System.in);
		
		int 국어 = scanner.nextInt();
		System.out.print("국어:"+국어+", ");
		
		int 영어 = scanner.nextInt();
		System.out.print("영어:"+영어+", ");
		
		int 수학 = scanner.nextInt();
		System.out.print("수학:"+수학+", ");
		
		int 사회 = scanner.nextInt();
		System.out.print("사회:"+사회+", ");
		
		int 과학 = scanner.nextInt();
		System.out.print("과학:"+과학+", ");
		
		int 평균 = ((국어+영어+수학+사회+과학)/5)+((국어+영어+수학+사회+과학)%5);
		System.out.println("평균은:"+평균);
		if(평균 >= 80) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		scanner.close();
	}
}
