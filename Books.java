public class Books{
    
        public static void main(String[]arg){
            Book1 b = new Book1("Java Programming", "John Smith", 2021,39.00);

            System.out.println("Title: " + b.title);
            System.out.println("Author: "+ b.author);
            System.out.println("Year Published: "+ b.yearPublished);
            System.out.println("Price: "+ "$" + b.price);
            System.out.println();

            Book2 b2 = new Book2 ("Python Basic", "Jane Doe", 2020,29.99);

            System.out.println("Title: " + b2.titlee);
            System.out.println("Author: "+ b2.authorr);
            System.out.println("Year Published: "+ b2.yearPublishedd);
            System.out.println("Price: "+ "$" + b2.pricee);
             System.out.println();

            Book3 b3 = new Book3 ("C++ Essential", "Micahel Johnson", 2019,49.99);
            System.out.println("Title: " + b3.titles);
            System.out.println("Author: "+ b3.authors);
            System.out.println("Year Published: "+ b3.yearPublisheds);
            System.out.println("Price: "+ "$" + b3.prices);
            System.out.println();
}
}

