package Exam2023q3;

public class Restaurant {
    String restAddress;
    String restName;
    String menu;
    Person restaurantOwner;
    String[] salads;
    public Restaurant(String name){

    }
    public void setAddress(String address){
        this.restAddress=address;

    }
    public void setOwner (Person owner){
        this.restaurantOwner=owner;
    }
    public String[] getSaladList(){
        return this.salads;
    }
    public String getMenu(){
        return this.menu;
    }

}
