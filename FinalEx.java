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
    private ArrayList<Project> projects;

    Employee(String Name, String Position, String EmpID) {
        this.Name = Name;
        this.Position = Position;
        this.EmpID = EmpID;
        this.projects = new ArrayList<>();
        
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

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void showDetails() {
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Position: " + Position);
        System.out.println("Employee EmpID: " + EmpID);
        System.out.println("Projects: "); 
        for (int i = 0; i < projects.size(); i++) {
            System.out.println(projects.get(i).getProgect());
        }
}
}
class Project {
    private String project1; 
    private String projectDescription;

    public Project(String project1, String projectDescription) { 
        this.project1 = project1; 
        this.projectDescription = projectDescription; 
    }

    public String getProgect(){
        return project1 + ":"+projectDescription; 

    }
}

public class FinalEx {
    public static void main(String[] args) {
        Project project = new Project("WEB A", "Web project description"); 
        Project projec1 = new Project("Mobile A", "Web project description"); 
        Employee tom = new Employee("Tom", "UX/Ui", "EMP001");
        Employee tim = new Employee("Tim", "FontEnd", "EMP002");

        tom.addProject(project);
        tom.addProject(projec1);
        tim.addProject(project);
        tom.showDetails(); 
        tim.showDetails();
    }
}
