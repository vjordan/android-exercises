package fr.android.androidexercises

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.CheckBox

class LibraryActivity : AppCompatActivity() {

    private var checkBox: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        checkBox = findViewById(R.id.checkBox)
    }

    companion object {
        const val CHECK = "CB"
    }

    public override fun onSaveInstanceState(outState: Bundle) {
        // TODO save check box state
        checkBox?.apply {
            outState.putBoolean(CHECK, isChecked)
        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        // TODO restore check box
        checkBox?.apply {
            isChecked = savedInstanceState.getBoolean(CHECK)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_library, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        return when (id) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
