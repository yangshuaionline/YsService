package yang.shuai.ysservice.dao;

import org.json.JSONObject;

public class User {
    private int id;
    private String head_pic;
    private String user_name;
    private String account;
    private String pw;

    @Override
    public String toString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("account",account);
        jsonObject.put("pw",pw);
        return jsonObject.toString();
    }

    public int getId() {
        return id;
    }

    public String getHead_pic() {
        return head_pic;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getAccount() {
        return account;
    }

    public String getPw() {
        return pw;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHead_pic(String head_pic) {
        this.head_pic = head_pic;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
