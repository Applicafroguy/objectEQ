package co.za.applicafro.tg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Course myCourse = new Course("IT");
        Student student = new Student("Lihle");

        System.out.println( "I am "+student.getName()+" and I love "+ myCourse.getName() );
    }
}
