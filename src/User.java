public class User {
    private String _name;
    String membership;

    //method to set data are usually going to be void which means they are not going to return anything
    void set_name(String name){
        _name = name;
    }
    //get method
    String get_name(){
        return _name;
    }
}