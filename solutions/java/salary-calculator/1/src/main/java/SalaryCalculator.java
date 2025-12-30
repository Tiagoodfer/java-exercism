public class SalaryCalculator {

    double baseSalary = 1000;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85; 
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10; 
    }

    public double bonusForProductsSold(int productsSold) {
        int x = bonusMultiplier(productsSold);
        return productsSold * x;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = baseSalary * salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(productsSold);
        double finalSalary = (double)salary + bonus;
        return finalSalary > 2000 ? 2000 : finalSalary;
    } 
}
