package student;

public class MVCMainPatternTest {
 public static void main(String[] args) {
     Student student = new Student("John Doe", "S123", "A");

     StudentView view = new StudentView();

     StudentController controller = new StudentController(student, view);

     controller.updateView();

     controller.setSName("Neeha");
     controller.setSId("S513");
     controller.setSGrade("A");

     controller.updateView();
 }
}

