package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView CV = findViewById(R.id.cakeview);
        CakeController CakeXL = new CakeController(CV);
        View butt = findViewById(R.id.button);
        CompoundButton switchCandle = findViewById(R.id.candles);
        butt.setOnClickListener(CakeXL);
        CakeXL.onCheckedChanged(switchCandle, true);


    }

    public void goodbye(View button) {
        System.out.println("Goodbye");
    }
}
