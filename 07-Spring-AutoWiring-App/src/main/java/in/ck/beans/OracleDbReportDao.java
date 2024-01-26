package in.ck.beans;

import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDbReportDao implements ReportDao{
@Override
public void getData() {
	System.out.println("getting data from Oracle DB");	
}	

}
