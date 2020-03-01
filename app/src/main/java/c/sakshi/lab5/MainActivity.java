package c.sakshi.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    static String usernameKey = "username";
    public void clickFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editText);
        Log.i("first", "msg is " + myTextField.getText().toString());
        String str = myTextField.getText().toString();

        SharedPreferences sharedPreferences = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username", str).apply();

        goToActivity2(str);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Main2Activity.class);
//        Log.i("intent msg","username: " + s);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);

        if (!sharedPreferences.getString("username", "").equals("")) {
            String str = sharedPreferences.getString("username", "");
            goToActivity2(str);
        } else {
            setContentView(R.layout.activity_main);

        }
    }
}
