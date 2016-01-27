package in.saathitech.buttonpress;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    Button bt;
    Button bt2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.button);
        bt2 = (Button)findViewById(R.id.button2);

        txt = (TextView) findViewById(R.id.textView);

        bt.setOnClickListener(this);
        bt2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.button: Toast.makeText(this,"Button 1 Clicked", Toast.LENGTH_LONG).show();
               break;

           case R.id.button2:
               Toast.makeText(MainActivity.this, txt.getText(), Toast.LENGTH_SHORT).show();

       }
    }
}
