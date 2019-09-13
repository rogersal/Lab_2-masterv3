package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private CakeView kla;
    private CakeModel mod;
    public CakeController(CakeView k){
        kla = k;
        mod = k.getCakeModel();
    }
    @Override
    public void onClick(View v)
    {

        Log.d("button","Button was Clicked");
        kla.invalidate();
        mod.CandleIsLit = false;


    }
    @Override
    public  void onCheckedChanged( CompoundButton k , boolean isChecked){
        kla.invalidate();
        if(isChecked ==true){
            mod.hasCandles = false;
        }


    }

}
