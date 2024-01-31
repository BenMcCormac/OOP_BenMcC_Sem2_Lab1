package ie.atu.productv5;

import ie.atu.productv5.Book;
import ie.atu.productv5.Software;
import ie.atu.productv5.Musi;
import ie.atu.productv5.TV;

public class ProductDB {
    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data


        Product myProduct = null;
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        if (productCode.equalsIgnoreCase("java")) {
            Musi myMusi = new Musi();
            myMusi.setCode(productCode);
            myMusi.setDescription("ATU Java Programming");
            myMusi.setPrice(57.50);
            myMusi.setArtist("Joe Brown");
            myMusi.setLabel("vrgb");
            myProduct = myMusi;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Musi myMusi = new Musi();
            myMusi.setCode(productCode);
            myMusi.setDescription("Java Servlets and JSP");
            myMusi.setPrice(57.50);
            myMusi.setArtist("Mike White");
            myMusi.setLabel("fwrueyig");
            myProduct = myMusi;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Musi myMusi = new Musi();
            myMusi.setCode(productCode);
            myMusi.setDescription("Lennon's MySQL");
            myMusi.setPrice(54.50);
            myMusi.setArtist("Jim Lennon");
            myMusi.setLabel("vgewyuew");
            myProduct = myMusi;
        }

        if (productCode.equalsIgnoreCase("jav")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
        } else if (productCode.equalsIgnoreCase("js")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
        } else if (productCode.equalsIgnoreCase("mysq")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
        }

        if (productCode.equalsIgnoreCase("studios")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Oil");
            myTV.setPrice(57.50);
            myTV.setManufature("Cisco");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        return myProduct;
    }
}

