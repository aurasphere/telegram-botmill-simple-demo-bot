/**
 * 
 */
package co.aurasphere.botmill.demo.echobot.behavior;

import co.aurasphere.botmill.telegram.AbstractTelegramBot;
import co.aurasphere.botmill.telegram.TelegramBotMillContext;
import co.aurasphere.botmill.telegram.autoreply.EchoAutoReply;
import co.aurasphere.botmill.telegram.event.message.AnyMessageEvent;

/**
 * The Class EchoBotBehavior.
 */
public class EchoBotBehavior extends AbstractTelegramBot {
	
	// Get your bot token from the BotFather.
	private String botToken;

	public void defineBehavior() {
		TelegramBotMillContext
				.getInstance()
				.setBotToken(botToken);

		addActionFrame(new AnyMessageEvent(), new EchoAutoReply());

	}

}
