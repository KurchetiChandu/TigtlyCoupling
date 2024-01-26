package in.ck.beans;

public class UserDao {
 public void init() {
	 System.out.println("getting DB connection..");
 }
 public void getData() {
	 System.out.println("gettinh data from DB..");
 }
 public void destroy() {
	 System.out.println(",closing DB connection..");
 }
}
