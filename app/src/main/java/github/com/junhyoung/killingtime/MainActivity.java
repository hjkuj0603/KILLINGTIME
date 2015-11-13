package github.com.junhyoung.killingtime;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Popup_Producer(View view){
        Toast toast=Toast.makeText(getApplicationContext(),"조장 정찬형",Toast.LENGTH_LONG);
        ImageView imageView=new ImageView(getApplicationContext());
        imageView.setImageResource(R.drawable.jch);

        toast.setView(imageView);
        toast.setGravity(Gravity.CENTER,50,50);
        toast.setMargin(1000, 1000);
        toast.show();
    }
    public void Start(View v){
        Intent myintent = new Intent(getApplicationContext(),StartActivity.class);
        startActivity(myintent);
    }
    public void Recorder(View v){
        Intent myintent = new Intent(getApplicationContext(),RecordActivity.class);
        startActivity(myintent);
    }
    public void Exit(View v){
        finish();
    }


}
