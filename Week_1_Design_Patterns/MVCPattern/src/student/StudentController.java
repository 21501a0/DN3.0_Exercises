package student;

public class StudentController {
 private Student model;
 private StudentView view;

public StudentController(Student model, StudentView view) {
     this.model = model;
     this.view = view;
 }

 public void setSName(String name) {
     model.setName(name);
 }

 public String getSName() {
     return model.getName();
 }

 public void setSId(String id) {
     model.setId(id);
 }

 public String getSId() {
     return model.getId();
 }

 public void setSGrade(String grade) {
     model.setGrade(grade);
 }

 public String getSGrade() {
     return model.getGrade();
 }

 public void updateView() {
     view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
 }
}

