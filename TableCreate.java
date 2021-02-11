import java.sql.*;
public class TableCreate
{
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
Statement st=con.createStatement();

st.executeQuery("create table kid (vno number,vname varchar(10),vsal number)");
System.out.println("Table created successfully");
con.close();
}
}
