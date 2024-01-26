package in.ck.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
   @Autowired //-->Field Injection
    @Qualifier("oracleDao")
    private ReportDao dao;
    //setter Injection
    /*@Autowired
   @Qualifier("oracleDao")
    public void setDao(ReportDao dao) {
    	System.out.println("setter method called..");
    	this.dao=dao;
    }*/
    /*@Autowired
    @Qualifier("oracleDao")
    public ReportService(ReportDao dao) {
       System.out.println("Constructor called");
    	this.dao=dao; 
    }*/
    public void generateReport(){
    	dao.getData();
    	System.out.println("Report Generated......");
    }
}
