import java.util.LinkedList;
import java.util.Scanner;

public class LLExercise2 {

	public static void main(String[] args) {
		LinkedList <Integer>list=new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
    for(int i=0; i<10; i++) {
	System.out.println("enter no from 1-50");
	int input= sc.nextInt();
	if(input>0 && input <=50) {
		list.add(input);
		
	}
  }
    System.out.println(list);
    for(int i=0; i<list.size(); i++) {
    	if(list.get(i)>25) {
    		list.remove(i);
    		i--;
    	}
    }
    System.out.println(list);
}
}
