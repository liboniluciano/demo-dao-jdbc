package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("======== TEST1 Department findAll");
        List<Department> dep = departmentDao.findAll();
        dep.forEach(System.out::println);

        



    }

}
