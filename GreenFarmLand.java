import java.util.Scanner;

public class GreenFarmLand {
	public static void main(String[] args) {
		int expectTomato, expectPotato, expectBanana;
		int tomatoHectare = 300;
		int potatoHectare = 500;
		int bananaHectare = 200;
		int tomatoTimes = 3;
		int potatoTimes = 2;
		int bananaTimes = 1;
		double tomatoPrice = 2.50;
		double potatoPrice = 1.70;
		double bananaPrice = 3.50;
		Scanner sc = new Scanner(System.in);
		System.out.println("***Welcome to GREEN FARMLAND Sale calculator***");
		System.out.print("Enter expected yield of Tomato - ");
		expectTomato = sc.nextInt();
		System.out.print("Enter expected yield of Potato - ");
		expectPotato = sc.nextInt();
		System.out.print("Enter expected yield of Banana - ");
		expectBanana = sc.nextInt();
		System.out.println("Results:");
		int yearTomato = expectTomato*tomatoTimes*tomatoHectare;
		int yearPotato = expectPotato*potatoTimes*potatoHectare;
		int yearBanana = expectBanana*bananaTimes*bananaHectare;
		int saleTomato = (int) (yearTomato*tomatoPrice);
		int salePotato = (int) (yearPotato*potatoPrice);
		int saleBanana = (int) (yearBanana*bananaPrice);
		System.out.println("Expected yearly yield of Tomato - "+yearTomato+" Kilos");
		System.out.println("Expected yearly yield of Potato - "+yearPotato+" Kilos");
		System.out.println("Expected yearly yield of Banana - "+yearBanana+" Kilos");
		System.out.println("Expected sale amount of Tomato - $"+saleTomato);
		System.out.println("Expected sale amount of Potato - $"+salePotato);
		System.out.println("Expected sale amount of Banana - $"+saleBanana);
		System.out.println("Total amount for this year - $"+(saleTomato+salePotato+saleBanana));
		
	}
}