package tw.com.flag.ch02_button;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size = 31; //字体大小, 初值 30(sp)


public  void  smaller(View aa) {

   TextView  txv;
    txv= (TextView) findViewById(R.id.txv);
}

    //TODO  jd9945
    public void bigger(View v) {
        TextView txv;
        TextView  aaa;

        aaa;
        aaa = (TextView)findViewById(R.id.txv);
        txv= (TextView) findViewById(R.id.txv);


        txv.setTextSize(++size);
    }

    public void smaller(View v) {
        TextView txv;
        txv = (TextView) findViewById(R.id.txv);
        txv.setTextSize(--size);
    }


}
