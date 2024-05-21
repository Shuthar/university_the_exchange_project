import java.util.ArrayList;
import java.util.List;

public class JobMarket {
    private List<Job> jobs;

    public JobMarket() {
        this.jobs = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public void removeJob(Job job) {
        jobs.remove(job);
    }

    public void displayJobs() {
        for (Job job : jobs) {
            System.out.println("Job Title: " + job.getJobTitle());
            System.out.println("Job Description: " + job.getJobDescription());
            System.out.println("Salary: " + job.getSalary());
            System.out.println("Employer: " + job.getEmployer());
            System.out.println("------------------");
        }
    }
}