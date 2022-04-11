/*
	Created By: Ahmad Raza
	Date: 11-04-2022
*/

public class StackDemo
{
	
	public static void main(String [] args) throws StackFullException, StackEmptyException
	{
		Stack s1 = new Stack();
		System.out.println(s1.isFull());
		s1.push(10);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}
	
}