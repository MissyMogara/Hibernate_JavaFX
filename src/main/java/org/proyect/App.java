package org.proyect;

import jakarta.transaction.Transactional;
import org.proyect.entities.VideoGame;
import org.proyect.entities.Player;
import org.proyect.repositories.PlayerRepository;

public class App {
    @Transactional
    public static void main(String[] args) {

        //Create repository
        PlayerRepository playerRepository = new PlayerRepository();

        Player player1 = new Player("Miqota","Miqotilla","MiqoMiqo@gmail.com","Spanish","Spain");

        VideoGame videoGame1 = new VideoGame("OW2","Steam",12);

        player1.setFavoriteVideoGame(videoGame1);

        //Close repository
        playerRepository.closeSession();

    }
}
