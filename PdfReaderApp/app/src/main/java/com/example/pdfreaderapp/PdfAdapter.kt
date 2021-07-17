package com.example.pdfreaderapp
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import java.io.File

class PdfAdapter(private val pdflist: ArrayList<Pdf>) : RecyclerView.Adapter<PdfAdapter.MyViewHolder>(){
     lateinit var  mcontext:Context
     lateinit var mfiles:Array<String>


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val  currentItem = pdflist[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.heading.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return pdflist.size
    }
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        val titleImage: ShapeableImageView = itemView.findViewById(R.id.titleImage)
        val heading : TextView= itemView.findViewById(R.id.heading)
    }
}