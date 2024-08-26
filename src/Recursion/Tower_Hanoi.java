// Java recursive program to solve tower of hanoi puzzle

class Tower_Hanoi
{
	// Java recursive function to solve tower of hanoi puzzle
	static void towerOfHanoi(int n, String src, String helper, String dest)
	{
		if (n == 1)
		{
			System.out.println("Move disk " + n + " from "+ src + " to " + dest);
			return;
		}
		towerOfHanoi(n-1, src, dest, helper);
		System.out.println("Move disk " + n + " from " + src + " to " + dest);
		towerOfHanoi(n-1, helper, src, dest);
	}
	
	// Driver method
	public static void main(String args[])
	{
		int n = 3; // Number of disks
		towerOfHanoi(n, "S","H","D"); // A, B and C are names of disks
	}
}
