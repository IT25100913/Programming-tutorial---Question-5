class Calculator{
	
	int add(int n1, int n2){
		return n1+n2;
	}
	int multiply(int n1, int n2){
		return n1*n2;
	}
	int square(int n){
		return n*n;
	}
}

public class TutorialQ5{
	
	public static void main(String[] args){
		
		Calculator myCalc = new Calculator();
		
		int expression1 = myCalc.square(myCalc.add(myCalc.multiply(3, 4),myCalc.multiply(5, 7)));
        int expression2 = myCalc.add(myCalc.square(myCalc.add(4, 7)),myCalc.square(myCalc.add(8, 3)));

        System.out.println("The answer of the first question: "+expression1);
        System.out.println("The answer of the second question: "+expression2);
	}
}