package edu.pasadena.cs.cs03b;
import java.util.Scanner;

public class TaxTableTools {
	
	private int[] salary;
	private double[] taxRate;

	public TaxTableTools() {
		salary = new int[]{0, 11000, 44725, 95375, 182100, 231250, 578125};
		taxRate = new double[]{0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};
	}

	public static void main(String[] args) {
		TaxTableTools taxTableTools = new TaxTableTools();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
		System.out.print("Enter the annual income (-1 to exit): ");
			double annualIncome = scanner.nextDouble();
			if (annualIncome == -1) {
				System.out.println("Bye!");
				run = false;
				break;
			}
			System.out.println("Annual Income: " + annualIncome + "; Tax Rate: " + taxTableTools.getTax(annualIncome) +
			 "; Tax to Pay: " + annualIncome * taxTableTools.getTax(annualIncome));
			System.out.println("-----------------------------------");
		}
	}

	public void setSalary(int[] salary){
		this.salary = salary;
	}

	public void setSalary(int[] salary, double[] taxRate){
		this.salary = salary;
		this.taxRate = taxRate;
	}

	public double getTax(double annualIncome) {
		double result = 0;

		for (int i = 0; i < salary.length - 1; i++) {
			if (annualIncome <= salary[i + 1]) {
				result = taxRate[i];
				break;
			}
		}
		if (annualIncome >= salary[salary.length - 1]) {
			result = taxRate[taxRate.length - 1 ];
		}
		
		return result;
	}
}