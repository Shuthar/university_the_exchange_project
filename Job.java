public class Job {
    private String jobTitle;
    private String jobDescription;
    private int salary;
    private String employer;

    public Job(String jobTitle, String jobDescription, int salary, String employer) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.salary = salary;
        this.employer = employer;
    }

    // геттеры
    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployer() {
        return employer;
    }

    // сеттеры
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }
}