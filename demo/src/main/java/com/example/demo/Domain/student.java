package com.example.demo.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_data")
public class student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_Id;
    private String student_Name;
    private Integer student_Grade;
    public Integer getStudent_Id() {
        return student_Id;
    }
    public void setStudent_Id(Integer student_Id) {
        this.student_Id = student_Id;
    }
    public String getStudent_Name() {
        return student_Name;
    }
    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }
    public Integer getStudent_Grade() {
        return student_Grade;
    }
    public void setStudent_Grade(Integer student_Grade) {
        this.student_Grade = student_Grade;
    }
    
    


}
