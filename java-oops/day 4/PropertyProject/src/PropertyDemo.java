import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Properties;

@Author
public class PropertyDemo {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

        Properties ps = new Properties();
        try{
            ps.load(PropertyDemo.class.getResourceAsStream("app.properties"));
            System.out.println("DB Name");
        }catch(IOException ex){
            System.out.println("Unable to Load the Properties");
            ex.printStackTrace();
        }
    }
}
