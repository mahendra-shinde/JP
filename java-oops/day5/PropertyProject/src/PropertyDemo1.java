
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

@Author("Mahendra Shinde")
public class PropertyDemo1 {

    @Author
    public static void main(String[] args) {


        //System Properties: Read from OS (Env Vars)
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

        Properties ps = new Properties();
        try {
            //Get a file as Stream from a location relative to 'PropertyDemo1.class' file.
            // That means, 'app.properties' is at same directory as 'PropertyDemo1.class'
            ps.load(PropertyDemo1.class.getResourceAsStream("app.properties"));
            System.out.println("DB Name: "+ps.getProperty("db.name"));
            System.out.println("Student Passing Score: "+ps.getProperty("student.passing-score"));
            System.out.println("Institute Name: "+ps.getProperty("institute.name","Not Set"));

            ps.setProperty("db.port","1257");
            ps.store(new FileOutputStream("app.properties"),"Added new property");


        }catch(IOException ex){
            System.out.println("Unable to load the properties");
            ex.printStackTrace();
        }

    }
}
