import java.util.*;

public class HDBManager {
    private List<Project> projects;

    public HDBManager() {
        this.projects = new ArrayList<>();
    }

    public void createProject(Project project) {
        projects.add(project);
        System.out.println("Project created: " + project.getProjectName());
    }

    public void editProject(int projectID, Project updatedProject) {
        for (Project project : projects) {
            if (project.getProjectID() == projectID) {
                projects.set(projects.indexOf(project), updatedProject);
                System.out.println("Project updated: " + updatedProject.getProjectName());
                return;
            }
        }
        System.out.println("Project not found.");
    }

    public void deleteProject(int projectID) {
        projects.removeIf(project -> project.getProjectID() == projectID);
        System.out.println("Project deleted: " + projectID);
    }

    public void toggleProjectVisibility(int projectID, boolean isVisible) {
        for (Project project : projects) {
            if (project.getProjectID() == projectID) {
                project.setVisible(isVisible);
                System.out.println("Project visibility updated: " + isVisible);
                return;
            }
        }
        System.out.println("Project not found.");
    }

    public void approveOfficerRegistration(int registrationID) {
        System.out.println("Officer registration approved: " + registrationID);
    }

    public void approveApplication(int applicationID) {
        System.out.println("Application approved: " + applicationID);
    }

    public void approveWithdrawal(int applicationID) {
        System.out.println("Withdrawal approved: " + applicationID);
    }

    public Report generateReport(Map<String, String> filters) {
        Report report = new Report(this, filters);
        System.out.println("Report generated with filters: " + filters);
        return report;
    }
}