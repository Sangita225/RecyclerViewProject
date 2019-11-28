package com.example.recyclerviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder>{

    Context mContext;
    List<Students>studentsList;
    public StudentsAdapter(Context mContext,List<Students>studentsList){
        this.mContext=mContext;
        this.studentsList=studentsList;
    }


    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.layout_students,parent,false);
        return  new StudentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, final int position) {
    Students students=studentsList.get(position);
    holder.tvname.setText(students.getName());
    holder.tvaddress.setText(students.getAddress());
    holder.tvage.setText(Integer.toString(students.getAge()));
    holder.tvgender.setText(students.getGender());
    holder.imgView.setImageResource(students.getImgId());
    holder.imgdustbin.setImageResource(students.getImgdustbinId());

    //set clicklistener for removing records
        holder.imgdustbin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               studentsList.remove(position);
               notifyItemRemoved(position);

            }
        });

    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class StudentsViewHolder extends RecyclerView.ViewHolder{
    ImageView imgView;
    TextView tvname,tvaddress,tvage,tvgender;
            ImageButton imgdustbin;

public StudentsViewHolder(@NonNull View itemView){
    super(itemView);
    imgView=itemView.findViewById(R.id.imgView);
    tvname=itemView.findViewById(R.id.tvname);
    tvaddress=itemView.findViewById(R.id.tvaddress);
    tvage=itemView.findViewById(R.id.tvage);
    tvgender=itemView.findViewById(R.id.tvgender);
    imgdustbin=itemView.findViewById(R.id.imgdustbin);

}




}


}
