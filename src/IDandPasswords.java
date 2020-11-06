import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("student","alatoo");
        logininfo.put("Ruslan","best");
        logininfo.put("abc","123");
        logininfo.put("1","1");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
