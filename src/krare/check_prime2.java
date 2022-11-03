package krare;

public class check_prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=567;
int temp=0;
for(int i=2;i<=a-1;i++) {
	if(a%i==0) {
		temp=temp+1;
	}
}
if(temp==0) {
		System.out.println("it is prime no");
	}else {
		System.out.println("it is not prime no");
	}

	}

}
