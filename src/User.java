public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketList;
    private static int MAX_TICKET = 20;

    public User (String email, String password, String fullName, double balance){

    }

    public boolean addTicket(Ticket ticket){
        for (int i = 0; i < ticketList.length; i++) {
            if (ticket != null) {
                ticketList[i] = ticket; 
            }
        }
        return true;
    }

    public void displayAllTickets(){
        for (int user = 0; user < ticketList.length; user++) {
            
        }
    }

    public boolean isMatch(String email, String password){
        if (email.equals(password)&&password.equals(email)) {
            
        } return isMatch(email, password);
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getFullName(){
        return fullName;
    }

    public double getBalance(){
        return balance;
    }

    public  void setBalance(double balance){

    }

    


}
