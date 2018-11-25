package com.example.love.solarswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;

public class Homepage extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    private static final String TAG = "Homepage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Log.d(TAG, "onCreate: Starting");

        Button Sellerbutn = (Button) findViewById(R.id.sellerbtn);


        Sellerbutn.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent(Homepage.this, SellerHome.class);
                                              startActivity(intent);
                                          }
                                      });

        Button Buyerbutn = (Button) findViewById(R.id.buyerbtn);
         Buyerbutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, BuyerHome.class);
                startActivity(intent);
            }




        });




//        ImageView View12 = (ImageView) findViewById(R.id.View12);
//        int imageResource = getResources().getIdentifier("@drawable/filogo", null, this.getPackageName());
//        View12.setImageResource(imageResource);

        // Example of a call to a native method

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
