package c.sakshi.lab5;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        Log.i("befor setText", "msg " + intent.getStringExtra("message"));
        String str = intent.getStringExtra("message");
        SharedPreferences newPref = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);
        textView2.setText("Welcome " + str);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    public void goToActivityOne(String s) {
        Intent intent = new Intent(this, MainActivity.class);
        Log.i("intent msg for back","username: " + s);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Logout:
                  Intent intent = new Intent(this, MainActivity.class);
                SharedPreferences sharedPreferences = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);
                sharedPreferences.edit().remove(MainActivity.usernameKey).apply();
                startActivity(intent);
//                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
//                EditText myTextField = (EditText) findViewById(R.id.editText);
//                Log.i("msg for back","test msg" + myTextField.getText().toString());
//                String str = myTextField.getText().toString();
//                goToActivityOne(str);
                return true;
            case R.id.AddNote:
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }
}
