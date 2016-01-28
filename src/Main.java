/**
 * Created by xulinchao on 2016/1/28.
 */
public class Main {

    public static void main(String[] args) {
        Employee employee=new Employee();
        /*很类似于android的监听函数*/
        employee.setCallbackInterface(new Boss(){
            @Override
            public  void execute(){
                System.out.print("11111");
            }
        });
        employee.doSomething();

    }
}
