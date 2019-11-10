import java.util.*;
public class SuperMart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n1,n2,n3,money,i1,i2,i3,s1,s2,s3;
int amount=0;
int c=1;
char m;
System.out.println("Enter the price of item 1:");
i1=sc.nextInt();
System.out.println("Enter the stock value of item 1:");
s1=sc.nextInt();
System.out.println("Enter the price of item 2:");
i2=sc.nextInt();
System.out.println("Enter the stock value of item 2:");
s2=sc.nextInt();
System.out.println("Enter the price of item 3:");
i3=sc.nextInt();
System.out.println("Enter the stock value of item 3:");
s3=sc.nextInt();
while (true){
	System.out.println("Customer"+c);
	System.out.println("Enter the quantity of item 1: ");
	n1=sc.nextInt();
	if(n1>s1)
		System.out.println("Sorry,it's out of stock");
	else{
		s1=s1-n1;
		amount=n1*i1;
	}
		System.out.println("Enter the quantity of item 2: ");
		n2=sc.nextInt();
		if(n2>s2)
			System.out.println("Sorry,it's out of stock");
		else{
			s2=s2-n2;
			amount=n2*i2;
	}
		System.out.println("Enter the quantity of item 3: ");
		n3=sc.nextInt();
		if(n3>s3)
			System.out.println("Sorry,it's out of stock");
		else{
			s3=s3-n3;
			amount=n3*i3;
			}
		System.out.println("The amount is "+amount);
		System.out.println("The money gave: ");
		money=sc.nextInt();
		if(money>=amount)
			System.out.println("The balance is "+(money-amount));
		else
			System.out.println("Sorry,cannot buy the good");
		c++;
		amount=0;
		System.out.println("Is there another customer");
		m=sc.next().charAt(0);
		if(m=='n')
			break;
}


	}}


