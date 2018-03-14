package hw04_OOPPrinciples.p07_Mankind;

/**
 * Created by fluch on 3/13/2018.
 */
class Worker extends Human {

    private static final String INVALID_LENGTH = "Expected length more than 3 symbols!Argument: lastName";
    private static final String WRONG_SALARY = "Expected value mismatch!Argument: weekSalary";
    private static final String WRONG_HOURS = "Expected value mismatch!Argument: workHoursPerDay";


    private double weekSalary;
    private double workHoursPerDay;

    Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.salary(weekSalary);
        this.hours(workHoursPerDay);
    }

    double salaryByHour() {
        return (this.weekSalary) / (this.workHoursPerDay * 7.0);
    }

    private void salary(double salary) {
        if (salary <= 10) {
            throw new IllegalArgumentException(WRONG_SALARY);
        } else {
            this.weekSalary = salary;
        }
    }

    private void hours(double hours) {
        if (hours < 1 || hours > 12) {
            throw new IllegalArgumentException(WRONG_HOURS);
        } else {
            this.workHoursPerDay = hours;
        }
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName == null || lastName.length() < 3) {
            throw new IllegalArgumentException(INVALID_LENGTH);
        } else {
            super.setLastName(lastName);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s", super.getFirstName())).append(System.lineSeparator());
        sb.append(String.format("First Name: %s", super.getLastName())).append(System.lineSeparator());
        sb.append(String.format("Week Salary: %.2f", this.weekSalary)).append(System.lineSeparator());
        sb.append(String.format("Hours per day: %.2f", this.workHoursPerDay)).append(System.lineSeparator());
        sb.append(String.format("Salary per hour: %.2f", this.salaryByHour()));
        return sb.toString();
    }
}
