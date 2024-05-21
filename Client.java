public class Client extends User {
    public Client(String username, String password) {
        super(username, password);
    }

    public void viewJobs(JobMarket jobMarket) {
        jobMarket.displayJobs();
    }
}