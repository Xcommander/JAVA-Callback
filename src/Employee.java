/**
 * Created by xulinchao on 2016/1/28.
 */
public class Employee {
    public void setCallbackInterface(CallbackInterface callbackInterface) {
        this.callbackInterface = callbackInterface;
    }

    private CallbackInterface callbackInterface=null;
    public void doSomething(){
        for(int i=0;i<10;i++){
            System.out.println("我已经做了完了第"+i+"事了");
        }
        callbackInterface.execute();
    }

    public Employee() {
        super();
    }
}
