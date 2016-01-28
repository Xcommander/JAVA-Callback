/**
 * Created by xulinchao on 2016/1/28.
 */
public class Boss implements CallbackInterface{
    @Override
    public void execute() {

        System.out.print("收到了！"+System.currentTimeMillis());
    }
}
