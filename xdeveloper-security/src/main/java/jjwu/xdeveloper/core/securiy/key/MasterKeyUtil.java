package jjwu.xdeveloper.core.securiy.key;

import org.jasypt.util.text.BasicTextEncryptor;

public class MasterKeyUtil {
	public static String getMasterKey() {
		return "jTv7lQ&Sm+8:DEN'+%GR";
	}

	public static String encKey(String src) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(getMasterKey());
		return textEncryptor.encrypt(src);
	}

	public static String decKey(String src) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(getMasterKey());
		return textEncryptor.decrypt(src);
	}
		
	public static void main(String[] args) {
		
//		System.out.println(MasterKeyUtil.encKey("service1234"));
		System.out.println(MasterKeyUtil.decKey("hkCunKrW4vA5YFkz2Ie4pNtOfXdGz7SZ"));
//		System.out.println(MasterKeyUtil.decKey("TDJ7yupTMKkVHvsZjWqh4IHcCggI2RsLG0HrjfhHbErOdfSDdWD3jNJmfb8B7zAd"));
		//yaBJ6pMKYsOSFxyg0jjah4kIuu9Yk4ZJPJOZkn9YqbY=
		
		
	}
}