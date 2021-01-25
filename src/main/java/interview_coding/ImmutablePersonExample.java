package interview_coding;

import java.util.Date;

public class ImmutablePersonExample {
    int age;
    Address address;
    Date dob;

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "ImmutablePersonExample{" +
                "age=" + age +
                ", address=" + address +
                ", dob=" + dob +
                '}';
    }

    public ImmutablePersonExample(int age, Address address, Date dob) {

        this.age = age;
        this.dob = new Date(dob.getTime());

        Address add = new Address();
        add.setCity(address.getCity());
        add.setPin(address.getPin());
        this.address = add;
    }

    public static void main(String[] args) {
        Address addr = new Address();
        addr.setCity("Ranchi");
        addr.setPin("834003");


        Date d = new Date();
        d.setTime(4);

        ImmutablePersonExample obj = new ImmutablePersonExample(30,addr,d);
        System.out.println(obj);

        addr.setCity("Bangalore");
        obj.getDob().setTime(3);
        System.out.println(obj);
    }
}
