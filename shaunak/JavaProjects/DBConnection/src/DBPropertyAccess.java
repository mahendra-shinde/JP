import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyAccess {
    public static void main(String[] args) {
        //    System.out.println(System.getProperty("user.home"));
          //  System.out.println(System.getProperty("os.name"));

            Properties ps = new Properties();
            try{
                ps.load(DBPropertyAccess.class.getResourceAsStream("db.properties"));
                System.out.println("DB Name: "+ps.getProperty("db.name"));
                System.out.println("DB Driver Name: "+ps.getProperty("db.driver"));
                System.out.println("DB User Name: "+ps.getProperty("db.user"));
                System.out.println("DB Password: "+ps.getProperty("db.password"));
                System.out.println("DB URL: "+ps.getProperty("db.url"));

            }catch(IOException ex){
                System.out.println("Unable to Load the Properties");
                ex.printStackTrace();
            }
        }
}

