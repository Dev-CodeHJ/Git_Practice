import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String name = s.next();			//이름 입력받기
		
		System.out.print("점수를 입력하시오(0~100): ");
		int score = s.nextInt();		//점수 입력받기
		
		System.out.print("학년을 입력하시오(1~4): ");
		int year = s.nextInt();			//학년 입력받기
		
		char a='A',b='B', c='C', d='D', f='f';		//입력한 점수를 변환할 학점 변수선언
		
		if(year != 4) 			//4학년이 아니라면
			if(score >= 90)			//90점 이상 A학점 진급가능
				System.out.print(year+"학년 "+name+"은(는) "+a+"학점이고 "+(++year)+"학년으로 진급가능자입니다.");
			else if(score >= 80)		//80이상 90미만 B학점 진급가능
				System.out.print(year+"학년 "+name+"은(는) "+b+"학점이고 "+(++year)+"학년으로 진급가능자입니다.");
			else if(score >= 70)		//70이상 80미만 C학점 진급가능
				System.out.print(year+"학년 "+name+"은(는) "+c+"학점이고 "+(++year)+"학년으로 진급가능자입니다.");
			else if(score >= 60)		//60이상 70미만 D학점 진급가능
				System.out.print(year+"학년 "+name+"은(는) "+d+"학점이고 "+(++year)+"학년으로 진급가능자입니다.");
			else						//60미만 F학점 유급
				System.out.print(year+"학년 "+name+"은(는) "+f+"학점으로써 유급입니다.");
								//4학년이라면
		else if(score >= 90)		//90점 이상 A학점 졸업가능
			System.out.print(year+"학년 "+name+"은(는) "+a+"학점으로 졸업가능자입니다.");
		else if(score >= 80)		//80이상 90미만 B학점 졸업가능
			System.out.print(year+"학년 "+name+"은(는) "+b+"학점으로 졸업가능자입니다.");
		else if(score >= 70)		//70이상 80미만 C학점 졸업가능
			System.out.print(year+"학년 "+name+"은(는) "+c+"학점으로 졸업가능자입니다.");
		else						//70미만 졸업유예
			System.out.print(year+"학년 "+name+"은(는) 졸업 유예입니다.");
		
		s.close();
	}
}
