import java.util.Random;
import java.util.Scanner;

public class Main{

public static String generateComputerChoice( Random random){

int wordNumber;
number using the inbuilt function
wordNumber = random.nextInt( 3 ) + 1;
String computerChoice = "";

if( wordNumber == 1 ){
computerChoice = "Rock";
}else if( wordNumber == 2 ){
computerChoice = "Paper";
}else if( wordNumber == 3 ){
computerChoice = "Scissors";
}

System.out.println( "nThe Computer have already made it's choice" );
return computerChoice;

}

public static void showMenu(){

System.out.println( "Options to choose from :n1.Rockn2.Papern3.Scissors" );

}

public static String getUserChoice( Scanner scanner ){

String userWordChoice = "";
System.out.print( "nPlease make your choice : " );
userWordChoice = scanner.nextLine();

return userWordChoice;

}

chooseWinner( String computerChoice, String userChoice ){

String winner = "No one is the Winner";
String customMessage = "Both chooses same";
String finalMessage = "";

String rockCustomMessage = "The rock smashes the scissor";
String scissorsCustomMessage = "Scissors cuts paper";
String paperCustomMessage = "Paper wraps rock";
if( computerChoice.equals( "Rock" ) && userChoice.equalsIgnoreCase( "Scissors" ) ){
winner = "Computer";
customMessage = rockCustomMessage;
}else if( userChoice.equalsIgnoreCase( "Rock" ) && computerChoice.equals( "Scissors" ) ){
winner = "User";
customMessage = rockCustomMessage;
}

if( computerChoice.equals( "Scissors" ) && userChoice.equalsIgnoreCase( "Paper" ) ){
winner = "Computer";
customMessage = scissorsCustomMessage;
}else if( userChoice.equalsIgnoreCase( "Scissors" ) && computerChoice.equals( "Paper" ) ){
winner = "User";
customMessage = scissorsCustomMessage;
}

if( computerChoice.equals( "Paper" ) && userChoice.equalsIgnoreCase( "Rock" ) ){
winner = "Computer";
customMessage = scissorsCustomMessage;
}else if( userChoice.equalsIgnoreCase( "Paper" ) && computerChoice.equals( "Rock" ) ){
winner = "User";
customMessage = paperCustomMessage;
}

finalMessage = winner + " won ( " + customMessage + " )";

return finalMessage;

}
public static void main( String [] args ){

Random random = new Random();
Scanner scanner = new Scanner(System.in);
String computerChoice;
String userChoice;
String winner;

showMenu();
computerChoice = generateComputerChoice( random );
userChoice = getUserChoice( scanner );
winner = chooseWinner( computerChoice, userChoice );

System.out.println( "nYou choose : " + userChoice + "nComputer choose : " +computerChoice );
System.out.println( winner );

}

}