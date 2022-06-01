package com.xworkz.mavenjdbc;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

*/

public class Loan {

	private String provider;
	private Salary salary;


	
	public Loan(Salary salary) {
		super();
		this.salary = salary;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	

	public boolean sanction() {
		System.out.println("running loan sanction");

		if (salary != null) {
			System.out.println("Printing sal in loan : " + salary);
			if (salary.getNetSalary() > 500 && salary.getGrossSalary() > 600 && salary.getExistingLoanAmount() > 400) {

				System.out.println("eligible for loan");
				return true;
			} else {
				System.out.println("not eligible");
			}
		}

		return false;
	}

	
}