import java.util.*;
import java.text.*;
public class IncomeTaxCalculator {
static final double TAX_RATE_ABOVE_20K = 0.1;
static final double TAX_RATE_ABOVE_40K = 0.2;
static final double TAX_RATE_ABOVE_60K = 0.3;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("####.00");
		double taxableIncome;
		double taxPayable = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the taxable income:");
        taxableIncome = scan.nextDouble();
        if(taxableIncome <= 20000) {
        	taxPayable = 0;
        }      
        else if (taxableIncome<=40000)
        {
        	taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;
        }
        else if (taxableIncome<= 60000)
        {
        	taxPayable = 20000*TAX_RATE_ABOVE_20K+(taxableIncome-40000)* TAX_RATE_ABOVE_40K;
        }
        else 
        {
        	taxPayable = 20000*TAX_RATE_ABOVE_20K+ 
        			20000*TAX_RATE_ABOVE_40K+(taxableIncome-60000)
        			*TAX_RATE_ABOVE_60K;
        }	
        
        System.out.println("The income tax payable is: $"+frm.format(taxPayable));
	}

}
