import javax.swing.JOptionPane;
    public class Authenticator  {
    public static void main(String[]args) {
    String username =
    JOptionPane.showInputDialog("Username:");
    String password =
    JOptionPane.showInputDialog("Password:");
    if  (
    username != null &&
    password != null &&
        (
    (username.equals("bburd")) &&
     password.equals("swordfish")) ||
    (username.equals("hritter") &&
    password.equals("preakstone"))
    )
   {
   JOptionPane.showMessageDialog(null,"Вы допущены в систему.");
    } else {
    JOptionPane.showMessageDialog(null,"Попробуйте еще раз.");
            }
    }
    }


