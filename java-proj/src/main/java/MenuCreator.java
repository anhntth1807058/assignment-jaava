import java.io.IOException;
import java.util.Scanner;

public class MenuCreator {
    public void createMenu() throws IOException {
        StudentController studentController = new StudentController();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Thêm sinh viên. ");
            System.out.println("2. Lưu sinh viên. ");
            System.out.println("3. Hiển thị danh sách sinh viên. ");
            System.out.println("4. Thoát chương trình.  ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    studentController.addStudent();
                    System.out.println("Thêm sinh viên thành công.");
                    break;
                case 2:
                    studentController.savestudent();
                    System.out.println("Lưu sinh viên thành công");
                    break;
                case 3:
                    studentController.printList();
                    break;
                case 4:
                    System.out.println("Hẹn Gặp Lại!");
                    System.exit(1);
                    break;
            }
        }
    }
}
