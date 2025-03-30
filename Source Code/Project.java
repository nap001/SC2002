import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Project {
    private String projectID;
    private String projectName;
    private String neighbourhood;
    private LocalDate applicationOpenDate;
    private LocalDate applicationCloseDate;
    private boolean visibility;
    private int officerSlots;
    private Map<FlatType, Integer> availableUnits;
    private HDBManager hdbManager;
    private List<Enquiry> enquiries;
    private List<Applicant> applicants;
    private List<HDBOfficer> hdbOfficers;

    public Project(String projectID, String projectName, String neighbourhood, LocalDate applicationOpenDate,
                   LocalDate applicationCloseDate, boolean visibility, int officerSlots,
                   Map<FlatType, Integer> availableUnits, HDBManager hdbManager) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.neighbourhood = neighbourhood;
        this.applicationOpenDate = applicationOpenDate;
        this.applicationCloseDate = applicationCloseDate;
        this.visibility = visibility;
        this.officerSlots = officerSlots;
        this.availableUnits = availableUnits;
        this.hdbManager = hdbManager;
    }

    public int getRemainingUnits(FlatType flatType) {
        return availableUnits.getOrDefault(flatType, 0);
    }

    public boolean assignOfficer(HDBOfficer officer) {
        if (hdbOfficers.size() < officerSlots) {
            hdbOfficers.add(officer);
            return true;
        }
        return false;
    }

    // Getters and Setters
    public String getProjectID() { return projectID; }
    public void setProjectID(String projectID) { this.projectID = projectID; }
    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }
    public String getNeighbourhood() { return neighbourhood; }
    public void setNeighbourhood(String neighbourhood) { this.neighbourhood = neighbourhood; }
    public LocalDate getApplicationOpenDate() { return applicationOpenDate; }
    public void setApplicationOpenDate(LocalDate applicationOpenDate) { this.applicationOpenDate = applicationOpenDate; }
    public LocalDate getApplicationCloseDate() { return applicationCloseDate; }
    public void setApplicationCloseDate(LocalDate applicationCloseDate) { this.applicationCloseDate = applicationCloseDate; }
    public boolean isVisibility() { return visibility; }
    public void setVisibility(boolean visibility) { this.visibility = visibility; }
    public int getOfficerSlots() { return officerSlots; }
    public void setOfficerSlots(int officerSlots) { this.officerSlots = officerSlots; }
    public Map<FlatType, Integer> getAvailableUnits() { return availableUnits; }
    public void setAvailableUnits(Map<FlatType, Integer> availableUnits) { this.availableUnits = availableUnits; }
    public HDBManager getHdbManager() { return hdbManager; }
    public void setHdbManager(HDBManager hdbManager) { this.hdbManager = hdbManager; }
    public List<Enquiry> getEnquiries() { return enquiries; }
    public void setEnquiries(List<Enquiry> enquiries) { this.enquiries = enquiries; }
    public List<Applicant> getApplicants() { return applicants; }
    public void setApplicants(List<Applicant> applicants) { this.applicants = applicants; }
    public List<HDBOfficer> getHdbOfficers() { return hdbOfficers; }
    public void setHdbOfficers(List<HDBOfficer> hdbOfficers) { this.hdbOfficers = hdbOfficers; }
}