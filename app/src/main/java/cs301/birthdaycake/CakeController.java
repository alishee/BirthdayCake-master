package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cakeViewInstance) {
        cakeView = cakeViewInstance;
        cakeModel = cakeView.getCakeModel();

    }

    @Override
    public void onClick(View view) {
        Log.d("d", "logged");
        cakeModel.candlesLit = !(cakeModel.candlesLit);
        cakeView.invalidate();


    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModel.candlesExist = !(cakeModel.candlesExist);
        cakeView.invalidate();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.numCandles = i;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
