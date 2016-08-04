package org.learn.model;

public class User {
    
	private String id;
    private String name;
    private int age;
    private String city;
    private String gender;

    public User() {
    	
    }
    public User(String id, String name, int age, String city, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    
    public String getId() {
		return id;
	}	
}
