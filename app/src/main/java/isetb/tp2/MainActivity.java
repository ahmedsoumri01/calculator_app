package isetb.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText chiffre1Input;
    EditText chiffre2Input;
    TextView resultTextView;
    ImageView resultImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize attributes
        chiffre1Input = findViewById(R.id.chiffre1Input);
        chiffre2Input = findViewById(R.id.chiffre2Input);
        resultTextView = findViewById(R.id.r);
        resultImg = findViewById(R.id.resultImg);
    }


    public void sum(View v) {
        int num1 = Integer.parseInt(chiffre1Input.getText().toString());
        int num2 = Integer.parseInt(chiffre2Input.getText().toString());

        int result = num1 + num2;

        resultTextView.setText(String.valueOf(result));
    }

    public void difference(View v) {
        int num1 = Integer.parseInt(chiffre1Input.getText().toString());
        int num2 = Integer.parseInt(chiffre2Input.getText().toString());

        int result = num1 - num2;

        resultTextView.setText(String.valueOf(result));
    }

    public void product(View v) {
        int num1 = Integer.parseInt(chiffre1Input.getText().toString());
        int num2 = Integer.parseInt(chiffre2Input.getText().toString());

        int result = num1 * num2;

        resultTextView.setText(String.valueOf(result));
    }

    public void division(View v) {
        int num1 = Integer.parseInt(chiffre1Input.getText().toString());
        int num2 = Integer.parseInt(chiffre2Input.getText().toString());

        if (num2 != 0) {
            int result = num1 / num2;
            resultTextView.setText(String.valueOf(result));
        } else {
            resultTextView.setText("Cannot divide by zero");
        }
    }
}