package inflearn.q40;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		Scanner sc = new Scanner(System.in);
		String arithmetic = sc.next();
		System.out.println(main.count(arithmetic));
	}

	//NOTE. 이건 왜 틀리는겨? 미스테리네... 지금은 모르겠다...
	private Integer count(String arithmetic) {
		//근데 연산인지 어떻게 구별하지?
		Integer count = null;
		Stack<Integer> integers = new Stack<>();

		char[] charArray = arithmetic.toCharArray();
		for (Character c : charArray) {
			if (Character.isDigit(c)) {
				integers.push(c-48); // 숫자 제대로 둘어가는지 확인
			} else {
				if (count == null) {
					count = integers.pop();
				}
				switch (c) {
					case '+':
						count = count + integers.pop();
						break;
					case '-':
						count = count - integers.pop();
						break;
					case '*':
						count = count * integers.pop();
						break;
					case '/':
						count = count / integers.pop();
						break;
				}
			}
		}
		if(count == null) return 0;
		return count;
	}

	public int solution(String str){
		int answer=0;
		Stack<Integer> stack = new Stack<>();
		for(char x : str.toCharArray()){
			if(Character.isDigit(x)){
				stack.push(x-48);
			}
			else{
				int rt=stack.pop();
				int lt=stack.pop();
				if(x=='+')
					stack.push(lt+rt);
				else if(x=='-')
					stack.push(lt-rt);
				else if(x=='*')
					stack.push(lt*rt);
				else if(x=='/')
					stack.push(lt/rt);
			}
		}
		answer=stack.get(0);
		return answer;
	}
}
