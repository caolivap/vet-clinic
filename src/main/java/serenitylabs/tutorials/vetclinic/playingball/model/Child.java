package serenitylabs.tutorials.vetclinic.playingball.model;

import static serenitylabs.tutorials.vetclinic.playingball.model.Game.*;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import javafx.scene.media.AudioClip;
import javax.naming.NotContextException;

public class Child {

    private PlayTennis playTennis = new PlayTennis();

    public void goPlay(Game game) {
        Player gameToPlay = gameCalled(game);
        gameToPlay.play();
    }

    private Player gameCalled(Game game) {
        switch (game){
            case Football:
                return new PlayFootball();
            case Tennis:
                return new PlayTennis();
            case Cricket:
                return new PlayCricket();
            case Handball:
                return new PlayHandball();
            case Hockey:
                return new PlayHockey();
             default:
                 return null;
        }
    }
}
