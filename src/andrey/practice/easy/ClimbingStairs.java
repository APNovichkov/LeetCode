package andrey.practice.easy;

class Node {
    int sum;
    Node one;
    Node two;
 
    Node(int sum) {
    		this.sum = sum;
        one = null;
        two = null;
    }
}


public class ClimbingStairs {

	
	static int totalPossibleWaysUp = 0;
	
	public static void main(String[] args) {
		int input = 6;
		
		System.out.println("I can climb stairs up to " + input + ", " + climbStairs(input) + " different ways!!");
	}

	
	public static int climbStairs(int n) {
		if(n == 0) return 0;
		
		Node root = addRecursive(new Node(0), 0, n);
		
		return totalPossibleWaysUp;
    }
	
	private static Node addRecursive(Node current, int number, int maxSum) {
		current.sum += number;
		if(current.sum < maxSum) {
			current.one = addRecursive(new Node(current.sum), 1, maxSum);
			current.two = addRecursive(new Node(current.sum), 2, maxSum);
		}else if(current.sum == maxSum) {
			totalPossibleWaysUp++;
		}
			
		return current;
	}
	

	
	
	//2
	//1 1
	//2
	
	//3
	//1 1 1
	//2 1
	//1 2
	
	//4
	//1 1 1 1
	//2 1 1
	//1 2 1
	//1 1 2
	//2 2
	
	//5
	//1 1 1 1 1 
	//2 1 1 1
	//1 2 1 1
	//1 1 2 1 
	//1 1 1 2
	//2 2 1
	//2 1 2 
	//1 2 2
	
	//6
	//1 1 1 1 1 1
	//2 1 1 1 1 
	//1 2 1 1 1
	//1 1 2 1 1
	//1 1 1 2 1
	//1 1 1 1 2
	//2 2 1 1
	//2 1 2 1
	//2 1 1 2
	//1 2 1 2
	//1 1 2 2
	//2 2 2
	
	//7
	//1 1 1 1 1 1 1
	//2 1 1 1 1 1
	//1 2 1 1 1 1
	//1 1 2 1 1 1
	//1 1 1 2 1 1
	//1 1 1 1 2 1
	//1 1 1 1 1 2
	//2 2 1 1 1
	//2 1 2 1 1
	//2 1 1 2 1
	//2 1 1 1 2
	//1 2 1 1 2
	//1 1 2 1 2
	//1 1 1 2 2
	
	
	
	
}
