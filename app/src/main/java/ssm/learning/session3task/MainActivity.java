package ssm.learning.session3task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button show_name_button=(Button)findViewById(R.id.show_name_button);
        show_name_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name_text=findViewById(R.id.name_text);
                Toast.makeText(MainActivity.this,"Your name is : "+name_text.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}