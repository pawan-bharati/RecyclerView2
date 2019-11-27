package com.example.recyclerview2;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentsViewHolder>
{
    Context mContext;
    List<Students> studentsList;

    public StudentAdapter(Context mContext,List<Students> studentsList)
    {
        this.mContext=mContext;
        this.studentsList=studentsList;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_student,parent,false);
        return new StudentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.StudentsViewHolder holder, int position) {

        Students students=studentsList.get(position);
        holder.tvname.setText(students.getName());
        holder.tvaddress.setText(students.getAddress());
        holder.tvage.setText(String.valueOf(students.getAge()));
        holder.tvgender.setText(students.getGender());
        holder.imgicon.setImageResource(students.getImageid());
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class StudentsViewHolder extends RecyclerView.ViewHolder {
      TextView tvname,tvaddress,tvage,tvgender;
      ImageView imgicon;
        public StudentsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname=itemView.findViewById(R.id.tvname);
            tvaddress=itemView.findViewById(R.id.tvaddress);
            tvage=itemView.findViewById(R.id.tvage);
            tvgender=itemView.findViewById(R.id.tvgender);
            imgicon=itemView.findViewById(R.id.imgviewavatar);
        }
    }
}
