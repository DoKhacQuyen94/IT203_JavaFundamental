package Session6.baitap02;
class Account{
    private String userName;
    private String passWord;
    private String email;

    public Account(String userName, String passWord, String email){
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }
    public void changePass(String passWord){
        this.passWord = passWord;
        System.out.println("Đổi mật khẩu thành công");
    }
    public void displayAccount(){
        System.out.println("User: "+userName);
        System.out.println("Email: "+email);
        System.out.println("--------------------");

    }
}
public class baitap02 {
    public void main (String[] args){
        Account ac1 = new Account("DoKhacQuyen","khacquyen","tpq0904@gmail.com");
        ac1.changePass("quyendeptrai");
        ac1.displayAccount();
    }
}
