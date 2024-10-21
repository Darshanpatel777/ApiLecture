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

import com.example.apilecture.GetRootNote.GetRootName;
import com.example.apilecture.NotesApi.NoteRoot;
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

                Call<GetRootName> call = retrofitInstance.instance().getnotes();

                call.enqueue(new Callback<GetRootName>() {
                    @Override
                    public void onResponse(Call<GetRootName> call, Response<GetRootName> response) {
                        Log.d("+-+-+-", "onResponse: " +response.body().data.get(4).title);
                    }

                    @Override
                    public void onFailure(Call<GetRootName> call, Throwable throwable) {
                        Log.d("+-+-+-", "onResponse: " +throwable.getLocalizedMessage());
                    }
                });
            }
        });

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                RetrofitInstance retrofitInstance = new RetrofitInstance();
//
////                Call<NoteRoot> call = retrofitInstance.instance().addNotes( "r1729515382963bsf949511943hu", "title", "2024-02-29T11:22:15.945Z", "description");
//                Call<NoteRoot> call = retrofitInstance.instance().addNotes( "My NEW NOTE", "2024-02-29T11:22:15.945Z", "description");
//                call.enqueue(new Callback<NoteRoot>() {
//                    @Override
//                    public void onResponse(Call<NoteRoot> call, Response<NoteRoot> response) {
//                        Log.d("====", "onResponse: " + response.body());
//                    }
//
//                    @Override
//                    public void onFailure(Call<NoteRoot> call, Throwable throwable) {
//                        Log.e("====", "onFailure: " + throwable.getLocalizedMessage() );
//                    }
//                });









//                Call<Root> call = retrofitInstance.instance().alldata();
////
////                call.enqueue(new Callback<Root>() {
////                    @Override
////                    public void onResponse(Call<Root> call, Response<Root> response) {
////
////                        Log.d("+-+-+-", "onResponse: "+response.body().products.get(0).description);
////                        Log.d("+-+-+-", "onResponse: "+response.body().products.get(0).title);
////                    }
////
////                    @Override
////                    public void onFailure(Call<Root> call, Throwable throwable) {
////
////                        Log.d("+-+-+-", "onFailure: "+throwable.getLocalizedMessage());
////
////                    }
////                });
//            }
//        });

    }
}