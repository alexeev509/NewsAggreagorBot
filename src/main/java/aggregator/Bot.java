package aggregator;

import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingCommandBot {

    private static final String TOKEN = "5421373004:AAHDCYUAxc_6GSTOcPfUkBsFLQt3HzOElzw";
    private static final String BOT_USER_NAME = "NewsAggregatorReal_bot";

    public Bot() {
        super();
        register(new StartCommand("start", "Старт"));
    }

    @Override
    public String getBotUsername() {
        return BOT_USER_NAME;//System.getenv("username");
        //return BOT_USER_NAME;
    }

    @Override
    public String getBotToken() {
        return TOKEN;//System.getenv("token");
        //return TOKEN;
    }

    @Override
    public void processNonCommandUpdate(Update update) {
        System.out.println("fffffff");
        System.out.println(update.getMessage().getText());
        String chatId = String.valueOf(update.getMessage().getChatId());

        SendMessage sm = new SendMessage(chatId, "Write command please");

        try {
            execute(sm);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
