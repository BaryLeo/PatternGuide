package mvc;

/**
 * Controller作为中间人，控制V与M层交互
 */
public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;
    }

    /**
     * 从一般来说，是用户通过V层传入，V层再通知C层，这一步骤不进行模拟
     * @param name
     */
    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    /**
     * 当M层有改变的时候，C层则会通知V层改变，这里增加一个观察者模式更好，当M层有改变时，也会主动通知C层
     */
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
