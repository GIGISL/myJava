package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {


        Book ham = new Book();
        ham.title = "abc";
        ham.prince = 50000;
        ham.company = "유한양행";
        ham.author = "해밍웨이";
        ham.page = 700;
        ham.isbn = "isbn-7000";
        System.out.println(ham.author+"\t"+ham.company+"\t"+ham.isbn+"\t"+ham.title+"\t"+ham.prince+"\t"+ham.page);


//        public  int prince;
//        public String company;
//        public String author;
//        public int page;
//        public String isbn;


    }
}
