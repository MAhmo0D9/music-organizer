import java.util.ArrayList;

public class Run {

    public Run() {
    }

    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        pop.addFile("Love Again", "Dua lipa", "2020");
        pop.addFile("Dominator", "Dua Lipa", "2021");

        jazz.addFile("a", "b","c");
        jazz.addFile("a", "t","h");
        jazz.addFile("a", "o","d");

        rock.addFile("Test Artist1", "Test music1", "2000");
        rock.addFile("Test Artist2", "Test music2", "2001");
        rock.addFile("Test Artist3", "Test music3", "2002");
        rock.addFile("Test Artist4", "Test music4", "2003");
        rock.addFile("Test Artist5", "Test music5", "2004");

        country.addFile("Varios Artists", "Test music 6", "2005");
        country.addFile("Varios Artists", "Test music 7", "2006");
        country.addFile("Varios Artists", "Test music 8", "2007");
        country.addFile("Varios Artists", "Test music 9", "2008");
        country.addFile("Varios Artists", "Test music 10", "2009");
        country.addFile("Varios Artists", "Test music 11", "2010");
        country.addFile("Varios Artists", "Test music 12", "2011");




    }


}