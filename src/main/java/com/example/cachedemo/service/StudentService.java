package com.example.cachedemo.service;

import com.example.cachedemo.model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Cacheable("student")
    public Student getStudentById(String id)
    {
        try
        {
            System.out.println("going to sleep for 5 seconds... to simulate backend call...");
            Thread.sleep(1000 * 5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return new Student(id, "Ama", "pre-vocational skills");
    }
}
