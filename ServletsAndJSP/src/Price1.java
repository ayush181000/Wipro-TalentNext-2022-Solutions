
import java.util.Scanner;

public class Price1 {
    public static void main(String[] args) {
        Price_num price = new Price_num();
        Scanner sin = new Scanner(System.in);
        System.out.println("enter the flowerid:");
        int flowerid = sin.nextInt();
        System.out.println("enter the flowercolour:");
        String flowercolor = sin.next();
        System.out.println("enter the flowername :");
        String flowerName = sin.next();
        Price pri = new Price();
        pri.setFlowercolor(flowercolor);
        pri.setFlowerid(flowerid);
        pri.setFlowerName(flowerName);
        price.insert(pri);
        price.display();
        System.out.println("enter flowerid to be updated");
        int flowerid1 = sin.nextInt();
        System.out.println("enter flowername to be updated");
        String flowername = sin.next();
        price.update(flowerid1, flowername);
        price.display();
    }
}
