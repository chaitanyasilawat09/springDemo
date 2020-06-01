package spring_Jdbc.stored_Procedure;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

public class DemoBean extends StoredProcedure {

    public DemoBean(DataSource ds) {
        super(ds, "proc1");

        declareParameter(new SqlParameter("no", Types.INTEGER));
        declareParameter(new SqlOutParameter("name", Types.VARCHAR));
        declareParameter(new SqlOutParameter("exx", Types.VARCHAR));
    }

    public void executePro(int eno){
        Map imp = new HashMap();
        imp.put("no",eno);

        Map omp = execute(imp);

        Object obj = omp.get("name");
        System.out.println(obj.toString()+"object name from procedure");

        Object obj1 = omp.get("exx");
        Integer i = (Integer)obj1;
        System.out.println(i+"    int value of exx");
    }
}
