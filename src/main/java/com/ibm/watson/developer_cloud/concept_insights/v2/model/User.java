/*
 * *
 *  * Copyright 2015 IBM Corp. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.ibm.watson.developer_cloud.concept_insights.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.util.GsonSingleton;

/**
 * The Class User.
 */
public class User {

	/** The account id. */
	@SerializedName("account_id")
	private String accountId;

	/** The permission. */
	private String permission;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		User user = (User) o;

		if (accountId != null ? !accountId.equals(user.accountId) : user.accountId != null)
			return false;
		return !(permission != null ? !permission.equals(user.permission) : user.permission != null);

	}

	/**
	 * Gets the account id.
	 * 
	 * @return The accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * Gets the permission.
	 * 
	 * @return The permission
	 */
	public String getPermission() {
		return permission;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int result = accountId != null ? accountId.hashCode() : 0;
		result = 31 * result + (permission != null ? permission.hashCode() : 0);
		return result;
	}

	/**
	 * Sets the account id.
	 * 
	 * @param accountId
	 *            The account_id
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * Sets the permission.
	 * 
	 * @param permission
	 *            The permission
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " " + GsonSingleton.getGson().toJson(this);
	}

	/**
	 * With account id.
	 * 
	 * @param accountId
	 *            the account id
	 * @return the user
	 */
	public User withAccountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * With permission.
	 * 
	 * @param permission
	 *            the permission
	 * @return the user
	 */
	public User withPermission(String permission) {
		this.permission = permission;
		return this;
	}
}
