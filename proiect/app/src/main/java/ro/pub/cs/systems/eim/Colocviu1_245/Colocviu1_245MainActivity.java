package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Colocviu1_245MainActivity extends AppCompatActivity {

    private EditText leftEditText;
    private EditText rightEditText;
    private Button addButton;
    private Button computeButton;

    private String allTerms = "";

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int leftNumberOfClicks = Integer.valueOf(leftEditText.getText().toString());
            int rightNumberOfClicks = Integer.valueOf(rightEditText.getText().toString());

            switch(view.getId()) {
                case R.id.add_button:
                    int x = Integer.valueOf(leftEditText.getText().toString());
                    if(allTerms.equals(""))
                        allTerms += x;
                    else
                        allTerms += "+" + x;
                    leftEditText.setText("");
                    break;
                case R.id.compute_button:
                    rightEditText.setText(allTerms);
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_245_main);

        leftEditText = (EditText)findViewById(R.id.left_edit_text);
        rightEditText = (EditText)findViewById(R.id.right_edit_text);
        addButton = (Button)findViewById(R.id.add_button);
        addButton.setOnClickListener(buttonClickListener);
        computeButton = (Button)findViewById(R.id.compute_button);
        computeButton.setOnClickListener(buttonClickListener);
    }
}
