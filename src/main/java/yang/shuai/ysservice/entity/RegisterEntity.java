package yang.shuai.ysservice.entity;


import org.json.JSONException;
import org.json.JSONObject;

public class RegisterEntity {
    //账号
    private String account;
    //密码
    private String pw;
    //重复密码
    private String repw;

    @Override
    public String toString() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("account", account);
            jsonObject.put("pw", pw);
            jsonObject.put("repw", repw);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }

    public String getAccount() {
        return account;
    }

    public String getPw() {
        return pw;
    }

    public String getRepw() {
        return repw;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setRepw(String repw) {
        this.repw = repw;
    }
}
