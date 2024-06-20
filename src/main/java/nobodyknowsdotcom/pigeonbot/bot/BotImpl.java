package nobodyknowsdotcom.pigeonbot.bot;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import nobodyknowsdotcom.pigeonbot.config.BotConfig;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@Slf4j
public class BotImpl extends TelegramLongPollingBot {

    private final BotConfig config;

    public BotImpl(BotConfig config) {
        super(config.getToken());
        this.config = config;
        log.info("Token is {}", config.getToken());
        log.info("Name is {}", config.getName());
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {

        if (!update.hasMessage()) {
            log.info("Update without message, wtf? Don't support this.");
            return;
        }

        execute(new SendMessage(update.getMessage().getChatId().toString(), update.getMessage().getText()));
    }

    @Override
    public String getBotUsername() {
        return config.getName();
    }
}
