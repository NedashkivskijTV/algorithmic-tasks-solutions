package org.example.model;

// https://www.codewars.com/kata/5286b2e162056fd0cb000c20/train/java

public class Collatz {
    public static String collatz(int n) {
        String rowStr = "->";
        StringBuilder result = new StringBuilder().append(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            result.append(rowStr).append(n);
        }

        return result.toString();
    }

}

/*
return n > 1 ? n + "->" + collatz(n % 2 > 0 ? 3 * n + 1 : n / 2) : "1";
 */

/*
public class Collatz {
  public static String collatz(int n) {
    return collatzR(n,"");
  }
  private static String collatzR(int n,String acum) {
		if(n==1) {
			return acum+="1";
		}else {
			acum+=n+"->";
			return collatzR(n%2==0?n/2:3*n+1,acum);
		}
	}
}
 */