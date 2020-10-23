public class Main {
    public static void main(String[] args) {
       Car c1 = new Car();
       Car c2 = new Car();
       Car c3 = new Car();

       c1.color = "red";
       c1.manufacturer = "Saab";
       c1.year = 2012;
       c2.color = "red";
       c2.manufacturer = "Toyota";
       c2.year = 2002;
       c3.color = "red";
       c3.manufacturer = "Volvo";
       c3.year = 2014;

        System.out.printf("Manufacturer: %s  \tColor: %s  \tYear: %d \n",c1.manufacturer, c1.color, c1.year);
        System.out.printf("Manufacturer: %s  \tColor: %s  \tYear: %d \n",c2.manufacturer, c2.color, c2.year);
        System.out.printf("Manufacturer: %s  \tColor: %s  \tYear: %d \n",c3.manufacturer, c3.color, c3.year);
    }
}
