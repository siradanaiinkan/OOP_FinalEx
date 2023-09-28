import java.util.ArrayList;

interface Job {
    String getPosition();
    void setPosition(String Position);
    String getEmpID();
    void setEmpID(String EmpID);
}

interface Person {
    String getName();
    void setName(String Name);
    double getAge();
    void setAge(double Age);
}

class Employee implements Person, Job {
    private String Name;
    private double Age;
    private String Position;
    private String EmpID;
    private String project;

    Employee(String Name, String Position, String EmpID, String project) {
        this.Name = Name;
        this.Position = Position;
        this.EmpID = EmpID;
        this.project = project;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public double getAge() {
        return Age;
    }

    @Override
    public void setAge(double Age) {
        this.Age = Age;
    }

    @Override
    public String getPosition() {
        return Position;
    }

    @Override
    public void setPosition(String Position) {
        this.Position = Position;
    }

    @Override
    public String getEmpID() {
        return EmpID;
    }

    @Override
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void showDetails() {
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Position: " + Position);
        System.out.println("Employee EmpID: " + EmpID);
        System.out.println("Project: " + project);
        System.out.println();
    }
}

public class FinalEx {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Tom", "Developer", "EMP001", "Web A:Developing a web application Moblie app A:developing a moblie app"));
        employees.add(new Employee("Tim", "Designer", "EMP002", "Web A:Developing a web application"));
        
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }
}
