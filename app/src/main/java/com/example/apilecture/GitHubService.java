package com.example.apilecture;

import com.example.apilecture.GetRootNote.GetRootName;
import com.example.apilecture.NotesApi.NoteRoot;
import com.example.apilecture.modalclass.Root;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface GitHubService {


    @GET("/products")
    Call<Root> alldata();

    @FormUrlEncoded
    @Headers({"x-apikeeda-key:r1729515382963bsf949511943hu"})
    @POST("/api/v1/notes")
//    Call<NoteRoot> addNotes(@Header("x-apikeeda-key") String header, @Field("title") String title, @Field("date") String date, @Field("description") String description);
    Call<NoteRoot> addNotes( @Field("title") String title, @Field("date") String date, @Field("description") String description);





    @Headers({"x-apikeeda-key:r1729515382963bsf949511943hu"})
    @GET("/api/v1/notes")
    Call<GetRootName> getnotes();

}
