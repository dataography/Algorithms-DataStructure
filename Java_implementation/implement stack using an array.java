public class ImplementStackWithArray {

	int[] ar;
	int top;

	public ImplementStackWithArray(int n) {
		ar = new int[n];
		top = -1;

	}

	public void myPush(int number) {

		ar[++top] = number;
	}

	public int myPop() {
		return ar[top--];
	}

	public int myPeek() {
		return ar[top];
	}

	public void myRemove() {
		--top;
	}

	public boolean myIsEmpty() {
		return (top == -1);
	}

	public static void main(String[] args) {

		ImplementStackWithArray myStack = new ImplementStackWithArray(10);

		myStack.myPush(1);
		myStack.myPush(2);
		myStack.myPush(3);
		myStack.myPush(4);
		myStack.myPush(5);
		myStack.myPush(6);
		myStack.myPeek();
		myStack.myRemove();

		while (!myStack.myIsEmpty()) {
			System.out.print(myStack.myPop());
			
		}

	}

}
