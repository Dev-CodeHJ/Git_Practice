import java.util.Scanner;
public class Git_Practice {
	public static void main(String[] args) {
		System.out.print("국어, 영어, 수학, 사회, 과학 점수를 차례로 입력하시오: ");		
		Scanner s = new Scanner(System.in);
		
		int 국어 = s.nextInt();			// 국어과목의 점수를 입력받음
		System.out.print("국어:"+국어+", ");
		
		int 영어 = s.nextInt();			// 영어과목의 점수를 입력받음
		System.out.print("영어:"+영어+", ");
		
		int 수학 = s.nextInt();			// 수학과목의 점수를 입력받음
		System.out.print("수학:"+수학+", ");
		
		int 사회 = s.nextInt();			// 사회과목의 점수를 입력받음
		System.out.print("사회:"+사회+", ");
		
		int 과학 = s.nextInt();			// 과학과목의 점수를 입력받음
		System.out.print("과학:"+과학+", ");
		
		double 평균 = ((국어+영어+수학+사회+과학)/5.0); // 입력받은 5과목의 총 평균을 소수점 첫째자리까지 구하는 변수
		System.out.println("평균은:"+평균);
		if(평균 >= 80) {                   // 구한 평균이 합격인지 불합격인지 판별
			System.out.println("합격입니다.");    
		}
		else {
			System.out.println("불합격입니다.");
		}
		s.close();
	}
}
