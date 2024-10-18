package com.example.apilecture;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.apilecture.modalclass.Root;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RetrofitInstance retrofitInstance = new RetrofitInstance();

                Call<Root> call = retrofitInstance.instance().alldata();

                call.enqueue(new Callback<Root>() {
                    @Override
                    public void onResponse(Call<Root> call, Response<Root> response) {

                        Log.d("+-+-+-", "onResponse: "+response.body().products.get(0).description);
                        Log.d("+-+-+-", "onResponse: "+response.body().products.get(0).title);
                    }

                    @Override
                    public void onFailure(Call<Root> call, Throwable throwable) {

                        Log.d("+-+-+-", "onFailure: "+throwable.getLocalizedMessage());

                    }
                });
            }
        });

    }
}