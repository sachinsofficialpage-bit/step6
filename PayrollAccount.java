class PayrollAccount{
    private double basicSalary;
    private double bonus;
    PayrollAccount(double basicSalary, double bonus){
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }
    public void creditbonus(double amount){
        if(amount<0){
            System.out.println("Invalid amount");
        }
        else{
            bonus += amount;
            System.out.println("Bonus credited: " + amount);
        }

    }
    public void deducttax(double percent){
        if(percent<0 || percent>100){
            System.out.println("Invalid percentage");
        }
        else{
            double tax = (basicSalary + bonus) * percent / 100;
            basicSalary -= tax;
            System.out.println("Tax deducted: " + tax);
        }
    }
    public netsalary(){
        return basicSalary + bonus;
    }
    public static void main(String[] args){
        PayrollAccount account = new PayrollAccount(5000, 500);
        account.creditbonus(200);
        account.deducttax(10);
        System.out.println("Net Salary: " + account.netsalary());
    }
}