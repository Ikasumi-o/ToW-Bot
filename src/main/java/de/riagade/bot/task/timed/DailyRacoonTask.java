package de.riagade.bot.task.timed;

import de.riagade.bot.FabiAlertDiscordBot;
import de.riagade.bot.task.feedback.RacoonTask;
import de.riagade.genericDiscordBot.A_FeedbackTask;
import de.riagade.genericDiscordBot.A_TimedTask;

public class DailyRacoonTask extends A_TimedTask {
    /**
     * @param cronExpression the cron expression to calculate the next execution
     */
    public DailyRacoonTask(FabiAlertDiscordBot bot, String cronExpression) {
        super(bot, cronExpression);
    }

    @Override
    public A_FeedbackTask createFeedbackTask() {
        return new RacoonTask((FabiAlertDiscordBot) getBot());
    }
}
