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
    private ArrayList<String> projects;

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

    public ArrayList<String> getProjects() {
        return projects;
    }

    public void addProject(String project) {
        projects.add(project);
    }

    public void showDetails() {
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Position: " + Position);
        System.out.println("Employee EmpID: " + EmpID);
        System.out.println("Employee Projects: " + projects);
        System.out.println();
    }
}

class Project {
    private ArrayList<Employee> myProject;
    private String description; 
    private String projectDescription;

    public Project(String description, String projectDescription) { 
        this.myProject = new ArrayList<>();
        this.description = description; 
        this.projectDescription = projectDescription; 
    }

    public void addEmployeeToProject(Employee employee) {
        myProject.add(employee);
    }

    public ArrayList<Employee> getMyProject() {
        return myProject;
    }

    public void setMyProject(ArrayList<Employee> myProject) {
        this.myProject = myProject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    
    public void showDetails() {
        System.out.println("Project Description: " + description);
        System.out.println("Project's Own Description: " + projectDescription); 
        for (Employee employee : myProject) {
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Position: " + employee.getPosition());
            System.out.println("Employee EmpID: " + employee.getEmpID());
            System.out.println(); 
            
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Project project = new Project("Developing a web application", "Web project description"); 
        
        Employee tom = new Employee("Tom", "Developer", "EMP001");
        Employee tim = new Employee("Tim", "Designer", "EMP002");

        project.addEmployeeToProject(tom);
        project.addEmployeeToProject(tim);

        tom.showDetails();
        tim.showDetails();
    }
}
