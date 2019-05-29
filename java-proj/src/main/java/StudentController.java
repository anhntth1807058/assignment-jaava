import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList();
    HashMap<String,Student> hashMap = new HashMap<String, Student>();
    void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập enrollID sinh viên");
        String id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("nhập tên sinh viên");
        String fullname = scanner.nextLine();
        System.out.println("nhập tuổi sinh viên");
        int age = scanner.nextInt();
        Student student = new Student(id,fullname,age);
        list.add(student);
    }

    public void savestudent() throws IOException {
        FileWriter fw = new FileWriter("src\\main\\resources\\students.dat");
        fw.write("EnrolID\t\t");
        fw.write("FullName\t\t");
        fw.write("Age\n");
        for (String m: hashMap.keySet()) {
            System.out.println("ID :" + m);
            System.out.println("FullName :" + hashMap.get(m).getFullname());
            System.out.println("Age :" + hashMap.get(m).getAge());
            fw.write(m);
            fw.write("\t\t");
            fw.write(hashMap.get(m).getFullname());
            fw.write("\t\t");
            fw.write(hashMap.get(m).getAge());
            fw.write("\n");
        }
        fw.close();
    }

    void printList() {
        System.out.println("EnrollID |    Full Name    |  Age ");
        System.out.println("---------  ---------------- ------");
        for(int i = 0; i < list.size(); ++i) {
            Student st =  list.get(i);
            System.out.printf("%8s | %15s | %8s\n ",st.getEnrollid(),st.getFullname(), st.getAge());
        }
    }
}