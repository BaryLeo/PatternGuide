package mvc;

public class MVCPatternDemo {
    public void runDemo(){
        System.out.println("MVC模式");
        //从数据库获取学生记录
        StudentModel model  = retrieveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static StudentModel retrieveStudentFromDatabase(){
        StudentModel student = new StudentModel();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
