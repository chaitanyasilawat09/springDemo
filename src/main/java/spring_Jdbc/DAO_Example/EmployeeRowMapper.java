package spring_Jdbc.DAO_Example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        Employee e = new Employee();
        e.setId(rs.getInt(1));
        e.setEname(rs.getString(2));
        e.setEsal(rs.getInt(3));
        e.setDept(rs.getString(4));
        return e;
    }

    //use this class in selectAllEmployee() of EmployeeDAOImpl
    // to print data but not metadata

}
