import java.sql.*;
class Dbtest {
  public static void main (String args[]) {
      String url   = "jdbc:odbc:myDSN";
      String query = "SELECT * FROM equipment"; 
	  Connection con=null;
	  Statement stmt=null;
	  ResultSet rs=null;

	  try {
		//*****************************************************
		//通过JDBC-0DBC桥连接Access,当然,也可以用相同方法连接Oracle或SQLServer
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");		
		con = DriverManager.getConnection (url, "sa", "");
		/*通过Oracle叟客户端专用引擎获得连接对象
		 url= "jdbc:oracle:thin:@192.168.42.13:1521:ora8i"
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,"sa","");
		*/
		/*通过SQLServer专用引擎获得连接对象
		url="jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=edu";
		Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
		Connection conn = DriverManager.getConnection(url,"sa","");
		*/		
		//*****************************************************

		//-----------------------------------------------------
		stmt = con.createStatement ();
		// 提交一个请求，获得SQL语句的结果集，结果集为一个对象，被rs所引用。
		rs = stmt.executeQuery (query);
		// 对结果集进行遍历，显示其内容。
		while (rs.next()) {
		      System.out.println("id:"+rs.getString(1)
			         		       +",name:"+rs.getString(2));
		}				
	   }
	   catch (SQLException ex) {	 System.out.println ("发生SQL异常");	}
	   catch (Exception ex) {	ex.printStackTrace ();}
           finally{
		 try{
			 if (rs!=null) rs.close();
			 if (stmt!=null) stmt.close();
			 if (con!=null) con.close();
		 }
		 catch (SQLException ex) {}
           }
  }
}
