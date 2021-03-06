/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_healthme_jni_ECGInterface */

#ifndef _Included_com_healthme_jni_ECGInterface
#define _Included_com_healthme_jni_ECGInterface
#ifdef __cplusplus
extern "C" {
#endif
#undef com_healthme_jni_ECGInterface_EVENT_DONE
#define com_healthme_jni_ECGInterface_EVENT_DONE 0L
#undef com_healthme_jni_ECGInterface_EVENT_FAILED
#define com_healthme_jni_ECGInterface_EVENT_FAILED 1L
/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    analyzeEcgDataFile
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_healthme_jni_ECGInterface_analyzeEcgDataFile
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    aroundSearchQrs
 * Signature: (Ljava/lang/String;[IDI)[I
 */
JNIEXPORT jintArray JNICALL Java_com_healthme_jni_ECGInterface_aroundSearchQrs
  (JNIEnv *, jobject, jstring, jintArray, jdouble, jint);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    searchQrsByExample
 * Signature: (Ljava/lang/String;I[II)[I
 */
JNIEXPORT jintArray JNICALL Java_com_healthme_jni_ECGInterface_searchQrsByExample
  (JNIEnv *, jobject, jstring, jint, jintArray, jint);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    checkLicence
 * Signature: (Ljava/lang/String;Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_healthme_jni_ECGInterface_checkLicence
  (JNIEnv *, jobject, jstring, jstring);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    filterData
 * Signature: (Ljava/lang/String;[II)I
 */
JNIEXPORT jint JNICALL Java_com_healthme_jni_ECGInterface_filterData
  (JNIEnv *, jobject, jstring, jintArray, jint);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    getEvents
 * Signature: (Ljava/lang/String;[I)[Lcom/healthme/jni/Event;
 */
JNIEXPORT jobjectArray JNICALL Java_com_healthme_jni_ECGInterface_getEvents
  (JNIEnv *, jobject, jstring, jintArray);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    checkAnnotationsByRange
 * Signature: (Ljava/lang/String;[II)[I
 */
JNIEXPORT jintArray JNICALL Java_com_healthme_jni_ECGInterface_checkAnnotationsByRange
  (JNIEnv *, jobject, jstring, jintArray, jint);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    checkAnnotationsByPos
 * Signature: (Ljava/lang/String;[IILjava/lang/String;)[I
 */
JNIEXPORT jintArray JNICALL Java_com_healthme_jni_ECGInterface_checkAnnotationsByPos
  (JNIEnv *, jobject, jstring, jintArray, jint, jstring);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    compareAnnotationsByType
 * Signature: (Ljava/lang/String;I[ILjava/lang/String;)[I
 */
JNIEXPORT jintArray JNICALL Java_com_healthme_jni_ECGInterface_compareAnnotationsByType
  (JNIEnv *, jobject, jstring, jint, jintArray, jstring);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    calcAverageHeartRate
 * Signature: (Ljava/lang/String;[II)I
 */
JNIEXPORT jint JNICALL Java_com_healthme_jni_ECGInterface_calcAverageHeartRate
  (JNIEnv *, jobject, jstring, jintArray, jint);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    compareNormalAnnByPercentage
 * Signature: (Ljava/lang/String;IFLjava/lang/String;)[I
 */
JNIEXPORT jintArray JNICALL Java_com_healthme_jni_ECGInterface_compareNormalAnnByPercentage
  (JNIEnv *, jobject, jstring, jint, jfloat, jstring);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    smartCheckQRSByPos
 * Signature: (Ljava/lang/String;[II)[I
 */
JNIEXPORT jintArray JNICALL Java_com_healthme_jni_ECGInterface_smartCheckQRSByPos
  (JNIEnv *, jobject, jstring, jintArray, jint);

/*
 * Class:     com_healthme_jni_ECGInterface
 * Method:    calculateHeartRate
 * Signature: ([B[I)[I
 */
JNIEXPORT jintArray JNICALL Java_com_healthme_jni_ECGInterface_calculateHeartRate
  (JNIEnv *, jobject, jbyteArray, jintArray);

#ifdef __cplusplus
}
#endif
#endif
