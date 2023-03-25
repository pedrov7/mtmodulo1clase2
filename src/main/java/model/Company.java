package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Company extends TaxPayer {

	private int numberOfEmployees;

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double payTaxes() {
		double payTaxes;
		if (getNumberOfEmployees() > 10) {
			payTaxes = getAnualIncome() * 0.14;
		} else {
			payTaxes = getAnualIncome() * 0.16;
		}
//		System.out.println("Paytaxes-> "+ String.format("%.2f", payTaxes));
		return payTaxes;
	}

}
