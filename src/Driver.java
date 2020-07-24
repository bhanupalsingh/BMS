import java.util.Scanner;

import com.bms.service.AdminService;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AdminService as = new AdminService();
		while(true) {
			String[] input = sc.nextLine().split(" ");
			String op = input[0].toUpperCase();
			switch(op) {
				case "ADDCITY":
					
			}
			
			
		}
	}
}
