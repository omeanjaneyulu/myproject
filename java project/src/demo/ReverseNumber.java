package demo;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 987654, revers=0;
while (number!=0) {
	int remainder = number%10;
	revers = revers * 10+remainder;
	number=number/10; }
System.out.println("the reverse of the given number is:"+revers);
}
	}


