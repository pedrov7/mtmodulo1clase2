package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class TaxPayer {
	
	private String name;
	private Double anualIncome;
	
	public abstract double payTaxes();

}
