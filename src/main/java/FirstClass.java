public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2018);
        System.out.println(notebook.weight + "gram" + " " +  notebook.price + "PLN" + " " + notebook.year + " " + "year of production.");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 2000, 2015);
        System.out.println(heavyNotebook.weight + "gram" + " " + heavyNotebook.price + "PLN" + " " + heavyNotebook.year + " " + "year of production.");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println(oldNotebook.weight + "gram" + " " + oldNotebook.price + "PLN" + " " + oldNotebook.year + " " + "year of production.");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();






    }

}