public class Cinema {

    private String name;
    private User[] listUser;
    private Studio[] listStudio;
    private int studioCapacity;

    Cinema(String name, int studioCapacity){
        name = "Studio UTP A";

    }

    public boolean registerUser(User user){
        for (int i = 0; i < listUser.length; i++) {
            if (user != null) {
                listUser[i] = user;
            }
        }
        return true;
    }

    public User authenticateUser(String email, String password){
        for (int i = 0; i < listUser.length; i++) {
            if(email.equals(listUser)&&password.equals(listUser)) {
                
            }
        }
        return authenticateUser(email, password);
    }

    private void init(){

    }

    public void displayListStudio(){
        System.out.println("List Studio");
        for (int listUser = 0; listUser < listStudio.length; listUser++) {
            System.out.println("Studio : " + listStudio);
            System.out.println("Type   : " );
            System.out.println("Movie  : " );
        }
    }

    public void displayStudioDetail(int studioNumber){

    }

    public boolean addStudioWithMovies(){
        for (int i = 0; i < listStudio.length; i++) {
            if (Studio != null) {
                listStudio[i] = Studio;
            }
        } 
    }

    public boolean bookTicket(){

    }

    public String getName(){
        return name;
    }
}