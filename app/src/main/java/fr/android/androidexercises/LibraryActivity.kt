package fr.android.androidexercises

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit.*
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber

class LibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // Plant logger cf. Android Timber
        Timber.plant(Timber.DebugTree())


        // TODO build Retrofit
        val retrofit = Builder()
                .baseUrl("http://henri-potier.xebia.fr/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        // TODO create a service
        val api = retrofit.create(HenriPotierService.Api::class.java)

        // TODO listBooks()
        api.listBooks()

        // TODO enqueue call and display book title
        api.listBooks().enqueue(object : Callback<Array<Book>> {
            override fun onFailure(call: Call<Array<Book>>, t: Throwable) {

                Timber.e(t)
            }

            override fun onResponse(call: Call<Array<Book>>,
                                    response: Response<Array<Book>>) {

                // TODO log books
                response.body()?.forEach { Timber.i(it.toString()) }

            }
        })

        // TODO display book as a list
        
    }

}
