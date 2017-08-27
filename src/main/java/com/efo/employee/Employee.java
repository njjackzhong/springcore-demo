package com.efo.employee;

//Bean or Model or POJO
public class Employee {
    private String ename;
    private String egender;
    private String eid;
    private Address address;

    public Employee(String ename, String egender, String eid, Address adrs) {
        this.ename = ename;
        this.egender = egender;
        this.eid = eid;
        this.address = adrs;
    }

    public Employee() {
        System.out.println("----Employee Object Constructed----");
    }

    //construct dependency injection
    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    //setter dependency injection
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEgender() {
        return egender;
    }

    public void setEgender(String egender) {
        this.egender = egender;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", egender='" + egender + '\'' +
                ", eid='" + eid + '\'' +
                ", address=" + address +
                '}';
    }

    public void init() {
        System.out.println("----Employee Initialize----");
    }

    public void destroy() {
        System.out.println("----Employee Destroyed----");
    }
}
