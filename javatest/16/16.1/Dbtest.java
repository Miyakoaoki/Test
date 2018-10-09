import java.sql.*;
class Dbtest {
  public static void main (String args[]) {
      String url   = "jdbc:odbc:myDSN";
      String query = "SELECT * FROM equipment"; 
	  Connection con=null;
	  Statement stmt=null;
	  ResultSet rs=null;
	  try {
		//装载JdbcOdbcDriver 
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//尝试获得连接对象，如果连接失败，则抛出异常
		con = DriverManager.getConnection (url, "sa", "");
		//程序执行到此，意味着连接成功。
                //创建一个Statement对象。
		stmt = con.createStatement ();
		// 提交一个请求，获得SQL语句的结果集，结果集为一个对象，被rs所引用。
		rs = stmt.executeQuery (query);
		// 对结果集进行遍历，显示其内容。
		while (rs.next()) {
		      System.out.println("id:"+rs.getString(1)
			         		       +",name:"+rs.getString(2));
		}
                                     	
  			
	   }
	   catch (SQLException ex) {
                           ex.printStackTrace();
                           System.out.println ("发生SQL异常");	}
	   catch (Exception ex) {ex.printStackTrace ();}
       finally{
         try{
			 if (rs!=null) rs.close();
			 if (stmt!=null) stmt.close();
			 if (con!=null) con.close();
		    }
		 catch (SQLException ex) {ex.printStackTrace();}
       }
    }
}
