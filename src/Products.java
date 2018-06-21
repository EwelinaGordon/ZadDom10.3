import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Products {

    public static void main(String[] args) {
        File file = new File("File.txt");
        Product[] products = new Product[numberOfLines(file)];
        ProductInfo productInfo = new ProductInfo();
        int i = 0;
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] splittedLine = line.split(";");
                Product prd = new Product(splittedLine[0], splittedLine[1], Integer.valueOf(splittedLine[2]));
                products[i] = prd;
                i++;
              }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(products));

        System.out.println("Suma wszystkich produktow: "+ productInfo.sumPrice(products));
        System.out.println("Nazwa najdrozszych produktow: " + productInfo.mostExpensiveProductName(products));
        }

        private static int numberOfLines(File file){
        int i = 0;
            try {
                Scanner scn = new Scanner(file);
                while (scn.hasNextLine()) {
                    scn.nextLine();
                    i++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Plik nie został znaleziony");;
            }
        return i;
        }

    }

