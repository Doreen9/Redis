package io.turntabl.springbootdemo.model;

public class ClientTO {

    private String company_name;
    private String customer_id;
    private String contact_name;
    private String city;
    private String region;
    private String postal_code;
    private String country;
    private String phone;
    private String contact_title;
    private String fax;


    public ClientTO() {

    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContact_title(String contact_title) {
        this.contact_title = contact_title;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getRegion() {
        return region;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getContact_title() {
        return contact_title;
    }

    public String getFax() {
        return fax;
    }

    public String getContact_name() {
        return contact_name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "ClientTO{" +
                "company_name='" + company_name + '\'' +
                ", customer_id=" + customer_id +
                ", contact_name='" + contact_name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
