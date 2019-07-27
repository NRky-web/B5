package tesarkademy;


public class kelas2 {

    public static void main(String[] args) {
        
        System.out.println(is_username_valid("Xrutaf888"));
        System.out.println(is_username_valid("1Diana"));
        System.out.println(is_password_valid("passW0rd="));
        System.out.println(is_password_valid("C0d3YourFuture!#"));
        
    }
    static boolean is_username_valid(String username){
        boolean valid = username.matches("(?=.*[A-Z])[a-zA-Z]+[a-zA-z0-9]{4,9}");
        return valid;
    }
    static boolean is_password_valid(String password){
        boolean valid = password.matches("((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*\\W)(?=.*[=]).{8,})");
        return valid;
    }
    
}
