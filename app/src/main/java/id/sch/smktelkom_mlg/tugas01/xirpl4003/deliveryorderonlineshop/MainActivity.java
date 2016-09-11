package id.sch.smktelkom_mlg.tugas01.xirpl4003.deliveryorderonlineshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etTelp;
    RadioButton rbJNE;
    RadioButton rbTIKI;
    CheckBox cb1, cb2, cb3, cb4;
    RadioGroup rgJS;
    Button bOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etTelp = (EditText) findViewById(R.id.editTextTelp);
        rgJS = (RadioGroup) findViewById(R.id.radioGrupJS);
        rbJNE = (RadioButton) findViewById(R.id.radioButtonJNE);
        rbTIKI = (RadioButton) findViewById(R.id.radioButtonTIKI);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);
        bOrder = (Button) findViewById(R.id.buttonOrder);

        bOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                doProcess();
                doClick();

            }
        });
    }

    private void doClick()
    {

    }

    private void doProcess() {
    }
}