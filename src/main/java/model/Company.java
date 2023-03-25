package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Company extends TaxPayer{
	
	private int numberOfEmployees;

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double payTaxes() {
		return (Double) null;
	}
	
	
	

}
