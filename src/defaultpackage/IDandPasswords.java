package defaultpackage;

import java.util.HashMap;

public class IDandPasswords {

    //we are going to use a hashmap as it's perfect for this
    //as the key will be the username and the value the password
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords(){
        logininfo.put("Ronan", "Behan");
        //you could add more if you wanted to
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
