package com.book;

public class InvalidBookException extends Exception {
		String msg;

		public InvalidBookException(String msg) {

			super(msg);
			this.msg = msg;

		}

}
