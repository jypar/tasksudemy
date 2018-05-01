 class student {
    String name;
    String SSN;
    String email;
    String userID;
    String courses;
    int balance;
    private static int ID=1404;
    private String phone;
    private String city;
    private String state;

    public student(String name,String SSN){
        this.name=name;
        this.SSN=SSN;
        email=name+"@gmail.com";
        //System.out.println(email);
        userID= String.format("%d%s%s", ID, Integer.toString((int) (Math.random() * 9000 + 1000)), SSN.substring(5));
        //System.out.println(userID);
    }

    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }

    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }

    public void enroll(String x){
        courses=x;
        showCourses();
    }
    public void showCourses(){
        System.out.println("Enrolled courses: "+courses);
    }
    public void pay(int x){
        balance=balance-x;
        checkBalance();
    }

    public void checkBalance(){
        System.out.println("Balance:"+balance);
    }
    public String toString(){
        return"Name:"+name+"\nemail:"+email+"\nuserID:"+userID;
    }

}
