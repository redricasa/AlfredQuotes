// add your Class name
public class  AlfredQuotesTest{;
// change according to if it is a test file or main file
    public static void main(String[] args){

        AlfredQuotes alfred = new AlfredQuotes();
        String testGreeting = alfred.basicGreeting();
        System.out.println( testGreeting );
        String testDate = alfred.dateAnnouncement();
        System.out.println( testDate );
        // storing in a string the return of a function
        // String testAlexa = alfred.respondBeforeAlexis("hello my name is Alfred");
        // System.out.println( testAlexa );
        // printing the method of a function
        System.out.println( alfred.respondBeforeAlexis("hello my name is Alfred") );
    }
}
