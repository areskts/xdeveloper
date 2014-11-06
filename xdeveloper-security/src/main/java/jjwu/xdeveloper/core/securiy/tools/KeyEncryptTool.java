package jjwu.xdeveloper.core.securiy.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jjwu.xdeveloper.core.securiy.key.MasterKeyUtil;

import org.jasypt.util.text.BasicTextEncryptor;

public class KeyEncryptTool {
	public static void main(String[] args) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(MasterKeyUtil.getMasterKey());

		System.out.print("Please Input Key:");

		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while ((line = d.readLine()).length() != 0) {
				if (line.length() == 0)
					continue;
				String newPassword = textEncryptor.encrypt(line);

				System.out.println("Encrypted Key:" + newPassword);

				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}