package cisc181.lab0;

public class Lab0D {
    public static double compute_tax(int income, int exemptions, boolean non_profit) {
        int adjusted_income;
        adjusted_income = income - (exemptions * 5000);
        if ((non_profit == true) || (adjusted_income < 0)) {
            return 0;
        }
        else if (adjusted_income < 10000) {
            return adjusted_income * .1;
        }
        else if (adjusted_income < 20000) {
            return adjusted_income * .15;
        }
        else if (adjusted_income < 50000) {
            return adjusted_income * .2;
        }
        else {
            return adjusted_income * .25;
        }
    }
    public static double gross_income(int income, int exemptions, boolean non_profit) {
        return income - compute_tax(income, exemptions, non_profit);
    }
    public static void main(String[] args) {
        System.out.println(compute_tax(30000, 2, false));
        System.out.println(compute_tax(10000, 6, false));
        System.out.println(compute_tax(75000, 1, false));
        System.out.println(compute_tax(75000, 1, true));
        System.out.println(gross_income(30000, 2, false));
        System.out.println(gross_income(10000, 6, false));
        System.out.println(gross_income(75000, 1, false));
        System.out.print(gross_income(75000, 1, true));
    }
}
