import mindustry.net.*;
import mindustry.gen.*;
import arc.*;
import arc.util.*;

public class BotClient extends mindustry.mod.Plugin {

    String message = "Привет!"; // сюда пишешь своё сообщение

    @Override
    public void init() {
        Events.on(mindustry.game.EventType.ClientLoadEvent.class, e -> {
            // подключаемся к серверу
            Vars.net.connect("45.61.49.88:5500", 6567, () -> {
                Timer.schedule(() -> {
                    Call.sendChatMessage(message);
                }, 2f);
            });
        });
    }
  }
