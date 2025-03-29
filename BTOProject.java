import java.util.Date;

class Project {
    private String projectName;
    private String neighborhood;
    private int twoRoomUnits;
    private int threeRoomUnits;
    private Date openDate;
    private Date closeDate;
    private boolean isVisible;
    private HDBManager manager;
    private int availableOfficerSlots;
    private List<HDBOfficer> officers;

    public BTOProject(String projectName, String neighborhood, int twoRoomUnits, int threeRoomUnits, Date openDate, Date closeDate, HDBManager manager) {
        this.projectName = projectName;
        this.neighborhood = neighborhood;
        this.twoRoomUnits = twoRoomUnits;
        this.threeRoomUnits = threeRoomUnits;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.manager = manager;
        this.isVisible = true;
        this.availableOfficerSlots = 10;
        this.officers = new ArrayList<>();
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    public void setTwoRoomUnits(int twoRoomUnits) {
        this.twoRoomUnits = twoRoomUnits;
    }
    public void setThreeRoomUnits(int threeRoomUnits) {
        this.threeRoomUnits = threeRoomUnits;
    }
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }
    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }
    public int getAvailableOfficerSlots() {
        return availableOfficerSlots;
    }
    public void addHDBOfficer(HDBOfficer officer) {
        if (availableOfficerSlots > 0) {
            officers.add(officer);
            availableOfficerSlots--;
        }
    }
}