import java.util.Random;
import java.util.Scanner;


public class Main{
	
	public static void main(String args[]) {
		
		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
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
		
/* 		int sum = 0;
		
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
		} */
		/*
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		System.out.println(number1+number2); */
		
	/* 	double number3 = scanner.nextDouble();
		double number4 = scanner.nextDouble();
		
		String truth = (number3==number4) ? "Yes" : "NO";
		
		System.out.println(truth); */
		
		/* double numb1 = scanner.nextDouble();
		double numb2 = scanner.nextDouble();
		
		if (numb1<=numb2){
			numb1=0;
			System.out.println(numb1 + " " + numb2);
		} else{
			System.out.println(numb1 + " " + numb2);
		} */
		
		/* double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
 
        if (a>=0) {
            double n = a * a;
            System.out.println(n);
        }
		if (b>=0) {
            double y = b * b;
            System.out.println(y);
        }
 
        if (c>=0) {
            double z = c * c;
            System.out.println(z);
        } */
		
		
		/* int num = scanner.nextInt();
		
		int sum = 0;
		
		while (num >0){
			sum += num%10;
			num/=10;
		}
		System.out.println(sum); */
		
		
		/* double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
		
		if (a>1 && a<3) {
            System.out.println(a);
        }
		if (b>1 && b<3) {
            System.out.println(b);
        }
 
        if (c>1 && c <3) {
            System.out.println(c);
        } */

		/* int k = scanner.nextInt();
		
		for (int i = 2; i<=9; i++){
			int ans = i*k;
			System.out.println(i+"*"+k+"="+ans);	
		} */
	/* 	
 		double a,b,c,d;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
				
		
		if (a<=b && b<=c && c<=d){
			System.out.println(""+d+" "+d+" "+d+" "+d);
		} else if (a>b && b>c && c>d){
			System.out.println(""+a+" "+b+" "+c+" "+d);
		}else{
			System.out.println(""+(a*a)+" "+(b*b)+" "+(c*c)+" "+(d*d));
		} */
	/* 	
		double x,y,z;
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		z = scanner.nextDouble();
		double max_numb_prom = Math.max(x,y);
		double max_numb = Math.max(z,max_numb_prom);
		double min_numb_prom = Math.min(x,y);
		double min_numb = Math.min(min_numb_prom,z);
		double mid_numb = max_numb - min_numb;
		if ((x+y)>z){
			System.out.println("Существует");
			if ((max_numb*max_numb)< ((mid_numb*mid_numb)+(min_numb*min_numb))){
				System.out.println("Остроугольный");
			} else{
				System.out.println("Другой");
			}
		} else{
			System.out.println("Не существует");
		}
		 */
		
/* 		double x,y,z;
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		z = scanner.nextDouble();
		
		if (x!=z && z!=y){
			if ((z+x+y)<1){
				if (z<y && z<x){
					z= (y+x)/2;
					System.out.println(""+x+" "+y+" "+z);
				} else if(y<z && y<x){
					y = (z+x)/2;
					System.out.println(""+x+" "+y+" "+z);
				} else if(x<y && x<z){
					x = (z+y)/2;
					System.out.println(""+x+" "+y+" "+z);
				}
			} else{
				if (x<y){
					x = (y+z)/2;
					System.out.println(""+x+" "+y+" "+z);
				} else{
					y = (x+z)/2;
					System.out.println(""+x+" "+y+" "+z);
				}
			}
		}else {
			System.out.println("Числа не попарно различимы");
		} */
		
		
	/* 	double a,b,c;
		
		a = 2;
		b = 6;
		c = 2;
		
		if (a!= 0){
			double D = (b*b)-(4*a*c);
			if (D<0){
				double D2 = Math.sqrt(D);
				double x1 = (-b +D2)/2*a;
				double x2 = (-b -D2)/2*a;
			}else{
				System.out.println("Действительных корней нет");
			}
		}else{
			System.out.println("A равен нулю");
		}
		 */
		
		
/* 		int x;
		x = scanner.nextInt();
		
		if (x>=0){
			System.out.println(Integer.toBinaryString(x));
		}else {
			System.out.println("Число не подходит");
		}
		  */
		
		/* int x;
		x = scanner.nextInt();
		int i = x;
		while(i>=x){
			i =scanner.nextInt();
		}
		System.out.println("Число оказалось меньше");
		 
		 
		 */
	}
}