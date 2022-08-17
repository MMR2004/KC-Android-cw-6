package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student>studentArrayList = new ArrayList<>();
    int currentStudent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView studentPhoto = findViewById(R.id.profile);
        TextView name = findViewById(R.id.Namestudents);
        TextView age = findViewById(R.id.Agestudents);
        TextView grade = findViewById(R.id.gradestudents);
        Button change = findViewById(R.id.changePage);

        Student s1 = new Student("يوسف",14, 12 ,R.drawable.boy1 );
        Student s2 = new Student("سلمان",13, 10 ,R.drawable.boy );
        Student s3 = new Student("ماجد",15, 11 ,R.drawable.boy1 );
        Student s4 = new Student("محمد",17, 12 ,R.drawable.boy );
        Student s5 = new Student("جَوان", 10, 12,R.drawable.girl);

        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);

        studentPhoto.setImageResource(studentArrayList.get(currentStudent).getStudentImg());
        name.setText(studentArrayList.get(currentStudent).getStudentName());
        age.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
        grade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));


        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++;
                if (currentStudent == studentArrayList.size()){
                    currentStudent = 0;
                }
                studentPhoto.setImageResource(studentArrayList.get(currentStudent).getStudentImg());
                name.setText(studentArrayList.get(currentStudent).getStudentName());
                age.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                grade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

            }
        });



    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public int getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(int currentStudent) {
        this.currentStudent = currentStudent;
    }
}