package DigitalCom_ass;

import java.util.ArrayList;

public class GameService {

    private static ArrayList<Game> staticGames;

    static {

        staticGames = new ArrayList<>();  

        staticGames.add(new Game("SnowBird","Danny",300));
        staticGames.add(new Game("FreshFood","Ram",450));
        staticGames.add(new Game("Batsman","Kate",400));
        staticGames.add(new Game("Pokiman","Steeve",600));
        staticGames.add(new Game("YammyTommy","Narayan",350));
    }

    public ArrayList<Game> viewAll() {
        return staticGames;
    }

    public String AuthorSearch(String author) {

        for(Game g : staticGames) {

            if(g.getAuthorName().equals(author)) {   
                return g.getGameName();
            }
        }
        return "No Game Found";
    }
}