import java.sql.*;
class Dbtest {
  public static void main (String args[]) {
      String url   = "jdbc:odbc:myDSN";
      String query = "SELECT * FROM equipment"; 
	  Connection con=null;
	  Statement stmt=null;
	  ResultSet rs=null;
	  try {
		//װ��JdbcOdbcDriver 
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//���Ի�����Ӷ����������ʧ�ܣ����׳��쳣
		con = DriverManager.getConnection (url, "sa", "");
		//����ִ�е��ˣ���ζ�����ӳɹ���
                //����һ��Statement����
		stmt = con.createStatement ();
		// �ύһ�����󣬻��SQL���Ľ�����������Ϊһ�����󣬱�rs�����á�
		rs = stmt.executeQuery (query);
		// �Խ�������б�������ʾ�����ݡ�
		while (rs.next()) {
		      System.out.println("id:"+rs.getString(1)
			         		       +",name:"+rs.getString(2));
		}
                                     	
  			
	   }
	   catch (SQLException ex) {
                           ex.printStackTrace();
                           System.out.println ("����SQL�쳣");	}
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
