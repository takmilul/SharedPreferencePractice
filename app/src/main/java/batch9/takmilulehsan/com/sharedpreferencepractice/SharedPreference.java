package batch9.takmilulehsan.com.sharedpreferencepractice;


import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

public class SharedPreference {
    public static final String NAME = "Name";
    public static final String PASSWORD = "Password";
    Context context;
    SharedPreferences.Editor editor;
    private SharedPreferences sharedPreferences;
    private String name;

    public SharedPreference(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("Takmilul", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void save(String name, String password) {
        //Toast.makeText(context,name,Toast.LENGTH_SHORT).show();
        editor.putString(NAME, name);
        editor.putString(PASSWORD, password);
        editor.commit();
    }

    public HashMap<String, String> show() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(NAME, sharedPreferences.getString(NAME, null));
        hashMap.put(PASSWORD, sharedPreferences.getString(PASSWORD, null));
        return hashMap;
    }
}
