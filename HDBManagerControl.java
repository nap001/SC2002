// HDBManagerControl class
class HDBManagerControl {
    private HDBManager manager;

    public HDBManagerControl(HDBManager manager) {
        this.manager = manager;
    }

    public void createProject(String name, String neighborhood, int twoRoomUnits, int threeRoomUnits, Date openDate, Date closeDate) {
        BTOProject project = new BTOProject(name, neighborhood, twoRoomUnits, threeRoomUnits, openDate, closeDate, manager);
        ProjectDatabase.addProject(project);
        System.out.println("Project created: " + name);
    }

    public void editProject(BTOProject project, String newName, String newNeighborhood, int newTwoRoomUnits, int newThreeRoomUnits, Date newOpenDate, Date newCloseDate) {
        project.setProjectName(newName);
        project.setNeighborhood(newNeighborhood);
        project.setTwoRoomUnits(newTwoRoomUnits);
        project.setThreeRoomUnits(newThreeRoomUnits);
        project.setOpenDate(newOpenDate);
        project.setCloseDate(newCloseDate);
        System.out.println("Project updated: " + newName);
    }

    public void deleteProject(BTOProject project) {
        ProjectDatabase.removeProject(project);
        System.out.println("Project deleted: " + project.getProjectName());
    }

    public void toggleProjectVisibility(BTOProject project, boolean visibility) {
        project.setVisible(visibility);
        System.out.println("Project visibility set to: " + visibility);
    }

    public void approveOfficer(HDBOfficer officer, BTOProject project, boolean approve) {
        if (approve && project.getAvailableOfficerSlots() > 0) {
            project.addHDBOfficer(officer);
            System.out.println("HDB Officer approved: " + officer.getNRIC());
        } else {
            System.out.println("Officer registration rejected or no slots available.");
        }
    }

    public void approveApplication(Applicant applicant, BTOApplication application, boolean approve) {
        if (approve) {
            application.setStatus("Successful");
        } else {
            application.setStatus("Unsuccessful");
        }
        System.out.println("Application status updated for applicant: " + applicant.getNRIC());
    }
}