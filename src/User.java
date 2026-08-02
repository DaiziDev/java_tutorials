public class User {
    private String _name;
    private String _membership = "Bronze";

    public User() {

    }

    // constructor is just like a method but there is not return type
    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    public User(String name) {
        set_name(name);
    }

    //method to set data are usually going to be void which means they are not going to return anything
    void set_name(String name){
        _name = name;
    }
    //get method
    String get_name(){
        return _name;
    }

    // overload
    void set_membership(String membership){
        _membership = membership;
    }

    void set_membership(Membership membership){
        _membership = membership.name();
    }

    public enum Membership{
        Bronze, Silver, Gold
    }

    String get_membership(){
        return _membership;
    }
    // overriding is replacing a method tht already exist
}