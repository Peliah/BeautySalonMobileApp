package se3.pdt.beautysalon.adapters;

public class ServiceModal {
    private  Integer serviceid;
    private  String servicename;
    private  String servicedesc;
    private  Double price;

    public ServiceModal() {
    }

    public ServiceModal(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public ServiceModal(Integer serviceid, String servicename, String servicedesc, Double price) {
        this.serviceid = serviceid;
        this.servicename = servicename;
        this.servicedesc = servicedesc;
        this.price = price;
    }

    public ServiceModal(String servicename, Double price, String servicedesc) {
        this.servicename = servicename;
        this.servicedesc = servicedesc;
        this.price = price;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getServicedesc() {
        return servicedesc;
    }

    public void setServicedesc(String servicedesc) {
        this.servicedesc = servicedesc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}