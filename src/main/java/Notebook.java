public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 600 && this.weight <= 1200) {
            System.out.println("This notebook is not very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year >= 2018 && this.price <= 1000) {
            System.out.println("A relatively young notebook at a good price.");
        } else if (this.year <=2015 && this.price <= 600) {
            System.out.println(("This notebook is a monument at an attractive price. "));
        }

    }
}




