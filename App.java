import java.util.Scanner;

public class App {
    private JobMarket jobMarket;
    private User currentUser;

    public App() {
        this.jobMarket = new JobMarket();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Login\n2. View Jobs\n3. Add Job\n4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter username: ");
                    String username = scanner.next();

                    System.out.println("Enter password: ");
                    String password = scanner.next();

                    // Mock login process
                    if (username.equals("admin")) {
                        currentUser = new Admin(username, password);
                    } else {
                        currentUser = new Client(username, password);
                    }
                    break;

                case 2:
                    if (currentUser instanceof Client) {
                        ((Client) currentUser).viewJobs(jobMarket);
                    } else {
                        System.out.println("Only clients can view jobs!");
                    }
                    break;

                case 3:
                    if (currentUser instanceof Admin) {
                        System.out.println("Enter job title: ");
                        String jobTitle = scanner.next();

                        System.out.println("Enter job description: ");
                        String jobDescription = scanner.next();

                        System.out.println("Enter salary: ");
                        int salary = scanner.nextInt();

                        System.out.println("Enter employer: ");
                        String employer = scanner.next();

                        Job job = new Job(jobTitle, jobDescription, salary, employer);
                        ((Admin) currentUser).addJob(jobMarket, job);
                    } else {
                        System.out.println("Only admins can add jobs!");
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new App().start();
    }
}