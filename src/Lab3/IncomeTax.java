package Lab3;

public class IncomeTax {
    // Data field
    private double income;
    private int tax_filers;
    /*
    0: Unmarried Individuals
    1: Married Individual Filing Separately
    2: Married Individual Filing Jointly
    3: Heads Of Households
     */

    double[] tax_rate = new double[] {0.1,0.12,0.22,0.24,0.32,0.35,0.37};
    double[][] income_rate = new double[][] {{9875,40125,85525,163300,207350,518400},
                                            {9875,40125,85525,163300,207350,311025},
                                            {19750,80250,171050,326600,414700,622050},
                                            {14100,53700,85500,163300,207350,518400}};
    IncomeTax(double income, int tax_filers) {
        this.income = income;
        this.tax_filers = tax_filers;
    }

    public IncomeTax() {
    }

    // Set & Get methods
    void setIncome(double income) { this.income = income; }
    void setTax_filers(int tax_filers) { this.tax_filers = tax_filers; }

    double getIncome() { return income; }
    int getTax_filers() { return tax_filers;}
    /*
    income_point[][];
    tax_rate[];
    if-else
    income_tax = income * tax_rate;
     */
    double calIncomeTax() {
        if (income < income_rate[tax_filers][0]) {
            return tax_rate[0] * income;
        } else if (income < income_rate[tax_filers][1]) {
            return tax_rate[1] * income;
        } else if (income < income_rate[tax_filers][2]) {
            return tax_rate[2] * income;
        } else if (income < income_rate[tax_filers][3]) {
            return tax_rate[3] * income;
        } else if (income < income_rate[tax_filers][4]) {
            return tax_rate[4] * income;
        } else if (income < income_rate[tax_filers][5]) {
            return tax_rate[5] * income;
        } else {
            return tax_rate[6] * income;
        }
    }
    void printTable(double from_inc, double to_inc) {
        String IC = "Income";
        String UI = "Unmarried individuals";
        String MS = "Married...separately";
        String MJ = "Married...jointly";
        String HH = "Head of households";
        System.out.printf("%-12s %-25s %-24s %-23s %-22s\n",IC,UI,MS,MJ,HH);
        for ( double i = from_inc; i <= to_inc; i+=from_inc) {
            setIncome(i);
            System.out.printf("%-15.1f",i);
            for (tax_filers = 0; tax_filers < 4; tax_filers++) {
                double result = calIncomeTax();
                System.out.printf("%-25.1f", result);

            }
            System.out.println();
        }
    }
}
