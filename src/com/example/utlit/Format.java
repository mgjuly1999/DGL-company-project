package com.example.utlit;

import java.text.DecimalFormat;

import org.springframework.stereotype.Repository;

@Repository("format")
public class Format {
public  double  decimalFmt(String dec)
{
	DecimalFormat df = new DecimalFormat("#.##");
	return Double.parseDouble(df.format(Double.parseDouble(dec))); 	
}
public static double  decimalFmt(double dec)
{
	DecimalFormat df = new DecimalFormat("#.##");
	return Double.parseDouble(df.format(dec)); 	
}
}
