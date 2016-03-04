package com.mkyong;

public class Reminders {

		String reminder;
		String user;

		public String getReminder() {
			return reminder;
		}

		public void setReminder(String reminder) {
			this.reminder = reminder;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		@Override
		public String toString() {
			return "Reminders [reminder=" + reminder + ", user=" + user + "]";
		}

	}
