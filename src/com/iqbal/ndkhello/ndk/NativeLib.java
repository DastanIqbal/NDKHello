package com.iqbal.ndkhello.ndk;

public class NativeLib {

	/**
	 * Load libhello.so library
	 */
	static {
		System.loadLibrary("hello");
	}

	/**
	 * declared jni function
	 * @return String
	 */
	public static native String getHello();
}
