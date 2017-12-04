package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Plant logger cf. Android Timber
        // Timber.plant(new Timber.DebugTree());

        // TODO build Retrofit

        // TODO create a service

        // TODO listBooks()

        // TODO enqueue call and display book title

        // TODO log books

        // TODO display book as a list
    }

}
