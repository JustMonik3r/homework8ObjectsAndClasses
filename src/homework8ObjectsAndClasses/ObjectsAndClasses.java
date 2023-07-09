package homework8ObjectsAndClasses;

public class ObjectsAndClasses {
    public static void main(String[] args) {
        Author andrzejSapkowski = new Author("Анджей", "Сапковский");
        Author benCounter = new Author("Бен", "Каунтер");
        Book kreshenieOgnem = new Book("Крещение огнем", andrzejSapkowski, 1995);
        kreshenieOgnem.setReleaseYear(1996);
        Book galaktikaVOgne = new Book("Галактика в огне", benCounter, 2005);
        galaktikaVOgne.setReleaseYear(2006);

        //Метод toString
        String a1 = andrzejSapkowski.toString();
        System.out.println(a1);
        String b1 = kreshenieOgnem.toString();
        System.out.println(b1);
        System.out.println();

        String a2 = benCounter.toString();
        System.out.println(a2);
        String b2 = galaktikaVOgne.toString();
        System.out.println(b2);
        System.out.println();

        //Метод equals
        System.out.println(kreshenieOgnem.equals(galaktikaVOgne));
        Book bashnyaLastochki = new Book("Башня Ласточки", andrzejSapkowski, 1997);
        System.out.println(kreshenieOgnem.equals(bashnyaLastochki));
        Book galaxyInFlames = new Book("Галактика в огне", benCounter, 2005);
        System.out.println(galaktikaVOgne.equals(galaxyInFlames));

    }
}
