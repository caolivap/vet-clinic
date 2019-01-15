package serenitylabs.tutorials.vetclinic.playingball.model;

import static serenitylabs.tutorials.vetclinic.playingball.model.Game.*;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import javafx.scene.media.AudioClip;
import javax.naming.NotContextException;

public class Child {

    private PlayTennis playTennis = new PlayTennis();

    public void goPlay(Game game) {
        Player gameToPlay = PlayerForGame.called(game);
        gameToPlay.play();
    }
}
