import java.util.Random;
import java.util.Scanner;


public class Main{
	
	public static void main(String args[]) {
		
		
		
/* 		boolean b = true;
		
		boolean not_b = false;
		
		System.out.println(b & not_b);
		System.out.println(b | not_b);
		System.out.println(b & !not_b);
		System.out.println(b ^not_b);
		System.out.println("O_O"); */
		
		/* int b1 = 10, c1 = 20, ind = 2, b2 = 5, big = 20;
		
		System.out.println("/ by zero Error");	
		System.out.println((b1 < c1) && (b2 == -99) || (ind >= 0) );
		System.out.println((b1 | c1) & (big ^ b1) );
		System.out.println((b1<<3 + c1<<2) % (b2>>5 / b1>>>2));
		System.out.println("0_0");
		
		int numb1 = 10;
		int numb2 = 1;
		int numb3 = 20;
		int numb30 = 30;
		
		switch(numb1){
			case 1:
				System.out.println("Первое число равно единице");
				break;
			case 30:
				System.out.println("Первое число равно тридцати");
				break;
			default:
				System.out.println("Да я вообще хз что это за число");
		}
		System.out.println("O_O"); */
		
		
		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
/* 		System.out.println("Угадайте число от 1 до 100:");
		
		int userGuess = scanner.nextInt();
		
		while (userGuess != numberToGuess) {
			
			System.out.println(numberToGuess); //Готовый ответ
			
			if (userGuess > numberToGuess){
				System.out.println("Твоё число больше");
			} else{
				System.out.println("Твоё число меньше");
			}
		
			userGuess = scanner.nextInt();	
		}
		
		System.out.println("Ты угадал, чумба");	 */
		
/* 		int a = 5;
		String result = (a>0) ? "Положительное" : "Отрицательное";
		
		System.out.println(result); */
		
/* 		System.out.println("Введите ваше число");
		
		int userNumber = scanner.nextInt();
		
		if (userNumber%2 == 0){
			System.out.println("Число чётное");
		} else {
			System.out.println("Число нечётное");
		}
		 */
/* 		double userNumber1 = scanner.nextDouble();
		double userNumber2 = scanner.nextDouble();
		
		double answer = userNumber1>userNumber2 ? userNumber1 : userNumber2;
		
		System.out.println(answer); */
		
		
/* 		System.out.println("Введите свой балл, целое число");
		
		while (!scanner.hasNextInt()){
			System.out.println("Вы ввели не то");
			System.out.println("Попробуйте снова");
			scanner.next();
		}
		
		int schoolBall = scanner.nextInt();
		
		if (schoolBall >= 0 && schoolBall<=59){
			System.out.println("Неудолетворительно");
		} else if (schoolBall>=60 && schoolBall<=74){
			System.out.println("Удолетворительно");
		} else if (schoolBall>=75 && schoolBall <= 89){
			System.out.println("Хорошо");
		} else if (schoolBall>=90 && schoolBall<=100){
			System.out.println("Отлично");
		} else {
			System.out.println("Чёт ты напутал");
		} */
		
		int sum = 0;
		
		for (int i =1; i<=100; i++){
			sum+=i;
		}
		System.out.println(sum);
		
		int userNumber = scanner.nextInt();
		
		int sumz = 1;
		
		for(int i = 1; i<=userNumber; i++){
			sumz*=i;
		}
		System.out.println(sumz);
		
		
		for (int i = 1; i <= 20; i++){
			if (i%2==0){
				System.out.println(i + " - Чётное");
			}else{
				System.out.println(i + " - Нечётное");
			}
		}
		
	}
}