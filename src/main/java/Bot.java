import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingCommandBot {

    //private static final String TOKEN = "5421373004:AAHDCYUAxc_6GSTOcPfUkBsFLQt3HzOElzw";
    //private static final String BOT_USER_NAME = "NewsAggregatorReal_bot";

    public Bot() {
        super();
        //register(new StartCommand("start", "Старт"));
    }

    @Override
    public String getBotUsername() {
        return System.getenv("username");
        //return BOT_USER_NAME;
    }

    @Override
    public String getBotToken() {
        return System.getenv("token");
        //return TOKEN;
    }

    @Override
    public void processNonCommandUpdate(Update update) {
        System.out.println("fffffff");
        System.out.println(update.getMessage().getText());
    }
}
