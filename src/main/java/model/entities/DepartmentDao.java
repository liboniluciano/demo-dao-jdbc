package model.entities;

import java.util.List;

public interface DepartmentDao {

    void insert(Department departmentObj);
    void update(Department departmentObj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();


}
