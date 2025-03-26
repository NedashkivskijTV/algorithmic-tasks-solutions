package org.example.model;

// https://www.codewars.com/kata/563f037412e5ada593000114

public class Money {
  public static int calculateYears(double principal,
                                   double interest,
                                   double tax,
                                   double desired) {
    int years = 0;
    double currentPrincipal = principal;
    
    while (currentPrincipal < desired) {
      double yearInterest = currentPrincipal * interest;
      double yearTax = yearInterest * tax;
      currentPrincipal += (yearInterest - yearTax);
      years++;
    }

    return years;
  }

}
