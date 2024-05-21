public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void addJob(JobMarket jobMarket, Job job) {
        jobMarket.addJob(job);
    }
}