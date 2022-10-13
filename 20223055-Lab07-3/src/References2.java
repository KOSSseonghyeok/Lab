import java.util.Scanner;
public class References2
{
 public static void main(String[] args)
 {
 int age1, age2, age3;
try (Scanner in = new Scanner(System.in)) {
	System.out.println("Enter three ages...");
	 age1 = in.nextInt();
	 age2 = in.nextInt();
	 age3 = in.nextInt();
}
 // Instantiate three Person objects with the ages read in
 Person person1 = new Person("Rachel", age1);
 Person person2 = new Person("Elly", age2);
 Person person3 = new Person("Sarah", age3);
 System.out.println();
 System.out.println("The original three people...");
 System.out.println(person1 + ", " + person2 + ", " + person3);
 // Reassign ages in the int varaiables 
 age1 = age2; //age1의 값이 age2의 값으로 바뀜
 age3 = age2;// age3의 값이 age2의 값으로 바뀜 따라서 age1 = age2 = age3가 됨.
 // Reassign the Person objects 
 person1 = person2; //person1의 레퍼런스 값이 person2의 레퍼런스 값으로 바뀜
 person3 = person2; //person3의 레퍼런스 값이 person2의 레퍼런스 값으로 바뀜 따라서 person1 = person2 = person3가 됨.
 System.out.println();
 System.out.println("The changed values are...");
 System.out.println("Ages (ints): " + age1 + ", " + age2 + ", " + age3);
 System.out.println(person1 + ", " + person2 + ", " + person3);
 // Make some changes to the integer values and corresponding objects
 System.out.println("\nChanging the second age to 99...");
 age2 = 99; //age2의 값만 99로 변환
 person2.changeAge(age2); //person1, person2, person3의 age가 다 age2로 바뀜
 System.out.println("The changed values are...");
 System.out.println("Ages (ints): " + age1 + ", " + age2 + ", " + age3);
 System.out.println(person1 + ", " + person2 + ", " + person3);
 System.out.println(); 
 System.out.println("Changing the first age to 100...");
 age1 = 100; //age1의 값만 100으로 바뀜 현재 age1 = 100, age2 = 99, age3 = 그대로
 person1.changeAge(age1); //전체 person객체의 나이가 100으로 바뀜
 System.out.println("The changed values are...");
 System.out.println("Ages (ints): " + age1 + ", " + age2 + ", " + age3);
 System.out.println(person1 + ", " + person2 + ", " + person3);
 
 }
}