package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, (byte)30);
        employees[1] = new Employee("Petrov Petr", "Designer", "ppetrov@mailbox.com", "833312312", 32000, (byte) 43);
        employees[2] = new Employee("Sidorov Ivan", "Developer", "isidorov@mailbox.com", "892312312", 45000, (byte) 35);
        employees[3] = new Employee("Ivanova Anna", "Developer", "aivanova@mailbox.com", "892312312", 50000, (byte) 45);
        employees[4] = new Employee("Petrova Elena", "Developer", "epetrova@mailbox.com", "892312312", 470000, (byte) 70);

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge()>=40){
                System.out.println(Employee.getInfo(employees[i]));
            }
        }
    }
}
