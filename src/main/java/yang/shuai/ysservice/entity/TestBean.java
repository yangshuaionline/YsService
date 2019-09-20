package yang.shuai.ysservice.entity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class TestBean {
    private long id;
    private String userName;
    private String password;
    private int age;
    private String phoneNumber;
    private String headPicture;
    private Date addDate;
    private Date updateDate;
    private int state;

    @Override
    public String toString() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id",id);
            jsonObject.put("userName",userName);
            jsonObject.put("password",password);
            jsonObject.put("age",age);
            jsonObject.put("phoneNumber",phoneNumber);
            jsonObject.put("headPicture",headPicture);
            jsonObject.put("addDate",addDate);
            jsonObject.put("updateDate",updateDate);
            jsonObject.put("state",state);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public Date getAddDate() {
        return addDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public int getState() {
        return state;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setState(int state) {
        this.state = state;
    }
}
