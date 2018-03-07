import java.util.Random;
import java.util.Scanner;

public class first {

	public static String Cchoice;
	public static String Pchoice;
	public static String Final;
	public static String tie = "Try again!";
	public static String lose = "You lose!";
	public static String win = "You win!";
	public static String rock = "rock";
	public static String paper = "paper";
	public static String scissors = "scissors";
	public static String[] Array2 = { rock, paper, scissors, rock };
	public static Random rand = new Random();
	public static int  n = rand.nextInt(3);
	

	public static void main(String[] args) {
		System.out.println("Enter rock, paper or scissors.");
		Cchoice = compChoice();
		Scanner textscan = new Scanner(System.in);
		Pchoice = textscan.nextLine();
		textscan.close();
		System.out.println("The computer chose " + Cchoice + "," + winLose());

	}

	public static String compChoice() {
		return Array2[n];
		
	}

	public static String winLose() {

		if (Pchoice.equals(Cchoice)) {
			return tie;
		}

		else if (Pchoice.equals(rock) && (Cchoice.equals(paper))) {
			return lose;
		}

		else if (Pchoice.equals(rock) && (Cchoice.equals(scissors))) {
			return win;
		}

		else if ((Pchoice.equals(scissors)) && (Cchoice.equals(paper))) {
			return win;
		}

		else if ((Pchoice.equals(scissors)) && (Cchoice.equals(rock))) {
			return lose;
		}

		else if ((Pchoice.equals(paper)) && (Cchoice.equals(scissors))) {
			return lose;
		}

		else if ((Pchoice.equals(paper)) && (Cchoice.equals(rock))) {
			return win;
		}

		else {
			return "Please enter a valid choice";
		}

	}
}
