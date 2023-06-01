package JavaProjectVectors;

public class primeNumberArray {

	public static void main(String[] args) {
		printPrimeNumVector();
	}

	//Printing vector with one hundred first prime numbers
	public static void printPrimeNumVector () {
		double[] primeNumVector = new double[100];
		int vectorLength = 0;
		double num = 0;
		while (vectorLength<100) {
			if (isPrimeNumber(num)==true) {
				primeNumVector[vectorLength]=num;
				System.out.println("Prime number is: "+num+", and position in vector is: "+vectorLength);
				vectorLength++;
			}
			num++;
		}
	}
	//Flagging prime numbers
	public static boolean isPrimeNumber (double number) {
		boolean primeValue=false;
		int sum=0;
		for (int count=2;count<=number;count++) {
			if (number%count==0) {
				sum=sum+count;
			}
		}
		if (sum==number && number!=0) {
			primeValue=true;
		}
		return primeValue;
	}

}
