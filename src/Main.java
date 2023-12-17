import Models.student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        student std1 = new student();

        std1.setName("Nishant Adhikari");
        std1.setAge(18);
        int[] std1_marks = {92, 80, 90};
        std1.setMarks(std1_marks);

        student std2 = new student();

        std2.setName("Shyam Singh Roy");
        std2.setAge(17);
        int[] std2_marks ={70, 80, 60};
        std2.setMarks(std2_marks);

        student std3 = new student();

        std3.setName("Bobby Deol");
        std3.setAge(17);
        int[] std3_marks ={80, 89, 91};
        std3.setMarks(std3_marks);

        std1.ResultDisplayer(std1.getName(), std1.getAge(), std1.getMarks(),std1.getGrade());
        std2.ResultDisplayer(std2.getName(), std2.getAge(), std2.getMarks(),std2.getGrade());
        std3.ResultDisplayer(std3.getName(), std3.getAge(), std3.getMarks(),std3.getGrade());

    }
}
