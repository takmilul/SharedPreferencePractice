package batch9.takmilulehsan.com.sharedpreferencepractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    SharedPreference preference;

    @Bind(R.id.passwordEt)
    EditText passwordEt;
    @Bind(R.id.userNameEt)
    EditText nameEt;
    @Bind(R.id.userNameTv)
    TextView nameTv;
    @Bind(R.id.passwordTv)
    TextView passwordTv;
    @Bind(R.id.saveBtn)
    Button saveBtn;
    @Bind(R.id.showBtn)
    Button showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        preference = new SharedPreference(this);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preference.save(nameEt.getText().toString(), passwordEt.getText().toString());
            }
        });

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, String> map;
                map = preference.show();
                nameTv.setText(map.get(SharedPreference.NAME));
                passwordTv.setText(map.get(SharedPreference.PASSWORD));
            }
        });
    }
//minor changes for git command

}
