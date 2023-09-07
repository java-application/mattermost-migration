/*
 *	Copyright 2016 Naver Corp.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.navercorp.mattermost.migration.domains;

import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Users {
	private String Id;
	private BigInteger CreateAt;
	private BigInteger UpdateAt;
	private BigInteger DeleteAt;
	private String Username;
	private String Password;
	private String AuthData;
	private String AuthService;
	private String Email;
	private boolean EmailVerified;
	private String Nickname;
	private String FirstName;
	private String LastName;
	private String Roles;
	private BigInteger LastActivityAt;
	private BigInteger LastPingAt;
	private boolean AllowMarketing;
	private String Props;
	private String NotifyProps;
	private String ThemeProps;
	private BigInteger LastPasswordUpdate;
	private BigInteger LastPictureUpdate;
	private Long FailedAttempts;
	private String Locale;
	private boolean MfaActive;
	private String MfaSecret;

}
