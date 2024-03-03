package www.harunmese.dev.custombottomsheet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridViewAdapter(private val context: Context, private val data: List<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder

       // if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.gridview_item, parent, false)
            viewHolder = ViewHolder(view)
            //view.tag = viewHolder
       // } else {
          //  view = convertView
         //   viewHolder = view.tag as ViewHolder
       // }


        // #2  buradan degerleri verilir

        viewHolder.imageView.setImageResource(data[position])
        viewHolder.text.text = (position + 1).toString()
        return view
    }

    private class ViewHolder(view: View) {
        // #1   gridview_item icindeki view lara buradan erisip..
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val text: TextView = view.findViewById(R.id.textView)
    }
}