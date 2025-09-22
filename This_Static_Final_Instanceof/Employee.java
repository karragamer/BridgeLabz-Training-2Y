class Employee {
    private String name;
    private final int id;
    private String designation;

    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101, "Manager");
        Employee e2 = new Employee("Sneha", 102, "Developer");

        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
