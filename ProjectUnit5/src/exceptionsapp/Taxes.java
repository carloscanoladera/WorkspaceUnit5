package exceptionsapp;

public class Taxes {
	
	
	public double calculateTaxes(Employee e) throws ErrorTaxException {
		
		
		
		if (e.getTaxWithHolding()> 0.50 || e.getTaxWithHolding() < 0.0) {
			
			
			throw new ErrorTaxException();
			
		}
		
		return e.getSalary()*e.getTaxWithHolding();
	}

}
