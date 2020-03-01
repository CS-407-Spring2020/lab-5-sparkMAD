package c.sakshi.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.provider.ContactsContract.CommonDataKinds.Note;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main3Activity extends AppCompatActivity {

    int noteid = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        EditText editText2 = (EditText) findViewById(R.id.editText2);
//        Intent intent = getIntent();
//        int a = intent.getIntExtra("noteid", noteid);
//        noteid = a;
//
//        if (noteid != -1) {
//            Note note = Main2Activity.notes.get(noteid);
//            String noteContent = note.getContent();
//            editText2.setText(noteContent);
//        }
    }

    public void saveMethod(View view) {
        EditText editText2 = (EditText) findViewById(R.id.editText2);
//        Context context = getApplicationContext();
//        SQLiteDatabase sqLiteDatabase = context.openOrCreateDatabase("notes",
//                Context.MODE_PRIVATE,null);
//        DBHelper dbHelper = new DBHelper(sqLiteDatabase);
//
//        SharedPreferences newPref = getSharedPreferences("c.sakshi.lab5", Context.MODE_PRIVATE);
//        String username = newPref.getString("username", "");
//        String title;
//        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//        String date = dateFormat.format(new Date());
//
//        if (noteid == -1) {
//            String content = Main2Activity.notes.get(noteid).getContent();
//            title = "NOTE_" + (Main2Activity.notes.size() + 1);
//            dbHelper.saveNotes(username, title, content, date);
//        } else {
//            String content = Main2Activity.notes.get(noteid).getContent();
//            title = "NOTE_" + (noteid + 1);
//            dbHelper.updateNote(title, date, content, username);
//        }

        Intent threeInt = new Intent(this, Main2Activity.class);
//        Log.i("notes","notes: " + s);
//        threeInt.putExtra("message", s);
        startActivity(threeInt);
    }
}
