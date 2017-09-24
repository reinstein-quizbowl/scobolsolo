package com.scobolsolo.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.Validate;

import com.opal.ImplicitTableDatabaseQuery;
import com.opal.LocalDateCache;

import com.scobolsolo.persistence.MessageUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link MessageFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Message extends MessageUserFacing {
	public static final String DATE_PATTERN = "EE MMMM d";
	public static final String TIME_PATTERN = "h:mm:ss a";
	public static final DateTimeFormatter TIMESTAMP_FORMATTER_WITH_DATE = DateTimeFormatter.ofPattern(DATE_PATTERN + ' ' + TIME_PATTERN);
	public static final DateTimeFormatter TIMESTAMP_FORMATTER_WITHOUT_DATE = DateTimeFormatter.ofPattern(TIME_PATTERN);
	
	default public boolean isUnread() {
		return getAcknowledgedTimestamp() == null;
	}
	
	default public Account getSender() {
		return getFromAccount();
	}
	
	default public Account getRecipient() {
		return getToAccount();
	}
	
	public static String format(final LocalDateTime argTimestamp) {
		Validate.notNull(argTimestamp);
		
		if (argTimestamp.toLocalDate().equals(LocalDateCache.today())) {
			return TIMESTAMP_FORMATTER_WITHOUT_DATE.format(argTimestamp);
		} else {
			return TIMESTAMP_FORMATTER_WITH_DATE.format(argTimestamp);
		}
	}
	
	public static List<Message> getConversation(final Account argFrom, final Account argTo) {
		Validate.notNull(argFrom);
		Validate.notNull(argTo);
		
		return MessageFactory.getInstance().acquireForQuery(
			new ArrayList<>(),
			new ImplicitTableDatabaseQuery(
				"from_account_id = ? AND to_account_id = ? AND archived = false ORDER BY sent_timestamp",
				argFrom.getIdAsObject(), argTo.getIdAsObject()
			)
		);
	}
}
