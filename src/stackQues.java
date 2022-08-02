import java.util.Stack;

public class stackQues {
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty())return;
		int top = s.pop();
		reverse(s);
		pushToBottom(s,top);

}
public static void pushToBottom(Stack<Integer> s, int num) {
   if(s.isEmpty()) {
	   s.push(num);
	   return;
   }
	int top = s.pop();
   pushToBottom(s,num);
   s.push(top);

}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		pushToBottom(s,0);
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
        
	}

}
