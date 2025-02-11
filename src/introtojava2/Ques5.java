package introtojava2;
class DBConnection
{
    private static DBConnection db;
    private DBConnection()
    {
        System.out.println("Database Connected ");
    }
    public static DBConnection setConnection()
    {
        if(db==null) {
            db = new DBConnection();
        }
        return db;
    }
}
public class Ques5 {
    public static void main(String[] args) {
        DBConnection newDB1 = DBConnection.setConnection();
        DBConnection newDB2 = DBConnection.setConnection();
        System.out.println(newDB1);
        System.out.println(newDB2);

    }
}