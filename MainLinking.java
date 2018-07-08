package in.pacasian.sumithkumar.q;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainLinking extends AppCompatActivity {
    EditText ed1,ed2;
    Button btn;
    DatabaseHelper myDB;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlinking);
        myDB = new DatabaseHelper(this);
        btn=(Button)findViewById(R.id.btn);
        ed1=(EditText)findViewById(R.id.name);
        ed1=(EditText)findViewById(R.id.phone);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  String st98 = ed1.getText().toString();
                String st99 = ed2.getText().toString();
                if (TextUtils.isEmpty(st98) && TextUtils.isEmpty(st99)) {
                    ed98.setError("Please fill the blank");
                    ed99.setError("Please fill the blank");
                } else {

                    Boolean result = myDB.insertData(st98, st99);
                    if (result != true) {

                        Toast.makeText(SignInActivity.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
                    }
                    signin();
                }

            }
    });
}
}
