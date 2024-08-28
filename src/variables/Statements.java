package variables;

// STATEMENTS: Make some decision
// if statement
//Multiple If statements
//Nested If Statements
//If-else statement
//If-else if statement
//switch statement

public class Statements
{
    public static void main(String[] args) {

        //Simple if statement
//        int age =17;
//        if(age>=18)
//        {
//            System.out.println("Person is eligible to vote");
//        }

        //Multiple if Statement

//        int score = 55;
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
//        if(score<60)
//        {
//            System.out.println("Sorry! You got an F grade");
//        }

        // Nested If Statement

        int age =17;
        boolean hasVoterId=true;

        if(age>=18)
        {
            System.out.println("You are Eligible to vote");

            if(hasVoterId)
            {
                System.out.println("Id Checked....You may proceed to vote");
            }
        }

    }
}
