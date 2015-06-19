public class Data{
    String firstName;
    String lastName;
    String phoneNumber;
    String homeAddress; 
    int age;
    Data [] relations;

    //constuctor
    public Data(){
        relations = new Data[10];
    }//Data

    public Data(String first_name, String last_name, int user_age){
        firstName = first_name;
        lastName = last_name;
        age = user_age;
    }
    public String getFirstName(){
        return firstName;
    }//firstname

    public String getLastName(){
        return lastName;
    }//lastname

    public String getPhoneNumber(){
        return phoneNumber;
    }//phonenumber

    public String getHomeAddress(){
        return homeAddress;
    }//address

    public int getAge(){
        return age;
    }//age

    public Data [] getRelations(){
        return relations;
    }//getRelations

    public void setPhoneNumber(String phone_number){
        phoneNumber = phone_number;
    }//homeadress

    public void setHomeAddress(String home_address){
        homeAddress = home_address;
    }//homeadress

    public void setLastName(String last_name){
        lastName = last_name;
    }//last name

    public void setFirstName(String first_name){
        firstName = first_name;
    }//firstname

    public void setAge(int my_age){
        age = my_age;
    }//setAge
    
    public void setRelations(Data [] relations_family){
        relations = relations_family;
    }//setRelations




}//class
