package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeController controller = new CakeController((CakeView) findViewById(R.id.cakeview));

        View blowOutButton = findViewById(R.id.blowOutButton);
        blowOutButton.setOnClickListener(controller);

        CompoundButton candleSwitch = (CompoundButton) findViewById(R.id.candlesSwitch);
        candleSwitch.setOnCheckedChangeListener(controller);

        SeekBar candleBar = findViewById(R.id.howManySeek);
        candleBar.setOnSeekBarChangeListener(controller);


    }

    public void goodbye(View button) {
        Log.i("button", "goodbye");

        finishAffinity();

    }
}
