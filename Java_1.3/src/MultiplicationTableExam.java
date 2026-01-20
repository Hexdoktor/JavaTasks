import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);

        while(true){
            int score = 0;

            // generate ten problems
            for (int i = 0; i < 10; i++){
                int a = (int)(Math.random()*10)+1;
                int b = (int)(Math.random()*10)+1;
                int correctAnswer = a * b;

                System.out.println("What is " + a + " * " + b + "?");
                int userAnswer = Integer.parseInt(reader.nextLine());

                if (userAnswer == correctAnswer){
                    System.out.println("Correct!");
                    score++;
                }else{
                    System.out.println("Incorrect. The right answer is " + correctAnswer + ".");
                }
            }

            System.out.println("Your score: " + score + "/10");

            if (score == 10){
                System.out.println("Excellent! You have conquered the multiplication table and hear the lamentation of the women.");
                break;  // end when user reaches max score
            }else{
                System.out.println("Let's try again!");

            }
        }
    }
}
