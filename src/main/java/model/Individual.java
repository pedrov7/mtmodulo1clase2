package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double payTaxes() {
		double pay;
		if (getAnualIncome() > 0 && getAnualIncome() < 20000.00) {
			if (getHealthExpenditures() > 0) {
				pay = (getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);
				System.out.println("payTaex " + String.format("%.2f", pay).toString());
				return pay;
			} else {
				pay = getAnualIncome() * 0.15;
				System.out.println("payTaex " + String.format("%.2f", pay));
				return pay;
			}

		} else {
			if (getHealthExpenditures() > 0) {
				pay = (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
				System.out.println("payTaex " + pay);
				return pay;
			} else {
				pay = getAnualIncome() * 0.25;
				System.out.println("payTaex " + pay);
				return pay;
			}
		}
	}

}
