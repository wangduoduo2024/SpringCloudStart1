package com.duoDuo.repository;

import com.duoDuo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author 暗影精灵
 */
public interface StudentRepository {
    public Collection findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
