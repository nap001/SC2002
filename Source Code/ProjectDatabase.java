import java.util.List;
import java.util.ArrayList;

public class ProjectDatabase {
    private List<Project> projects; // List of projects in the database

    // Constructor to initialize the list
    public ProjectDatabase() {
        this.projects = new ArrayList<>();
    }

    // Add a project to the database
    public void addProject(Project project) {
        projects.add(project);
    }

    // Remove a project from the database (can only be called by HDBManager)
    public void removeProject(HDBManager manager, Project project) {
        if (manager == project.getHdbManager()) {
            projects.remove(project);
            project.delete(); // Delete project details after removal
        } else {
            System.out.println("Access Denied: Only the assigned HDBManager can remove this project.");
        }
    }

    // Other methods to query or interact with the projects...
}
