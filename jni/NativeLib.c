#include"NativeLib.h"

JNIEXPORT jstring JNICALL Java_com_iqbal_ndkhello_ndk_NativeLib_getHello
  (JNIEnv *env, jclass clz){
	return (*env)->NewStringUTF(env,"Hello World");
}
