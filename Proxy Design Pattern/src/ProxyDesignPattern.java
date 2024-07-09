//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProxyDesignPattern {
    public static void main(String[] args) {

        try{
            EmployeeDao empTblObj = new EmployeeDaoProxy();
            empTblObj.create("USER", new EmployeeDo());
            System.out.println("Operation Successful");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}