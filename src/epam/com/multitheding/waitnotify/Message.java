package epam.com.multitheding.waitnotify;

/**
 * Created by Ermek_Abyshev on 3/16/2017.
 */
public class Message {

    private String msg;

    public Message(String str) {
        this.msg = str;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
