package march13_Softuni.p07_Mankind;

/**
 * Created by fluch on 3/13/2018.
 */
class Worker extends Human {
    private String firstName;
    private String lastName;
    private int weekSalary;
    private int workHoursPerDay;

    double moneyByHour() {
        return (this.weekSalary) / (this.workHoursPerDay * 7.0);
    }
}
