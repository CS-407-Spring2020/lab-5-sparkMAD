package c.sakshi.lab5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.provider.ContactsContract.CommonDataKinds.Note;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    public static ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
//        Log.i("befor setText", "msg " + intent.getStringExtra("message"));
        String str = intent.getStringExtra("message");
        SharedPreferences newPref = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);
        if (!newPref.getString("username", "").equals("")) {
            newPref.getString("username", "");
        }
        textView.setText("Welcome " + str);

//        ArrayList<String> displayNotes = new ArrayList<>();
//        for (Note note : notes) {
//            displayNotes.add(String.format("Title:%s\nDate:%s", note.getTitle(), note.getDate()));
//        }
//
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, displayNotes);
//        ListView listView = (ListView) findViewById(R.id.notesListView);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
//                intent.putExtra("noteid", position);
//                startActivity(intent);
//            }
//        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

//    public void goToActivityOne(String s) {
//        Intent intent = new Intent(this, MainActivity.class);
//        Log.i("intent msg for back","username: " + s);
//        intent.putExtra("message", s);
//        startActivity(intent);
//    }

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
                Intent newInt = new Intent(this, Main3Activity.class);
//                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                startActivity(newInt);
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }
}
