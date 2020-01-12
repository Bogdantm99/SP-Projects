package My;
//import java.util.ArrayList;

public class Main {
    //public static void main(String []args) {


	/*Book diseaTitanic = new Book("Disea Titanic");
	Author OnetiuBogdan = new Author("Onetiu Bogdan");
	diseaTitanic.addAuthor(OnetiuBogdan);
	int indexOfChapter = diseaTitanic.createChapter("Chapter1");
	Chapter chpOne = diseaTitanic.getChapter(indexOfChapter);
	int IndexOfSubchapter = chpOne.createSubChapter("Chapter One One");
	SubChapter chpOneOne = chpOne.getSubChapter(IndexOfSubchapter);
	//int IndexOfParagraph = chpOneOne.createParagraph("Paragraph1");
	//int IndexOfImage = chpOneOne.createImage("Image1");
	//int IndexOfTable = chpOneOne.createTable("Table1");

	chpOneOne.createParagraph("Paragraful 1");
	chpOneOne.createParagraph("Paragraful 2");
	chpOneOne.createParagraph("Paragraful 3");
	chpOneOne.createImage("Image 1");
	chpOneOne.createParagraph("Paragraph 4");
	chpOneOne.createTable("Table 1");
	chpOneOne.createParagraph("Paragraph 5");


	chpOneOne.print();*/


	/*public static void main(String[] args) throws Exception {
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila......"));
		noapteBuna.addContent(cap1);

		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from subchapter 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Image("Image subchapter 1.1.1.1"));

		noapteBuna.print();
}*/

	/*public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		ImageProxy img1 = new ImageProxy("Pamela Anderson");
		ImageProxy img2 = new ImageProxy("Kim Kardashian");
		ImageProxy img3 = new ImageProxy("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		Section pla}yboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		Book playboy = new Book("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds");

	}*/

	/*public static void main(String[] args) throws Exception {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();}

	public static void main(String[] args) throws Exception {
		/*Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
		Element myBook = jsonBuilder.getResult();
		myBook.print();
	}

}*/

/*public class Main {

    public static void main(String[] args) {

        Book Titanic = new Book("Titanic");
        Author rPaul = new Author("Radu Paul");
        Titanic.addAuthor(rPaul);

        //region Composite Pattern
        /*Section chpt1 = new Section("Chapter 1");
        Section chpt11 = new Section("Chapter 1.1");
        Section chpt111 = new Section("Chapter 1.1.1");
        Section chpt1111 = new Section("Chapter 1.1.1.1");
        Titanic.AddContent(new Paragraph("Paragraph pentru carte"));
        Titanic.AddContent(chpt1);
        chpt1.AddElement(new Paragraph("Moto capitol"));
        chpt1.AddElement(chpt11);
        chpt11.AddElement(new Paragraph("Text from SubChapter 1.1"));
        chpt11.AddElement(chpt111);
        chpt111.AddElement(new Paragraph("Text from subchapter 1.1.1"));
        chpt111.AddElement(chpt1111);
        chpt1111.AddElement(new Image("Image from subchapter 1.1.1.1"));
        Titanic.Print();*/
    //endregion

    //region Proxy Pattern

        /*
        long StartTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Image 1");
        ImageProxy img2 = new ImageProxy("Image 2");
        ImageProxy img3 = new ImageProxy("Image 3");
        Section section1 = new Section("Section 1");
        section1.AddElement(img1);
        Section section2 = new Section("Section 2");
        section2.AddElement(img2);
        section2.AddElement(img3);
        Book book1 = new Book("Book 1");
        book1.AddContent(section1);
        book1.AddContent(section2);
        long EndTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (EndTime - StartTime) + " miliseconds");
        StartTime = System.currentTimeMillis();
        section1.print();
        EndTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (EndTime - StartTime) + " miliseconds");
        StartTime = System.currentTimeMillis();
        section1.print();
        EndTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (EndTime - StartTime) + " miliseconds");
        */
    //endregion

    //region Strategy Pattern
        /*
        Section cap1 = new Section("Capitol 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.AddElement(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.AddElement(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.AddElement(p3);
        System.out.println("Printare fara align: ");
        cap1.print();
        System.out.println("Printare cu align: ");
        p1.SetStrategy(new AlignLeft());
        p2.SetStrategy(new AlignCenter());
        p3.SetStrategy(new AlignRight());
        cap1.print();
        */
    //endregion

    //region Visitor Pattern

        /*
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.AddElement(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.AddElement(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.AddElement(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.AddElement(p4);
        cap1.AddElement(new ImageProxy("ImageOne"));
        cap1.AddElement(new Image("ImageTwo"));
        cap1.AddElement(new Paragraph("Some text"));
        cap1.AddElement(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.Accept(stats);
        stats.PrintStatistics();
        */
    //endregion

    //region Builder Pattern

        /*Builder jsonBuilder = new JSONBuilder();
        jsonBuilder.Build();
        Element myBook = jsonBuilder.getResult();
        myBook.print();*/

    //endregion


  /*  public static void main(String[] args) throws Exception {
        Command cmd1 = new OpenCommand("book.json");
        cmd1.execute();
        Command cmd2 = new StatisticsCommand();
        cmd2.execute();
        DocumentManager.getInstance().getBook().Print();
    }*/
  public static void main(String[] args) throws Exception {
     /* Section cap1 = new Section("Capitolul 1");
      Paragraph p1 = new Paragraph("Paragraph 1");
      cap1.add(p1);
      Paragraph p2 = new Paragraph("Paragraph 2");
      cap1.add(p2);
      Paragraph p3 = new Paragraph("Paragraph 3");
      cap1.add(p3);
      Paragraph p4 = new Paragraph("Paragraph 4");
      cap1.add(p4);
      cap1.add(new ImageProxy("ImageOne"));
      cap1.add(new Image("ImageTwo"));
      cap1.add(new Paragraph("Some text"));
      cap1.add(new Table("Table 1"));
      FirstObserver firstObserver = new FirstObserver();
      SecondObserver secondObserver = new SecondObserver();
      cap1.addObserver(firstObserver);
      cap1.addObserver(secondObserver);
      p1.addObserver(firstObserver);
      p1.addObserver(secondObserver);
      p2.addObserver(firstObserver);
      cap1.setNewValue("CHAPTER 1");
      p1.setNewValue("PARAGRAPH 2");
      p2.setNewValue("PARAGRAPH 3");
      cap1.removeObserver(firstObserver);
      cap1.setNewValue("CHAPTER 1.1");*/

      Section cap1 = new Section("Capitolul 1");
      cap1.add(new Paragraph("Moto capitol"));
      cap1.add(new Paragraph("Another One"));
      cap1.add(new Paragraph("Another Two"));
      cap1.add(new Paragraph("Another Three"));
      Book a = new Book("Carte");
      a.AddContent(cap1);
      DocumentManager.getInstance().setBook(a);
      System.out.println("Book Content: ");
      DocumentManager.getInstance().getBook().Print();

      new DeleteCommand().execute();
      System.out.println("Book Content after the first delete: ");
      DocumentManager.getInstance().getBook().Print();
      new DeleteCommand().execute();
      System.out.println("Book Content after the second delete: ");
      DocumentManager.getInstance().getBook().Print();
      /*Command undoCommand = new UndoCommand();
      undoCommand.execute();
      System.out.println("Book Content after first undo: ");
      DocumentManager.getInstance().getBook().Print();
      undoCommand.execute();
      System.out.println("Book Content after second undo: ");
      DocumentManager.getInstance().getBook().Print();*/
  }
}