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
		//ͨ��JDBC-0DBC������Access,��Ȼ,Ҳ��������ͬ��������Oracle��SQLServer
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");		
		con = DriverManager.getConnection (url, "sa", "");
		/*ͨ��Oracle�ſͻ���ר�����������Ӷ���
		 url= "jdbc:oracle:thin:@192.168.42.13:1521:ora8i"
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,"sa","");
		*/
		/*ͨ��SQLServerר�����������Ӷ���
		url="jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=edu";
		Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
		Connection conn = DriverManager.getConnection(url,"sa","");
		*/		
		//*****************************************************

		//-----------------------------------------------------
		stmt = con.createStatement ();
		// �ύһ�����󣬻��SQL���Ľ�����������Ϊһ�����󣬱�rs�����á�
		rs = stmt.executeQuery (query);
		// �Խ�������б�������ʾ�����ݡ�
		while (rs.next()) {
		      System.out.println("id:"+rs.getString(1)
			         		       +",name:"+rs.getString(2));
		}				
	   }
	   catch (SQLException ex) {	 System.out.println ("����SQL�쳣");	}
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
