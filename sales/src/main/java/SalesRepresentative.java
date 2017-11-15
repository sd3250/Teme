public class SalesRepresentative {
    private String name;
    private double quota;
    private double revenue;

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "name='" + name + '\'' +
                ", quota=" + quota +
                ", numberOfSales=" + revenue +
                '}';
    }

    public SalesRepresentative(String name, double quota, double revenue) {
        this.name = name;
        this.quota = quota;
        this.revenue = revenue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    public void setRevenue(double numberOfSales) {
        this.revenue = numberOfSales;
    }

    public String getName() {
        return name;
    }

    public double getQuota() {
        return quota;
    }

    public double getRevenue() {
        return revenue;
    }
}
