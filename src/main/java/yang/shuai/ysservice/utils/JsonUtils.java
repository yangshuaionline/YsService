package yang.shuai.ysservice.utils;

import org.json.JSONObject;

/**
 * json数据返回工具类
 * */
public class JsonUtils {
    public static JSONObject getJsonObj(int code, String msg, String data){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        jsonObject.put("data",data==null?"":data);
        return jsonObject;
    }
    /**
     * 返回成功数据
     * */
    public static String getSuccessJson(String msg){
        return getSuccessJson(msg,null);
    }
    public static String getSuccessJson(String msg,String data){
        JSONObject jsonObject = getJsonObj(KeyUtils.SUCCESS,msg,data);
        return jsonObject.toString();
    }
    public static String getSuccessJsonLimit(String msg,String data,boolean isNext){
        JSONObject jsonObject = getJsonObj(KeyUtils.SUCCESS,msg,data);
        jsonObject.put("next",isNext);
        return jsonObject.toString();
    }
    public static String getSuccessJsonLimitWithNumber(String msg,String data,boolean isNext,int maxnumber){
        JSONObject jsonObject = getJsonObj(KeyUtils.SUCCESS,msg,data);
        jsonObject.put("next",isNext);
        jsonObject.put("maxnumber",maxnumber);
        return jsonObject.toString();
    }

    /**
     * 返回失败数据
     * */
    public static String getFailtJson(String msg){
        return getFailtJson(msg,null);
    }
    public static String getFailtJson(String msg,String data){
        JSONObject jsonObject = getJsonObj(KeyUtils.FAILT,msg,data);
        return jsonObject.toString();
    }
    public static String getFailtJsonLimit(String msg,String data,boolean isNext){
        JSONObject jsonObject = getJsonObj(KeyUtils.FAILT,msg,data);
        jsonObject.put("next",isNext);
        return jsonObject.toString();
    }
    public static String getFailtJsonLimitWithNumber(String msg,String data,boolean isNext,int maxnumber){
        JSONObject jsonObject = getJsonObj(KeyUtils.FAILT,msg,data);
        jsonObject.put("next",isNext);
        jsonObject.put("maxnumber",maxnumber);
        return jsonObject.toString();
    }

}
