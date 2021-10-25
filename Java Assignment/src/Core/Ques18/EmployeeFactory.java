package Core.Ques18;

@FunctionalInterface
public interface EmployeeFactory {
    public abstract Employee getEmployee(String name, Integer age, String city);
}
