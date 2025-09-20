import java.util.Scanner;

interface department {
    String deptname = "CS", depthead = "X";
    void showdata();
}

class read {
    static Scanner cin = new Scanner(System.in);
}

class hostel {
    String hostelname, hostellocation;
    int noofrooms;

    void readdata() {
        System.out.println("\nEnter your Hostel Details:");
        System.out.print("Hostel Name: ");
        hostelname = read.cin.nextLine();
        System.out.print("Hostel Location: ");
        hostellocation = read.cin.nextLine();
        System.out.print("No of Rooms: ");
        noofrooms = read.cin.nextInt();
    }

    void print() {
        System.out.println("\nHostel Details");
        System.out.println("-----------------------");
        System.out.println("Hostel Name: " + hostelname);
        System.out.println("Hostel Location: " + hostellocation);
        System.out.println("No of Rooms: " + noofrooms);
    }
}

class student extends hostel implements department {
    String studname, electivesub;
    int regno;

    void readdata() {
        System.out.println("\nEnter your Student Details:");
        System.out.print("Name: ");
        studname = read.cin.nextLine();
        System.out.print("Elective Subject: ");
        electivesub = read.cin.nextLine();
        System.out.print("ID: ");
        regno = read.cin.nextInt();
        read.cin.nextLine(); // consume leftover newline
        super.readdata();
        showdata();
    }

    public void showdata() {
        System.out.println("\nStudent Details");
        System.out.println("-----------------------");
        System.out.println("Name: " + studname);
        System.out.println("Elective Subject: " + electivesub);
        System.out.println("ID: " + regno);
        System.out.println("Department: " + deptname);
        System.out.println("Head of Department: " + depthead);
        print();
    }

    public static void main(String args[]) {
        student s = new student();
        s.readdata();
    }
}
