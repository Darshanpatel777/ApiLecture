package com.example.apilecture;

import android.provider.DocumentsContract;

import com.example.apilecture.modalclass.Root;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubService {


    @GET("/products")
    Call<Root> alldata();
}
