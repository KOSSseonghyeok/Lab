public class References1
{
	public static void main(String[] args)
	{
		//Person person1 = new Person("Rachel", 6);
		//Person person2 = new Person("Elly", 4);
		//Person person3 = new Person("Sarah", 19);
		//System.out.println("\nThe three original people...");
		//System.out.println(person1 + ", " + person2 + ", " + person3);
		//// Reassign people
		//person1 = person2;	// person1은 person2의 레퍼런스
		//person2 = person3;	//person2은 person3의 레퍼런스
		//person3 = person1; //person2은 person2의 레퍼런스 따라서 person1 = person2, person2 = person3, person3 = person2
		//System.out.println("\nThe three people reassigned...");
		//System.out.println(person1 + ", " + person2 + ", " + person3);
		//System.out.println();
		//System.out.println("Changing the second name to Bozo...");
		//person2.changeName("Bozo"); // person2의 이름만 바뀜
		//System.out.println(person1 + ", " + person2 + ", " + person3);
		//System.out.println();
		//System.out.println("Changing the third name to Clarabelle...");
		//person3.changeName("Clarabelle");//person1, person3의 값이 바뀜
		//System.out.println(person1 + ", " + person2 + ", " + person3);
		//System.out.println();
		//System.out.println("Changing the first name to Harpo...");
		//person1.changeName("Harpo"); //person1, person3의 값이 바뀜
		//System.out.println(person1 + ", " + person2 + ", " + person3);

		Person person1 = new Person("Rachel", 6);
		Person person2 = new Person("Elly", 4);
		Person person3 = new Person("Sarah", 19);
		Person a = person3;
		System.out.println("\nThe three original people...");
		System.out.println(person1 + ", " + person2 + ", " + person3);
		// Reassign people
		//person2 변수가 현재의 person1 객체를, person3 변수가 현재의 person2 객체를, person1 변수가 현재의
		//person3 객체를 나타내도록 프로그램을 수정한다.
		
		person3 = person2;	
		person2 = person1;	
		person1 = a; 
		System.out.println("\nThe three people reassigned...");
		System.out.println(person1 + ", " + person2 + ", " + person3);
		System.out.println();
		System.out.println("Changing the second name to Bozo...");
		person2.changeName("Bozo"); // person2의 이름만 바뀜
		System.out.println(person1 + ", " + person2 + ", " + person3);
		System.out.println();
		System.out.println("Changing the third name to Clarabelle...");
		person3.changeName("Clarabelle");//person1, person3의 값이 바뀜
		System.out.println(person1 + ", " + person2 + ", " + person3);
		System.out.println();
		System.out.println("Changing the first name to Harpo...");
		person1.changeName("Harpo"); //person1, person3의 값이 바뀜
		System.out.println(person1 + ", " + person2 + ", " + person3);
	}
}