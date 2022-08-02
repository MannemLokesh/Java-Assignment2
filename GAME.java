import java.util.Scanner;

class Guesser
{
	int numFromGuesser;
	public int numfromguesser()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("guesser kindly guess the number");
		numFromGuesser=sc.nextInt();
		
		return numFromGuesser;
	}
}
class Player
{
	int numFromPlayer;
	public int numfromplayer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("player kindly guess the number");
		numFromPlayer=sc.nextInt();
		
		return numFromPlayer;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void guessernum()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.numfromguesser();
	}
	void playernum()
	{
		Player p1=new Player();
		numFromPlayer1=p1.numfromplayer();
		Player p2=new Player();
		numFromPlayer2=p2.numfromplayer();
		Player p3=new Player();
		numFromPlayer3=p3.numfromplayer();
	}
	void Compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1,2,3 Won the Match");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1,2 Won the Match");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1,3 Won the Match");
			}
			else
			{
				System.out.println("Player 1 Won the Match");
			}
		}
		else if(numFromGuesser==numFromPlayer2) 
		{
			if(numFromGuesser==numFromPlayer3 )
			{
				System.out.println("Player 2,3 Won the Match");
			}
			else
			{
				System.out.println("Player 2 Won the Match");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 Won the Match");
		}
		else
		{
			System.out.println("Lost the Game!!Try again");
		}
	
	}
}
public class GAME
{
	public static void main(String[] args)
	{
		Umpire u=new Umpire();
		u.guessernum();
		u.playernum();
		u.Compare();
	}
}