package www.harunmese.dev.custombottomsheet

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import www.harunmese.dev.custombottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val gridView = binding.gridView
        val data : List<Int> = listOf(R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item,R.drawable.item)
        val adapter = GridViewAdapter(this, data)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,position.toString() + " tiklandi",Toast.LENGTH_SHORT ).show()
        }
    }
}
