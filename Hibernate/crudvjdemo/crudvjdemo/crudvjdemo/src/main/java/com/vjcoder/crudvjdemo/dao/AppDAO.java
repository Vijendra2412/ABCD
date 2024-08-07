package com.vjcoder.crudvjdemo.dao;

import com.vjcoder.crudvjdemo.entity.Instructor;
import com.vjcoder.crudvjdemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteIntstructorDetailsById(int theId);























}