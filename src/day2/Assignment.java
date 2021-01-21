
/*  

1.Calculate square of the number
2.Multiply three values
3. Calculate tip for the check(eg. Java TipCalculator <check amount> <%tip>)
1:04
4.DO Even number or odd number using Tertary operator
1:05
5. Write a Switch program to select food menus or sports
1:06
6.Created a nested if else program to selected womens/mens/kids clothes



*/


package day2;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		//System.out.println(square());
		
		//System.out.println(multiplyOfThree());
		
		//System.out.println(tipCalculator());
		
		//System.out.println(evenOrOdd());
		
		//System.out.println(SelectSport());
		
		//System.out.println(ClothesGender());
		
		
	}
	
	
	public static double square() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter your number : ");
		double d = input.nextDouble();
		
		return d*d;	
	}
	
	public static double multiplyOfThree( ) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter your first number : ");
		double a = input.nextDouble();
		
		System.out.println("enter your second number : ");
		double b = input.nextDouble();
		
		System.out.println("enter your third number : ");
		double c = input.nextDouble();
		
		return a*b*c;	
	}
	
	public static double tipCalculator() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter the Tip Percentage :");
		double tipPercentage=input.nextDouble();
		
		System.out.println("enter the check Amount :");
		double checkAmount=input.nextDouble();
		
		double tip = (tipPercentage*checkAmount)/100;
		
		return tip;	
	}
	

	public static String evenOrOdd() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter your number :");
		double a=input.nextInt();
		
		return (a%2)==0 ? "Even" : "Odd";
		
	}
	
	public static String SelectSport() {

		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please choose one of those sports for more details : Kayaking,Bobsleighing,Canoeing,Surfing ");
		String sport=input.next();
		
		
			switch (sport) {
			
			case "Kayaking" :
				return "Kayaking is a sport involving rapidly traversing distance over bodies of water in a kayak, "
						+ "which is a small boat resembling a canoe. "
						+ "It can be an individual sport but is considered a popular team sport.";
				
			case "Bobsleighing" :
				return "Bobsleighing or bobsledding is a winter sport in which teams of two or four make their way down pathways that twist and turn. "
						+ "They do so in a bobsled and are timed so as to determine which person accomplished it faster. "
						+ "In the Winter Olympics, this is a popular Olympic Sport.";
			case "Canoeing" :
				return "As this is a popular Olympic Sport, canoeing is usually done in one of two types of competitions; "
						+ "which are canoe sprint or canoe slalom. Both involve going downstream and competing against other individuals doing the same to see who traverses the waters first. "
						+ "This is also an individual sport and doesn’t involve teams";
			case "Surfing" :
				return "Surfing is a surface water sport in which the wave rider has to anticipate the wave and make his or her way through it. "
						+ "Waves suitable for the sport are found in the ocean and can rise several meters high, endangering the surfers. "
						+ "It is considered a popular individual sport in several coastal areas.";	
						
			default :
				
				return "Sorry "+sport
						+ " not on the list";
			
			}
	}
	
	
	public static String ClothesGender() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter the gender (Women,Men,Kids) for clothes list : ");
		String gender=input.next();
		
		gender.trim().toLowerCase();
		
		if (gender.equals("women"))
			return "Wedding dress\n" + 
					"Sweater\n" + 
					"T-shirt\n" + 
					"Sheath dress\n" + 
					"Dress\n" + 
					"Gym clothes\n" + 
					"Bra\n" + 
					"Tank top\n" + 
					"Shorts\n" + 
					"Hoodie\n" + 
					"Jeans\n" + 
					"Long coat\n" + 
					"Uniform\n" + 
					"Coat\n" + 
					"Dress pants\n" + 
					"Swimsuit\n" + 
					"Long-sleeve top\n" + 
					"Skirt\n" + 
					"Thong\n" + 
					"Hat\n" + 
					"Necklace\n" + 
					"Ring\n" + 
					"Earrings\n" + 
					"Perfume\n" + 
					"Mittens\n" + 
					"Sunglasses\n" + 
					"Handbag\n" + 
					"Bracelet\n" + 
					"Purse\n" + 
					"Watch\n" + 
					"Umbrella\n" + 
					"Scarf\n" + 
					"Slip\n" + 
					"High-heeled shoes\n" + 
					"Flip-flops\n" + 
					"Boots\n" + 
					"Stockings\n" + 
					"Jacket";
		else if (gender.equals("men"))			
			return "Sweater\n" + 
					"Shirt\n" + 
					"Jeans\n" + 
					"Gloves\n" + 
					"Cap\n" + 
					"Suit\n" + 
					"Hawaiian shirt\n" + 
					"Singlet\n" + 
					"Business shoes\n" + 
					"Flip flops\n" + 
					"Shorts\n" + 
					"Cardigan\n" + 
					"Jacket\n" + 
					"Sport shoes\n" + 
					"Bow tie\n" + 
					"Sleeveless shirt\n" + 
					"Vest\n" + 
					"Long-sleeve top\n" + 
					"Polo shirt\n" + 
					"Jumper\n" + 
					"Trench coat\n" + 
					"Bathrobe\n" + 
					"Cargo pants\n" + 
					"Swimsuit\n" + 
					"Blazer\n" + 
					"T-shirt\n" + 
					"Belt\n" + 
					"Underpants\n" + 
					"Waistcoat\n" + 
					"Socks";
		else if (gender.equals("kids"))
			return "Overalls\n" + 
					"Mittens\n" + 
					"Beanie\n" + 
					"Baby apron\n" + 
					"Socks\n" + 
					"Diaper\n" + 
					"Singlet\n" + 
					"Shoes\n" + 
					"Safety pin\n" + 
					"";
		else 
			return "try one of those genders : womens,mens,kids";
	}
			
	
	
	

}



