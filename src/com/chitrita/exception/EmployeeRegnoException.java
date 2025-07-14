package com.chitrita.exception;

public class EmployeeRegnoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private long invalidRegno;
	private String message;
	public EmployeeRegnoException() {
		super();
	}
	public EmployeeRegnoException(long invalidRegno, String message) {
		super();
		this.invalidRegno = invalidRegno;
		this.message = message;
	}
	public long getInvalidRegno() {
		return invalidRegno;
	}
	public void setInvalidRegno(long invalidRegno) {
		this.invalidRegno = invalidRegno;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "EmployeeRegnoException [invalidRegno=" + invalidRegno + ", message=" + message + "]";
	}
	
}
