package variables;

// STATEMENTS: Make some decision
// if statement
//Multiple If statements
//Nested If Statements
//If-else statement
//If-else if statement
//switch statement

public class IfElseStatements
{
    public static void main(String[] args) {

        //Simple if-else statement
//        int age =17;
//        if(age>=18)
//        {
//            System.out.println("Person is eligible to vote");
//        }
//        else
//        {
//            System.out.println("Person is not eligible to vote");
//        }

        //Multiple if-else Statement

//        int score = 35;
//
//        if(score>=90)
//        {
//            System.out.println("Excellent! You got an A grade");
//        }
//        if(score<90 && score>=80)
//        {
//            System.out.println("Very Good! You got a B grade");
//        }
//
//        if(score<80 && score>=70)
//        {
//            System.out.println("Good! You got a C grade");
//        }
//
//        if(score<70 && score>=60)
//        {
//            System.out.println("Fair! You got a D grade");
//        }
//        if(score<60 && score>=50)
//        {
//            System.out.println("Well! You got an E grade");
//        }
//        else
//        {
//            System.out.println("Sorry you failed....");
//        }

        // Nested If-else Statement

        int age =25;
        boolean hasVoterId=false;

        if(age>=18)
        {
            System.out.println("You are Eligible to vote");

            if(hasVoterId)
            {
                System.out.println("Id Checked....You may proceed to vote");
            }
            else
            {
                System.out.println("No Id found....cannot proceed to vote");
            }
        }
        else
        {
            System.out.println("You are below 18, not eligible to vote");
        }

    }
}
