package com.example.apilecture;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    GitHubService instance(){


        // GET NOTES (DUMMY JSON)
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://dummyjson.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();


//         POST NOTES (ADD KARAVA MATE)
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://service.apikeeda.com")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();



//                 GET NOTES (GET KARAVA MATE)
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://service.apikeeda.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        return service;
    }
}
