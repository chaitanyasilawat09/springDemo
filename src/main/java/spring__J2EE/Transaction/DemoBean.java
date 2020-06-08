package spring__J2EE.Transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class DemoBean {

    private JdbcTemplate jt;
    private PlatformTransactionManager ptm;

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public void setPtm(PlatformTransactionManager ptm) {
        this.ptm = ptm;
    }

    public void m1(){

        DefaultTransactionDefinition td = new DefaultTransactionDefinition();
        td.setTimeout(4);
        TransactionStatus ts = ptm.getTransaction(td);
        try{

            jt.update("insert into employee values(222,'aayu',4200,'akx')");
            Thread.sleep(3000);
            jt.update("insert into student values(222,'aayu','aks')");

            ptm.commit(ts);
            System.out.println("Transaction completed.......");
        }
        catch (Exception e){
            System.out.println("Transaction Failed .........");
            e.printStackTrace();

        }
    }
}
