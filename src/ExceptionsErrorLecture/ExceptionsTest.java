package ExceptionsErrorLecture;

public class ExceptionsTest {

    public static void main(String[] args) throws Exception {

        System.out.println("If i'm above exception, do I work?");

//        throw new Exception("Whoops - Exception encountered!");
//        System.out.println("Good Morning, Sirius");


        try{
            //Code to break application here..
            throw new RuntimeException("Something broke while running app");
        } catch (NullPointerException e){
            System.out.println("Here's an example of e.getMessage() " + e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e){
            System.out.println("This is a runtime exception");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("This is an exception");
            e.printStackTrace();
        }

    }

}
