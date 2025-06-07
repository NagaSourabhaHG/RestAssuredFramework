package com.api.models.request;

public class UserUpdateRequest {

	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "UserUpdateRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	private UserUpdateRequest(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		private String email;
		private String mobileNumber;

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lasttName) {
			this.lastName = lasttName;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}

		public UserUpdateRequest build() {
			UserUpdateRequest updaterequest = new UserUpdateRequest(firstName, lastName, email, mobileNumber);
			return updaterequest;
		}

	}

}
