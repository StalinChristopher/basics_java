package com.yml.junitbasicsjava;

public final class Util {
	
	private Util() {
		
	}
	
	public static int dayOfWeek(int d,int m,int y) {
		int y0 = 0, m0 = 0, x = 0, d0 = 0;
		
		y0 = y - (14-m)/12;
		x = y0 + (y0/4) - (y0/100) + (y0/400);
		m0 = m + 12 * ((14-m)/12)-2;
		d0 = (d+x+(31*m0)/12)%7;
		
		return d0;
	}
	
	public static double temperatureConversion(double temp, char type){
		if(type == 'C'){
            return (temp*(9/5)) + 32;
        }
        else{
        	return (temp-32)*((double)5/9);
        }
	}
	
	public static double monthlyPayment(double principal, int year, double rate){
        
        double modifiedRate = rate / (12 * 100);
        double n = 12 * year;

        return (principal*modifiedRate)/(1-Math.pow(1+modifiedRate, -n));

    }
	
	public static double sqrt(int c) {
		double t = c;
		double epsilon = 0.000000000000001;

		while(Math.abs(t-(c/t))>(epsilon*t)) {
			t = ((c/t)+t)/2;
		}
		return t;
	}
}
