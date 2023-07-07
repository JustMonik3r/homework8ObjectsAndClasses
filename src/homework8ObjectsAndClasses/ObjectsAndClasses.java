package homework8ObjectsAndClasses;

public class ObjectsAndClasses {
    public static void main(String[] args) {
        Author andrzejSapkowski = new Author("Анджей", "Сапковский");
        Author benCounter = new Author("Бен", "Каунтер");
        Book kreshenieOgnem = new Book("Крещение огнем", andrzejSapkowski, 1995);
        kreshenieOgnem.setReleaseYear(1996);
        Book galaktikaVOgne = new Book("Галактика в огне", benCounter, 2005);
        galaktikaVOgne.setReleaseYear(2006);

        System.out.println(kreshenieOgnem.getTitle());
        System.out.println(galaktikaVOgne.getTitle());
    }
}
