import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int number = (new Random()).nextInt(0, 100);  // Random number 的用法

        System.out.println("Guess a magic number between 0 and 100");
        Scanner scanner = new Scanner(System.in); //scanner就用本来的名字
        Integer guess = null; //先设定为null

        //另一个方法，可以用do....while的方法，先显示提示词，再用if来判断，最后用while来判断等于的情况
        //还有用boolean与do....while配合使用
        while (guess == null || number != guess) { //考虑一开始的状态
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("too low");
            } else if (guess > number) {
                System.out.println("too high");
            }
        }
        System.out.println("Yes, the number is " + Integer.toString(number)); //转换输出类型
    }


}