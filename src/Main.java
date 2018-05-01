public class Main {

    public static void main(String[] args) {
        student s1=new student("almaz","123456789");
        s1.balance=1000;
        s1.setPhone("0771326548");
        s1.setCity("Jalal-Abad");
        s1.setState("Jalal-Abad");
        System.out.println("hi everybody");
        System.out.println(s1.toString());
        System.out.println("State:"+s1.getState());
        System.out.println("City:"+s1.getCity());
        System.out.println("Phone number:"+s1.getPhone());
        s1.enroll("dance,volleyboll");
        s1.pay(200);
    }
}
