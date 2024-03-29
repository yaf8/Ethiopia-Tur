package com.example.ethiopiaactivity;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    private final ArrayList<StudentModal> StudentModalArrayList;

    public StudentAdapter(ArrayList<StudentModal> StudentModalArrayList, Context context) {
        this.StudentModalArrayList = StudentModalArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StudentModal modal = StudentModalArrayList.get(position);
        holder.StudentID.setText(modal.getID());
        holder.StudentName.setText(modal.getFullName());
    }

    @Override
    public int getItemCount() {
        return StudentModalArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView StudentID;
        private final TextView StudentName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            StudentID = itemView.findViewById(R.id.textID);
            StudentName = itemView.findViewById(R.id.textName);
        }
    }
}

