package in.ck.beans;

import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class MySQLDbReportDao implements ReportDao {
@Override
public void getData() {
	System.out.println("getting data from MYSQL DB");
}
}
