package LogicalPrograms;

public class swap_two_numbers_using_third_variable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		
		temp = a;//10
		a = b;//20
		b = temp;//10
		
		System.out.println(a);//20
		System.out.println(b);//10
	}
}
