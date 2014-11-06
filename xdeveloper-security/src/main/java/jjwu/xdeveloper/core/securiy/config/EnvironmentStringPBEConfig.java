package jjwu.xdeveloper.core.securiy.config;

import jjwu.xdeveloper.core.securiy.key.MasterKeyUtil;

public class EnvironmentStringPBEConfig extends org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig {
	public EnvironmentStringPBEConfig() {
		setAlgorithm("PBEWithMD5AndDES");
		setPassword(MasterKeyUtil.getMasterKey());
	}
}