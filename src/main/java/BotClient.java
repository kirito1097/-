import mindustry.Vars;
import mindustry.net.*;
import mindustry.gen.*;
import arc.*;
import arc.util.*;

public class BotClient extends mindustry.mod.Plugin {

    String message = "Привет!";

    @Override
    public void init() {
        Events.on(mindustry.game.EventType.ClientLoadEvent.class, e -> {
            Vars.net.connect("45.61.49.88", 5500, () -> {
                Timer.schedule(() -> {
                    Call.sendChatMessage(message);
                }, 2f);
            });
        });
    }
}
