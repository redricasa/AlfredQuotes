import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting(){
        String greeting =  "Hello, lovely to see you. How are you?";
        return greeting;
    }

    public String guestGreeting(String name, String dayPeriod) {
        return  String.format(" %s, %s. Lovely to see you.", "Good evening" , "Beth Kane" ); 
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Current date is: " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // System.out.println(conversation.indexOf("Alexis") );
        if(conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") > -1){
            String blah = "At your service. As you wish, naturally.";
            return blah;
        }
        else{
            return "Right. And with that I shall retire.";
        }
        // return " ";
    }

}

