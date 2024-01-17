#include "HelloNative.h"
#include <stdio.h>
#include <jni.h>

JNIEXPORT void JNICALL Java_HelloNative_greeting(JNIEnv* env, jclass cl) {
    printf("Hello Native World!\n");
}
